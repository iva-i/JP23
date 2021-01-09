package tasks;

import java.util.Scanner;

public class Task5001 {

	public static void main(String[] args) {
		// (Pass or fail) Write a program that prompts a student to enter a
		// Java score. If the score is greater or equal to 60, display
		// “you pass the exam”; otherwise, display
		// “you don’t pass the exam”. Your program ends with input -1.

		Scanner input = new Scanner(System.in);

		int score = 0;

		while (score != -1) {

			System.out.println("Enter Java score: ");
			score = input.nextInt();

			if (score >= 60) {
				System.out.println("You pass the exam.");
			} else {
				System.out.println("You don't pass the exam.");
			}
		}

		input.close();

	}

}
