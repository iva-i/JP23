package tasks11;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
	
	public RemoveDuplicates() {

		//input of 10 ints
		Scanner input = new Scanner(System.in);

		ArrayList list = new ArrayList<Double>();

		System.out.println("Enter 10 integers: ");

		try {
			for (int i = 0; i < 10; i++) {
				list.add(i, input.nextInt());
			}
		} catch (Exception e) {
			System.out.println("Integers must be entered!");
		}
		
		removeDuplicate(list);

		//printing the result of call of a method
		System.out.println(list.toString());

		//closing Scanner
		input.close();

	}

	public static void main(String[] args) {

		new RemoveDuplicates();

	}

	/**
	 * Method computes the sum of elements in ArrayList
	 * @param list
	 * @return double
	 */
	public static void removeDuplicate(ArrayList<Double> list) {

		for(int i = 0; i<list.size(); i++) {
			for(int j = i; j<list.size();j++) {
				if(list.get(i) == list.get(j)) {
					list.remove(i);
				}
			}
		}

	}

}
