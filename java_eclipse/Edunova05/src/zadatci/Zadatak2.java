package zadatci;

import java.util.Scanner;

public class Zadatak2 {

	/**
	 * program unosi 2 broja od korisnika program ispisuje razliku kao rez izvođenja
	 * metode koja prima 2 param tipa float
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("unesi 2 broja:");

		float a = input.nextFloat();
		float b = input.nextFloat();
		
		input.close();

		System.out.println(Zadatak2.razlika(a, b));

	}

	public static float razlika(float a, float b) {
		return a - b;
	}

}
