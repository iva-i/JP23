package tasks11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Algebra: perfect square) Write a program that prompts the user to enter an
 * integer m and find the smallest integer n such that m * n is a perfect
 * square. (Hint: Store all smallest factors of m into an array list. n is the
 * product of the factors that appear an odd number of times in the array list.
 * For example, consider m = 90, store the factors 2, 3, 3, and 5 in an array
 * list. 2 and 5 appear an odd number of times in the array list. Thus, n is
 * 10.)
 *
 */

public class PerfectSquare {

	public PerfectSquare() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");

		int num = input.nextInt();

		ArrayList<Integer> oddFact = oddNumOfTimes(smallestFactors(num));
		
		System.out.printf("Perfect square is %d.", productOfNumAndFactors(oddFact, num));

		input.close();
	}

	public static void main(String[] args) {

		new PerfectSquare();

	}

	/**
	 * Method returns ArrayList of smallest numbers of a given number. For example,
	 * for 90 will return ArrayList with elements 2,3,3,5
	 * 
	 * @param num
	 * @return ArrayList
	 */
	public ArrayList<Integer> smallestFactors(int num) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				arr.add(i);
				num /= i;

			}
		}

		return arr;
	}

	/**
	 * Method removes elements of an ArrayList which appear multiple times.
	 * 
	 * @param arr
	 * @return ArrayList
	 */
	public ArrayList<Integer> oddNumOfTimes(ArrayList<Integer> array) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < array.size(); i++) {
			int counter = 0;
			for (int j = 0; j < array.size(); j++) {
				if (array.get(i) == array.get(j)) {
					counter++;
				}
			}
			if (counter % 2 != 0) {
				arr.add(array.get(i));
			}
			counter = 0;
		}

		return arr;

	}

	/**
	 * Method returns product of num and all elements of a given list
	 * 
	 * @param arr
	 * @param num
	 * @return Integer
	 */
	public Integer productOfNumAndFactors(ArrayList<Integer> arr, int num) {

		for (Integer m : arr) {
			num *= m;
		}
		return num;
	}

}
