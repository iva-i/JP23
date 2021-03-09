package tasks11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfChar {

	public ArrayListOfChar() {
		
		//reading a string from the user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String s = input.nextLine();
		
		//printing a string as an ArrayList
		System.out.printf("String writtes as a list is given by: %s",toCharacterArray(s).toString());
		
		input.close();

	}

	public static void main(String[] args) {

		new ArrayListOfChar();

	}

	/**
	 * Method returns an array list of Character from a string
	 * 
	 * @param s
	 * @return ArrayList>Character>
	 */

	public static ArrayList<Character> toCharacterArray(String s) {

		ArrayList<Character> arr = new ArrayList<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			arr.add(s.charAt(i));
		}
		
		removeSpaces(arr);

		return arr;

	}
	
	public static ArrayList<Character> removeSpaces(ArrayList<Character> arr){
		
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == ' ') {
				arr.remove(i);
			}
		}
		
		return arr;
	}

}
