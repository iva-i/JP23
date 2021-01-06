package tasks;

import java.util.Scanner;
import java.lang.Math; 

public class task2002 {
	public static void main(String[] args) {
		// (Compute the volume of a triangular prism) Write a program that reads in the
		// length of
		// sides of an equilateral triangle and computes the area and volume using the
		// following
		// formulas: area = sqrt(3)/4 * (length of sides)^2
		// volume = area * length

		Scanner input = new Scanner(System.in);

		System.out.println("Enter length of the sides and height of the Equilateral triangle: ");

		double length = input.nextDouble();
		double height=input.nextDouble();
		
		double area= (Math.sqrt(3)/4)*Math.pow(length, 2), volume=area*length;
		
		System.out.printf("Area is %.2f volume is %.2f", area, volume);
		
		
		

	}
}
