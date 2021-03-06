package tasks;

import java.util.Scanner;

public class Task2019 {

	public static void main(String[] args) {
		// (Geometry: area of a triangle) Write a program that prompts the user to enter
		// three
		// points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its
		// area.

		Scanner input = new Scanner(System.in);

		System.out.println("enter coordinates: ");

		double x1 = input.nextDouble(), y1 = input.nextDouble(), x2 = input.nextDouble(), y2 = input.nextDouble(),
				x3 = input.nextDouble(), y3 = input.nextDouble();

		double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)),
				b = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1)),
				c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

		double s = (a + b + c) / 2;

		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.printf("area is %.2f ", area);
	}

}
