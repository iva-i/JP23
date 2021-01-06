package tasks;

import java.util.Scanner;

public class Task2003 {
	public static void main(String[] args) {
		// (Convert meters into feet) Write a program that reads a number in meters,
		// converts
		// it to feet, and displays the result. One meter is 3.2786 feet.

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter meters: ");

		double m = input.nextDouble();

		double feet = m * 3.2786;

		System.out.println("value in feet is " + feet);

	}
}
