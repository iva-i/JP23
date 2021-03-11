package tasks10;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfCharacter {

	/**
	 * (ArrayList of Character) Write a method that returns an array list of
	 * Character from a string using the following header: public static
	 * ArrayList<Character> toCharacterArray(String s) For example,
	 * toCharacterArray("abc") returns an array list that contains characters 'a',
	 * 'b', and 'c'.
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String s = input.nextLine();
		
		System.out.println("String " + s + " written as a list of chars is given by: \n" + toCharacterArray(s));
		
		input.close();

	}

	/**
	 * method returns an array list of Character from a string
	 * (spaces are not saved!)
	 * 
	 * @param s
	 * @return ArrayList<Character>
	 */
	public static ArrayList<Character> toCharacterArray(String s) {

		ArrayList<Character> arr = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				arr.add(s.charAt(i));
			}
		}
		

		return arr;

	}
}
