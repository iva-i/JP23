package tasks;

import java.util.Scanner;

public class Task3019 {

	public static void main(String[] args) {
		// (Compute the perimeter of a triangle) Write a program that reads
		// three edges for a triangle and computes the perimeter if the input
		// is valid. Otherwise, display that the input is invalid.
		// The input is valid if the sum of every pair of two edges is greater
		// than the remaining edge.

		Scanner input = new Scanner(System.in);

		// a,b and c are lengths of sides of a triangle
		double a, b, c;

		// input - lengths
		do {
			System.out.println("Enter lengths of the sides: ");
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
		} while (a <= 0 || b <= 0 || c <= 0);

		input.close();

		// checking out if input i valid and calculating perimeter, if possible
		if (a + b > c && a + c > b && b + c > a) {
			double perimeter = a + b + c;
			System.out.printf("The perimeter is equal to %.2f.", perimeter);
		} else {
			System.out.println("Input is not valid.");
		}

	}

}
