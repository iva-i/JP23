package tasks;

import java.util.*;

public class Task6020 {

	public static void main(String[] args) {
		// (Count the letters in a string) Write a method that counts the number
		// of letters in a string using the following header:
		// public static int countLetters(String s)
		// Write a test program that prompts the user to enter a string and
		// displays the number of letters in the string.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		
		String str = input.nextLine();
		
		input.close();
		
		System.out.printf("Number of letters in a string \"%s\" is %d.",str,countLetters(str));

	}
	
	public static int countLetters(String s) {
		
		int count=s.length();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
			count-=1;
			}
		}
		
		return count;
	}

}
