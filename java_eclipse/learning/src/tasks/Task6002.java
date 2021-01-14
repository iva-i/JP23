package tasks;

import java.util.Scanner;

public class Task6002 {

	public static void main(String[] args) {
		// (Sum the digits in an integer) Write a method that computes the sum of the
		// digits in an integer. Use the following method header:
		// public static int sumDigits(long n)
		// For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the %
		// operator to extract digits and the / operator to remove the extracted digit.
		// For instance, to extract 4 from 234, use 234 % 10 (= 4 ).
		// To remove 4 from 234, use 234 /10 (= 2 3 ). Use a loop to repeatedly extract
		// and remove the digit until all the digits are extracted.
		// Write a test program that prompts the user to enter an integer then
		// displays the sum of all its digits.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		long number = input.nextLong();
		
		input.close();
		
		System.out.printf("Sum of digits of a number %d is %d.",number,sumDigits(number));

	}

	public static int sumDigits(long n) {
		
		long sum = 0, digit=0;
		
		while(n!=0) {
			digit = n%10;
			sum += digit;
			n/=10;
		}
		
		return (int)sum;
	}
}
