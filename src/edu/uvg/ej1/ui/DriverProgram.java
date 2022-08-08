/**
 * 
 */
package edu.uvg.ej1.ui;

import edu.uvg.ej1.model.Dog;

import edu.uvg.ej1.model.Friend;

import java.util.Scanner;

import edu.uvg.ej1.controller.SearchMethod;
/**
 * @author MAAG
 *
 */
public class DriverProgram {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("PROGRAMA PERRERA 2022");
		
		Friend miAmigo;
		Dog lostDog;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese los datos requeridos para iniciar el programa");
		miAmigo = enterFriendData(in);
		lostDog = enterDogData(in);
		
		String option = "";
		
		SearchMethod llamarPerrera = new SearchMethod(20, 5, 0);
		SearchMethod anuncioEnPoste = new SearchMethod(20, 10, 25);
		SearchMethod anuncioPeriodico = new SearchMethod(20, 15, 125);
		
		
		while (!option.equals("7")) {
			
			printMenu();
			
			
			option = "" + in.nextInt();
			
			switch (option) {
			case "1":{
					miAmigo = enterFriendData(in);
				}break;
					
			case "2":{
					lostDog = enterDogData(in);
				}break;
				
			case "3":{
					if (llamarPerrera.operationCanBeExecuted(miAmigo)) {
						//Si se puede ejecutar la busqueda
						if (llamarPerrera.isSuccessfulOperation(miAmigo, lostDog)) {
							//Si se encontro el perrito
							System.out.println("El perrito ha sido encontrado");
							ShowDogData(lostDog);
						} else {
							//No se encontro el perrito
							System.out.println("No se tuvo exito con la busqueda su nuevo saldo es " + miAmigo.getActualMoney());
						}
					} else { 
						//No se puede ejecutar la busqueda
						System.out.println("La busqueda no se pudo ejecutar por: " + llamarPerrera.getFailureDetails());
					}
					
				}break;
					
					
			case "4":{
				if (anuncioEnPoste.operationCanBeExecuted(miAmigo)) {
					//Si se puede ejecutar la busqueda
					if (anuncioEnPoste.isSuccessfulOperation(miAmigo, lostDog)) {
						//Si se encontro el perrito
						System.out.println("El perrito ha sido encontrado");
						ShowDogData(lostDog);
					} else {
						//No se encontro el perrito
						System.out.println("No se tuvo exito con la busqueda su nuevo saldo es " + miAmigo.getActualMoney());
					}
				} else { 
					//No se puede ejecutar la busqueda
					System.out.println("La busqueda no se pudo ejecutar por: " + anuncioEnPoste.getFailureDetails());
				}
				
			}break;
			
			case "5":{
				if (anuncioPeriodico.operationCanBeExecuted(miAmigo)) {
					//Si se puede ejecutar la busqueda
					if (anuncioPeriodico.isSuccessfulOperation(miAmigo, lostDog)) {
						//Si se encontro el perrito
						System.out.println("El perrito ha sido encontrado");
						ShowDogData(lostDog);
					} else {
						//No se encontro el perrito
						System.out.println("No se tuvo exito con la busqueda su nuevo saldo es " + miAmigo.getActualMoney());
					}
				} else { 
					//No se puede ejecutar la busqueda
					System.out.println("La busqueda no se pudo ejecutar por: " + anuncioPeriodico.getFailureDetails());
				}
				
			}break;
			
			case "6":{
				System.out.println("El dinero disponible es: " + miAmigo.getActualMoney());
			}break;
			
			case "7":{
				System.out.println("GRACIAS POR USAR EL PROGRAMA");
			}break;
			
			default:{
				System.out.println("OPCION NO VALIDA");
			}
			}
			
		}
		
	}


	public static void ShowDogData(Dog perro) {
		System.out.println("Printing dog Data B)\nPress SPACE to show data");
		System.out.println("The dog name is:" + perro.getName());
		System.out.println("The breed is:" + perro.getBreed());
		System.out.println("The weight is:" + perro.getWeight());
		System.out.println("The dog primary color is:" + perro.getPrimaryColor());
		System.out.println("The dog second color is:" + perro.getSecondaryColor());
	}

	public static void ShowFriendData(Friend amigo) {
		System.out.println("Printing Friend Data B)\nPress SPACE to show data");
		Scanner TACOGHOULPAPU = new Scanner(System.in);
		TACOGHOULPAPU.nextLine();
		System.out.println("The friend actual money name is:" + amigo.getActualMoney());
		System.out.println("The friend's dog is lost: " + amigo.isDogIsLost());
	}


	public static void printMenu(){
		System.out.println("SELECCIONE UNA OPCION");
		System.out.println("1. Ingrese un nuevo amigo");
		System.out.println("2. Ingrese un nuevo perro");
		System.out.println("3. Llamar a la perrera");
		System.out.println("4. Imprimir un anuncio");
		System.out.println("5. Publicar el anuncio en el periódico local");
		System.out.println("6. Mostrar dinero disponible");
		System.out.println("7. Salir del programa");
	}

	public static Dog enterDogData(Scanner entrada){
		Dog dog;

		System.out.println("Ingrese el nombre de su perro");
		String name = entrada.nextLine();

		System.out.println("Ingrese la raza de su perro");
		String breed = entrada.nextLine();

		System.out.println("Ingrese el color de su perro");
		String primaryColor = entrada.nextLine();
		
		dog = new Dog(name, breed, primaryColor);

		dog.setName(name);
		dog.setBreed(breed);
		dog.setPrimaryColor(primaryColor);
		return dog;
	}
	
	public static Friend enterFriendData(Scanner entrada){
		boolean isLost;
		Friend amigo;
		
		System.out.println("Cual es tu nombre?");
		String name = entrada.nextLine();
		
		
		System.out.println("Cual es tu numero de telefono?");
		int telefono = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Tu perro esta perdido? Escribe si o no");
		String perdido = entrada.nextLine();
		
		amigo = new Friend(name, telefono);
		
		if (perdido.equals("si")) {
			isLost = true;
			amigo.setDogIsLost(isLost);
		}
		else {
			isLost = false;
			amigo.setDogIsLost(isLost);
		}

		return amigo;
	}
}
