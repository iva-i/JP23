package tasks;

import java.util.Scanner;

public class Task3011 {

	public static void main(String[] args) {
		// (Find the number of days in a month) Write a program that prompts the user to
		// enter the month and year and displays the number of days in the month. For
		// example, if the user entered month 2 and year 2012, the program should
		// display that February 2012 has 29 days. If the user entered month 3 and year
		// 2015, the program should display that March 2015 has 31 days.

		Scanner input = new Scanner(System.in); 

		int month = 0, year = 0;

		do {
			System.out.println("Enter month: "); 

			month = input.nextInt();
		} while (month <= 1 && month >= 12);
		
		
		System.out.println("Enter year: ");

		year = input.nextInt();
		

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			switch (month) {
			case 1 -> System.out.printf("January %d has 31 days.", year);
			case 2 -> System.out.printf("February %d has 29 days.", year);
			case 3 -> System.out.printf("March %d has 31 days.", year);
			case 4 -> System.out.printf("April %d has 30 days.", year);
			case 5 -> System.out.printf("May %d has 31 days.", year);
			case 6 -> System.out.printf("June %d has 30 days.", year);
			case 7 -> System.out.printf("July  %d has 31 days.", year);
			case 8 -> System.out.printf("August %d has 31 days.", year);
			case 9 -> System.out.printf("September %d has 30 days.", year);
			case 10 -> System.out.printf("October %d has 31 days.", year);
			case 11 -> System.out.printf("November %d has 30 days.", year);
			case 12 -> System.out.printf("December %d has 31 days.", year);
			}
		} else {
			switch (month) {
			case 1 -> System.out.printf("January %d has 31 days.", year);
			case 2 -> System.out.printf("February %d has 28 days.", year);
			case 3 -> System.out.printf("March %d has 31 days.", year);
			case 4 -> System.out.printf("April %d has 30 days.", year);
			case 5 -> System.out.printf("May %d has 31 days.", year);
			case 6 -> System.out.printf("June %d has 30 days.", year);
			case 7 -> System.out.printf("July  %d has 31 days.", year);
			case 8 -> System.out.printf("August %d has 31 days.", year);
			case 9 -> System.out.printf("September %d has 30 days.", year);
			case 10 -> System.out.printf("October %d has 31 days.", year);
			case 11 -> System.out.printf("November %d has 30 days.", year);
			case 12 -> System.out.printf("December %d has 31 days.", year);
			}
		}
	}
}