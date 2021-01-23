package tasks10;

import java.util.*;

public class StackOfIntegersPrimeFactors {

	public static void main(String[] args) {
		/**
		 * (Display the prime factors) Write a program that prompts the user to enter a
		 * positive integer and displays all its smallest factors in decreasing order.
		 * For example, if the integer is 120, the smallest factors are displayed as 5,
		 * 3, 2, 2, 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2,
		 * 2, 3, 5) and retrieve and display them in reverse order.
		 */

		// something does not work properly (...)
		Scanner input = new Scanner(System.in);

		int integer = 0;

		while (integer <= 0) {
			System.out.println("Enter positive integer: ");
			integer = input.nextInt();
		}

		input.close();

		StackOfIntegers stack = new StackOfIntegers(integer);

		for (int i = 2; i <= integer; i++) {
			if (integer % i == 0 && isPrime(i)) {
				stack.push(i);
				integer /= i;
			}
		}

		for (int i = 0; i < stack.getSize(); i++) {
			System.out.printf("%d ", stack.pop());
		}

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
