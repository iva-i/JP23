package tasks;

import java.util.Scanner;

public class Task5017 {

	public static void main(String[] args) {
		// (Display pyramid) Write a program that prompts the user to enter
		// an integer from 1 to 15 and displays a pyramid, as shown.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int num = input.nextInt();
		
		input.close();
		
		//printing pyramid as shown in the task
		while(num!=0) {
			for(int i=num; i>0; i--) {
					System.out.print(i);
			}
			for(int i=2; i<=num; i++) {
				System.out.print(i);
			}
			System.out.println();
			num--;
		}

	}

}
