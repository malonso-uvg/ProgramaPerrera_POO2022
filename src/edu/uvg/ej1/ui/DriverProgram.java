/**
 * 
 */
package edu.uvg.ej1.ui;

import edu.uvg.ej1.model.Dog;
import edu.uvg.ej1.model.Friend;

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
		System.out.println("Prueba");
	}


	public void ShowDogData(Dog perro) {
		System.out.println("Printing dog Data B)\nPress SPACE to show data");
		Scanner SAOPAPU = new Scanner(System.in);
		SAOPAPU.nextLine();
		System.out.println("The dog name is:" + perro.getName());
		System.out.println("The breed is:" + perro.getBreed());
		System.out.println("The weight is:" + perro.getWeight());
		System.out.println("The dog primary color is:" + perro.getPrimaryColor());
		System.out.println("The dog second color is:" + perro.getSecondaryColor());
	}

	public void ShowFriendData(Friend amigo) {
		System.out.println("Printing Friend Data B)\nPress SPACE to show data");
		Scanner TACOGHOULPAPU = new Scanner(System.in);
		TACOGHOULPAPU.nextLine();
		System.out.println("The friend actual money name is:" + amigo.getActualMoney());
		System.out.println("The friend's dog is lost: " + amigo.isDogIsLost());
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
		
		dog = new Dog(name, breed, primaryColor);

		dog.setName(name);
		dog.setBreed(breed);
		dog.setPrimaryColor(primaryColor);
		entrada.close();
		return dog;
	}
	
	public static Friend enterFriendData(){
		boolean isLost;
		Friend amigo;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cual es tu nombre?");
		String name = entrada.nextLine();
		
		
		System.out.println("Cual es tu numero de telefono?");
		int telefono = entrada.nextInt();
		
		
		System.out.println("Tu perro esta perdido? Escribe si o no");
		String perdido = entrada.nextLine();
		
		amigo = new Friend(name, telefono);
		
		if (perdido == "si") {
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
