package tasks;

import java.util.Scanner;

public class Task2005 {
	public static void main(String[] args) {
		// (Financial application: calculate tips) Write a program that reads the
		// subtotal
		// and the gratuity rate and then computes the gratuity and total. For example,
		// if the
		// user enters 10 for subtotal and 12% for gratuity rate, the program displays
		// $1.2
		// as gratuity and $11.2 as total.

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter subtotal and gratuity rate: ");

		double sub = input.nextDouble(), rate = input.nextDouble();

		double grat = sub * (rate / 100), total = sub + grat;

		System.out.printf("Gratuity is %.2f and total is %.2f ", grat, total);

	}

}
