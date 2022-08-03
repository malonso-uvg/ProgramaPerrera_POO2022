;/**
 * 
 */
package edu.uvg.ej1.ui;

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
		System.out.println("The breed is:" + perro.getBreed(););
		System.out.println("The weight is:" + perro.getWeight(););
		System.out.println("The dog primary color is:" + perro.getPrimaryColor());
		System.out.println("The dog second color is:" + perro.getSecondColor());
	}

	public void ShowFriendData(Friend amigo) {
		System.out.println("Printing Friend Data B)\nPress SPACE to show data");
		Scanner TACOGHOULPAPU = new Scanner(System.in);
		TACOGHOULPAPU.nextLine();
		System.out.println("The friend actual money name is:" + amigo.getActualMoney());
		System.out.println("The friend's dog is lost: " + amigo.getDogIsLost(););
	}
}