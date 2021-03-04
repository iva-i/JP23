package tasks11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		List<Integer> answers = new ArrayList<Integer>();

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		answers.add(answer);

		while (number1 + number2 != answer) {
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			
			for(Integer num : answers) {
				if(answer == num) {
					System.out.printf("You already entered %d!\n",answer);
					break;
				}
			}
			
			answers.add(answer);
		}

		System.out.println("You got it!");

	}

}
