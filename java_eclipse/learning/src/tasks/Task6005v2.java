package tasks;

import java.util.Scanner;
import java.util.Arrays;

public class Task6005v2 {
	public static void main(String[] args) {
		// (Sort three numbers) Write a method with the following header to
		// display three numbers in decreasing order:
		// public static void displaySortedNumbers( double num1, double num2, double
		// num3)
		// Write a test program that prompts the user to enter three numbers and invokes
		// the method to display them in decreasing order.
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		double a=input.nextInt(), b=input.nextInt(), c=input.nextInt();
		
		input.close();
		
		displaySortedNumbers(a, b, c);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double[] array = new double[3];

		array[0] = num1;
		array[1] = num2;
		array[2] = num3;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 - i - 1; j++) {
				if(array[j]>array[j+1]) {
					//swapping
					double temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));

	} 
}
