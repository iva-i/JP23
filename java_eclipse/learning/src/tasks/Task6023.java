package tasks;

import java.util.Scanner;

public class Task6023 {

	public static void main(String[] args) {
		// (Occurrences of a specified character) Write a method that finds the number
		// of occurrences of a specified character in a string using the following
		// header: public static int count(String str, char a)
		// For example, count("Welcome", 'e') returns 2. Write a test program that
		// prompts the user to enter a string followed by a character then displays the
		// number of occurrences of the character in the string.
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter sentence/word and specified character: ");

		String str = input.nextLine();
		char ch = input.next().charAt(0);		

		input.close();
		
		System.out.printf("Number of charachter \"%c\" in a word/sentence \"%s\" is %d.",ch,str,count(str,ch));

	}
	
	public static int count(String str, char a) {
		
		int counter = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == a) {
				counter++;
			}
		}
		
		return counter;
	}

}
