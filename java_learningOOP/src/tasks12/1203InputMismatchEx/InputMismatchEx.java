package tasks12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {

	/**
	 * The previous program works well as long as the user enters an integer.
	 * Otherwise, you may get another kind of exception. For instance, if you use
	 * nextInt() of Scanner, you could have an InputMismatchException. Modify it to
	 * prevent users entering anything other than an integer.
	 */

	public InputMismatchEx() {

		Scanner input = new Scanner(System.in);

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("Enter an integer between 1 and 12: ");
		
		try {
			int num = input.nextInt()-1;
			System.out.printf("Month of a given number is %s. \n Number of days in a given month is: %d.", months[num], dom[num]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Wrong number!");
			System.exit(1);
		} catch (InputMismatchException e) {
			System.out.println("Wrong input!");
			System.exit(1);
		}

		input.close();
		
	}

	public static void main(String[] args) {

		new InputMismatchEx();

	}

}
