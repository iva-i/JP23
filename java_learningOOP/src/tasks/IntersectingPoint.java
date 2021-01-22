package tasks;

import java.util.Scanner;

public class IntersectingPoint {

	public static void main(String[] args) {
		/**
		 * Suppose two line segments intersect. The two endpoints for the first line
		 * segment are (x1, y1) and (x2, y2) and for the second line segment are (x3,
		 * y3) and (x4, y4). Write a program that prompts the user to enter these four
		 * endpoints and displays the intersecting point. As discussed in Programming
		 * Exercise 3.25, the intersecting point can be found by solving a linear
		 * equation. Use the LinearEquation class
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter coordinates of points: ");

		double x1 = input.nextDouble(), y1 = input.nextDouble(), x2 = input.nextDouble(), y2 = input.nextDouble(),
				x3 = input.nextDouble(), y3 = input.nextDouble(), x4 = input.nextDouble(), y4 = input.nextDouble();

		input.close();

		double a = y1 - y2, b = x1 - x2, e = (y1 - y2) * x1 - (x1 - x2) * y1, c = y3 - y4, d = x3 - x4,
				f = (y3 - y4) * x3 - (x3 - x4) * y4;
		
		LinearEquation eq = new LinearEquation(a, b, c, d, e, f);
		
		if(eq.isSolvable()) {
			System.out.println("Coordinates of interecting point are: x=" + eq.getX() + ", y=" + eq.getY());
		}else {
			System.out.println("The lines do not intersect.");
		}

	}

}
