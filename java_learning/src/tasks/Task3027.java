package tasks;

import java.util.Scanner;

public class Task3027 {
	public static void main(String[] args) {
		// (Geometry: points in triangle?) Suppose a right triangle is
		// placed in a plane as shown below. The right-angle point is
		// placed at (0, 0), and the other two points are placed at
		// (200, 0) and (0, 100). Write a program that prompts the user
		// to enter a point with x- and y-coordinates and determines
		// whether the point is inside the triangle.

		Scanner input = new Scanner(System.in);

		// prompting user to enter coordinates
		System.out.println("Enter x and y coordinate of the point: ");
		double x = input.nextDouble(), y = input.nextDouble();

		input.close();
		
		// printing the solution if the point is inside or outside the triangle
		if (inTriangle(x, y)) {
			System.out.println("The point is inside the triangle.");
		} else {
			System.out.println("The point is outside of the triangle.");
		}
	}

	// method checks if the point is inside of a triangle
	static boolean inTriangle(double num1, double num2) {

		boolean check = true;

		if (num1 < 0 || num1 > 200) {
			check = false;
		} else if (num2 < 0 || num2 > 100) {
			check = false;
		} else if (num2 > -0.5 * num1 + 100) {
			check = false;
		}

		return check;

	}
}
