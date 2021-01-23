package tasks09;

import java.util.*;

public class LocationTest {

	public static void main(String[] args) {
		/**
		 * Write a test program that prompts the user to enter a two-dimensional array
		 * and displays the location of the largest element in the array.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of rows and columns: ");

		int row = input.nextInt(), column = input.nextInt();

		double[][] array2D = new double[row][column];

		System.out.println("Enter values into 2D array: ");

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[0].length; j++) {
				array2D[i][j] = input.nextDouble();
			}
		}

		input.close();

		Location loc = Location.locateLargest(array2D);

		System.out.printf("The location of the largest element %f is at (%d,%d).", loc.maxValue, loc.row, loc.column);

	}

}
