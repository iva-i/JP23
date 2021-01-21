package tasks;

import java.util.*;

public class QuadraticEquationTest {

	public static void main(String[] args) {
		/**
		 * Write a test program that prompts the user to enter values for a, b, and c
		 * and displays the result based on the discriminant. If the discriminant is
		 * positive, display the two roots. If the discriminant is 0, display the one
		 * root. Otherwise, display “The equation has no roots.”
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter values of a, b and c: ");

		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();

		input.close();

		QuadraticEquation eq = new QuadraticEquation(a, b, c);

		if (eq.getDiscriminant() > 0) {
			System.out.println("Roots are given by: " + eq.getRoot1() + " " + eq.getRoot2());
		} else if (eq.getDiscriminant() == 0) {
			System.out.println("One root is: " + eq.getRoot1());
		} else {
			System.out.println("The equation has no roots.");
		}

	}

}
