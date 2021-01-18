package tasks;

import java.util.Scanner;

public class Task7001 {

	public static void main(String[] args) {
		// (Assign grades) Write a program that reads student scores, gets the best
		// score, and then assigns grades based on the following scheme:
		// Grade is A if score is >= best -5
		// Grade is B if score is >= best -10;
		// Grade is C if score is >= best -15;
		// Grade is D if score is >= best -20;
		// Grade is F otherwise.
		// The program prompts the user to enter the total number of students, and then
		// prompts the user to enter all of the scores, and concludes by displaying the
		// grades.

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of students: ");

		int numOfStud = input.nextInt();
		int[] scores = new int[numOfStud];

		System.out.println("Enter scores: ");

		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}
		
		input.close();
		
		int max = getMax(scores);
		
		for (int i = 0; i< scores.length; i++) {
			System.out.printf("Student %d score is %d and grade is %c.\n",i,scores[i],gradeList(max,scores[i]));
		}

	}

	// method takes the best score and other score and returns the grade
	static char gradeList(int scoreBest, int scoreOther) {

		char grade = 'Z';

		if (scoreOther >= scoreBest - 5) {
			grade = 'A';
		} else if (scoreOther >= scoreBest - 10) {
			grade = 'B';
		} else if (scoreOther >= scoreBest - 15) {
			grade = 'C';
		} else if (scoreOther >= scoreBest - 20) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		return grade;
	}
	
	static int getMax(int[] array) {
		 
		int max = 0;
		
		for(int i = 0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		
		return max;
	}

}
