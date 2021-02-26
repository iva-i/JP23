package tasks11;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {

	public SumArrayList() {

		//input of 5 numbers
		Scanner input = new Scanner(System.in);

		ArrayList list = new ArrayList<Double>();

		System.out.println("Enter 5 numbers: ");

		try {
			for (int i = 0; i < 5; i++) {
				list.add(i, input.nextDouble());
			}
		} catch (Exception e) {
			System.out.println("Numbers must be entered!");
		}

		//printing the result of call of a method
		System.out.println(sum(list));

		//closing Scanner
		input.close();

	}

	public static void main(String[] args) {

		new SumArrayList();

	}

	/**
	 * Method computes the sum of elements in ArrayList
	 * @param list
	 * @return double
	 */
	public static double sum(ArrayList<Double> list) {

		double sum = 0;

		for (Double num : list) {
			sum += num;
		}

		return sum;

	}

}
