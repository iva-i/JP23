package tasks;

import java.util.Scanner;

public class LinearEquationTest {

	public static void main(String[] args) {
		/**
		 * Write a test program that prompts the user to enter a, b, c, d, e, and f and
		 * displays the result. If ad - bc is 0, report that “The equation has no
		 * solution.” 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter values: ");

		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble(), d = input.nextDouble(),
				e = input.nextDouble(), f = input.nextDouble();
		
		input.close();
		
		LinearEquation eq = new LinearEquation(a, b, c, d, e, f);
		
		if(eq.isSolvable()) {
			System.out.println("x=" + eq.getX() + ", y=" + eq.getY());
		}else {
			System.out.println("The equation has no solution.");
		}
		

	}

}
