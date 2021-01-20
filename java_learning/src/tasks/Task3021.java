package tasks;

import java.util.Scanner;

public class Task3021 {

	public static void main(String[] args) {
		// (Science: day of the week) Program takse year, month and day
		// as an input. Output is what day of the week given date is.

		Scanner input = new Scanner(System.in);

		int year, month, day;

		// program prompts user to enter a year
		System.out.println("Enter year: ");
		year = input.nextInt();

		// program prompts user to enter month
		do {
			System.out.println("Enter month: ");
			month = input.nextInt();
		} while (month < 1 || month > 12);

		// program prompts user to enter day of the month
		// months that have 30 days
		if ((month <= 7 && month != 2 && month % 2 == 0) || (month >= 8 && month % 2 != 0)) {
			do {
				System.out.println("Enter the day of the month: ");
				day = input.nextInt();
			} while (day < 1 || day > 30);
			// February, if leap year and if not
		} else if (month == 2) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				do {
					System.out.println("Enter the day of the month: ");
					day = input.nextInt();
				} while (day < 1 || day > 29);
			} else {
				do {
					System.out.println("Enter the day of the month: ");
					day = input.nextInt();
				} while (day < 1 || day > 28);
			}
			// months that have 31 days
		} else {
			do {
				System.out.println("Enter the day of the month: ");
				day = input.nextInt();
			} while (day < 1 || day > 31);
		}

		input.close();

		// January and February are treated as 13 and 14 because of the formula
		// year has to be treated as previous year in this cases
		if (month == 1) {
			month = 13;
			year = year - 1;
		} else if (month == 2) {
			month = 14;
			year = year - 1;
		}

		System.out.printf("Day of the week is %s.", dayOfTheWeek(dayOfTheWeekNum(day, month, year)));

	}

	// q represents day of the month, m represents month, x represents year
	static int dayOfTheWeekNum(int q, int m, int x) {
		// k represents year of the century
		int k = x % 100, j = x / 100;
		// formula is given in the task
		int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		return h;
	}

	// method returns a string which tells the user what day it is
	// (depends on formula)
	static String dayOfTheWeek(int x) {
		if (x == 0) {
			return "Saturday";
		} else if (x == 1) {
			return "Sunday";
		} else if (x == 2) {
			return "Monday";
		} else if (x == 3) {
			return "Tuesday";
		} else if (x == 4) {
			return "Wednesday";
		} else if (x == 5) {
			return "Thursday";
		} else {
			return "Friday";
		}
	}

}
