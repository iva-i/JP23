package tasks;

import java.util.Scanner;

public class Task3005 {
	public static void main(String[] args) {
		// (Find future dates) Write a program that prompts the user to enter an integer
		// for today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday
		// is 6). Also prompt the user to enter the number of days after today for a
		// future day and display the future day of the week.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter integer for today's day: ");
		
		int today = input.nextInt();
		
		System.out.println("Enter the number of days after today: ");
		
		int after=input.nextInt(), help = (today + after)%7;
		
		switch(help) {
		case 0 -> System.out.println("Future day is Sunday");
		case 1 -> System.out.println("Future day is Monday");
		case 2 -> System.out.println("Future day is Tuesday");
		case 3 -> System.out.println("Future day is Wednesday");
		case 4 -> System.out.println("Future day is Thursday");
		case 5 -> System.out.println("Future day is Friday");
		case 6 -> System.out.println("Future day is Saturday");
		}
		

	}
}
