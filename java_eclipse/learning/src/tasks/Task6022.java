package tasks;

import java.util.Scanner;

public class Task6022 {

	public static void main(String[] args) {
		// (Math: approximate the square root)
		// There are several techniques for implementing the sqrt method in
		// the Math class. One such technique is known as the Babylonian method.

		// It approximates the square root of a number, n, by repeatedly
		// performing the calculation using the following formula:
		// nextGuess = (lastGuess + n / lastGuess) / 2
		// When nextGuess and lastGuess are almost identical, nextGuess is the
		// approximated square root. The initial guess can be any positive value
		// (e.g.,1). This value will be the starting value for lastGuess. If the
		// difference between nextGuess and lastGuess is less than a very small number,
		// such as 0.0001, you can claim that nextGuess is the approximated square root
		// of n.
		// If not, nextGuess becomes lastGuess and the approximation process continues.
		// Implement the following method that returns the square root of n:
		// public static double sqrt(long n)

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");

		long num = input.nextLong();

		input.close();

		System.out.println("Approximated square root of number is " + sqrt(num));

	}

	public static double sqrt(long n) {

		long nextGuess = 2, lastGuess = 1;

		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		return nextGuess;
	}
}
