package tasks11;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

public class MaximumElementInArrayList {

	/**
	 * Write the following method that returns the maximum value in an ArrayList of
	 * integers. The method returns null if the list is null or the list size is 0.
	 * public static Integer max(ArrayList<Integer> list) Write a test program that
	 * prompts the user to enter a sequence of numbers ending with 0 and invokes
	 * this method to return the largest number in the input.
	 */

	public MaximumElementInArrayList() {

		ArrayList<Integer> listOfInts = new ArrayList<Integer>();

		Scanner input = new Scanner(System.in);

		System.out.println("Enter integers into list: ");

		while (true) {
			int nextElement = input.nextInt();

			if (nextElement == 0) {
				break;
			} else {
				listOfInts.add(nextElement);
			}

		}

		input.close();

		System.out.printf("Maximum value of the list is %d.", max(listOfInts));

	}

	public static void main(String[] args) {

		new MaximumElementInArrayList();

	}

	public static Integer max(ArrayList<Integer> list) {

		int max;

		if (! list.isEmpty()) {
			max = list.get(0);
			for (int i = 0; i < list.size(); i++) {
				if (max < list.get(i)) {
					max = list.get(i);
				}
			}
		}else {
			return null;
		}

		return max;

	}

}
