/**
 * 
 */
package edu.uvg.ej1.ui;

import edu.uvg.ej1.model.Dog;

import java.util.Scanner;
/**
 * @author MAAG
 *
 */
public class DriverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prueba");
	}

	public static void printMenu(){
		System.out.println("1. Ingrese un nuevo amigo");
		System.out.println("2. Ingrese un nuevo perro");
		System.out.println("3. Llamar a la perrera");
		System.out.println("4. Imprimir un anuncio");
		System.out.println("5. Publicar el anuncio en el periódico local");
		System.out.println("6. Mostrar dinero disponible");
		System.out.println("7. Salir del programa");
	}

	public static Dog enterDogData(){
		Dog dog;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el nombre de su perro");
		String name = entrada.nextLine();

		System.out.println("Ingrese la raza de su perro");
		String breed = entrada.nextLine();

		System.out.println("Ingrese el color de su perro");
		String primaryColor = entrada.nextLine();
		
		dog = new Dog(name, breed, primaryColor)

		dog.setName(name);
		dog.setBreed(breed);
		dog.setPrimaryColor(primaryColor);
		entrada.close();
	}
	
	public static enterFriendData():{
		boolean isLost;
		Friend amigo = new Friend();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cual es tu nombre?");
		String name = entrada.nextString();
		amigo.setName(name) 
		
		System.out.println("Cual es tu numero de telefono?");
		int telefono = entrada.nextInt();
		amigo.setPhone(telefono) 
		
		System.out.println("Tu perro esta perdido? Escribe si o no");
		String perdido = entrada.nextString();
		
		if (perdido == "si") {
			isLost = True;
			setDogIsLost(isLost);
		}
		else {
			isLost = False;
			setDogIsLost(isLost);
		}

}
