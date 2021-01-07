package tasks;

import java.util.Scanner;

public class Task3012 {
	public static void main(String[] args) {
		// (Palindrome integer) Write a program that prompts the user to enter
		// a three-digit integer and determines whether it is a palindrome integer.
		// An integer is palindrome if it reads the same from right to left and
		// from left to right. A negative integer is treated the same as a positive
		// integer.
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three digit integer: ");
			
	    int	num = input.nextInt();
	    
	    String snum = String.valueOf(num);
		
		if(num<0) {
			char ch1 = snum.charAt(1); 
			char ch2 = snum.charAt(3);
			
			if(ch1 == ch2) {
				System.out.println("Palindrome");
			}else{
				System.out.println("Not palindrome");
			}
		}
		
		if(num>0) {
			char ch1 = snum.charAt(0);
			char ch2 = snum.charAt(2);
			
			if(ch1 == ch2) {
				System.out.println("Palindrome");
			}else{
				System.out.println("Not palindrome");
			}
		}
		
	
	
	}
}
