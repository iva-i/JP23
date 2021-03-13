package tasks12;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	/**
	 * Write a program that prompts the user to enter an integer between 1 and 12
	 * and then displays the months and its number of days corresponding to the
	 * integer entered. Your program should display “wrong number” if the user
	 * enters a wrong number by catching ArrayIndexOutOfBoundsException.
	 */
	public ArrayIndexOutOfBoundsException() {

		Scanner input = new Scanner(System.in);

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("Enter an integer between 1 and 12: ");
		
		int num = input.nextInt()-1;
		
		try {
			
			System.out.printf("Month of a given number is %s. \n Number of days in a given month is: %d.", months[num], dom[num]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Wrong number!");
			System.exit(1);
		}

		input.close();
	}

	public static void main(String[] args) {

		new ArrayIndexOutOfBoundsException();

	}

}
