package tasks;

import java.util.Scanner;

public class Task6003 {

	public static void main(String[] args) {
		// (Palindrome integer) Write the methods with the following headers:
		
		// Return the reversal of an integer, e.g., reverse(456) returns 654
		// public static int reverse(int number)
		
		// Return true if number is a palindrome
		// public static boolean isPalindrome(int number)
		
		// Use the reverse method to implement isPalindrome. A number is a palindrome
		// if its reversal is the same as itself. Write a test program that prompts the
		// user to enter an integer and reports whether the integer is a palindrome.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		input.close();
		
		if(isPalindrome(num)) {
			System.out.printf("Number %d is a palindrome.",num);
		}else {
			System.out.printf("Number %d is not a palindrome.",num);
		}

	}
	
	public static int reverse(int number) {
		
		String s = String.valueOf(number);
		
		int help=0, reverse=0;
		
		for(int i=s.length(); i>=0; i--) {
			help = number%10;
			number/=10;
			reverse+=help*Math.pow(10, i-1);
		}
		
		return reverse;
		
	}
	
	public static boolean isPalindrome(int number) {
		
		int num = reverse(number);
		
		if(num==number) {
			return true;
		}else {
			return false;
		}
	}

}
