package tasks;

import java.util.*;

public class Task6005 {

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

		if (num1 >= num2 && num2 >= num3) {
			System.out.printf("%.2f, %.2f, %.2f", num1, num2, num3);
		}else if(num1>=num2 && num1>=num3 && num2<=num3) {
			System.out.printf("%.2f, %.2f, %.2f", num1, num3, num2);
		}else if(num2>=num1 && num2>=num3 && num1<=num3) {
			System.out.printf("%.2f, %.2f, %.2f", num2, num3, num1);
		}else if(num2>=num1 && num2>=num3 && num1>=num3) {
			System.out.printf("%.2f, %.2f, %.2f", num2, num1, num3);
		}else if(num3>=num1 && num3>=num2 && num1<=num2) {
			System.out.printf("%.2f, %.2f, %.2f", num3, num2, num1);
		}else {
			System.out.printf("%.2f, %.2f, %.2f", num3, num1, num2);
		}

	}

}
