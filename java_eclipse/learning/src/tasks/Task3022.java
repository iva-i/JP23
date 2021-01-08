package tasks;

import java.util.Scanner;

public class Task3022 {

	public static void main(String[] args) {
		// (Geometry: point in a circle?) Write a program that prompts
		// the user to enter a point (x, y) and checks whether the point
		// is within the circle centered at (0, 0) with radius 10.
		// For example, (4, 5) is inside the circle and (9, 9) is outside the circle.

		Scanner input = new Scanner(System.in);

		// program prompts
		System.out.println("Enter x and y coordinate of the point: ");
		double x = input.nextDouble(), y = input.nextDouble(), distance;

		input.close();

		// calculating distance between center and user's point
		distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		// checking if point is in the circle
		if (distance <= 10) {
			System.out.printf("Point (%.2f, %.2f) is in a circle.", x, y);
		} else {
			System.out.printf("Point (%.2f, %.2f) is not in a circle.", x, y);
		}

	}

}
