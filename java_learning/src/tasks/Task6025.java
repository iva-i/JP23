package tasks;

import java.util.Scanner;

public class Task6025 {

	public static void main(String[] args) {
		// (Convert milliseconds to hours, minutes, and seconds) Write a
		// method that converts milliseconds to hours, minutes, and seconds
		// using the following header:
		// public static String convertMillis(long millis)
		// The method returns a string as hours:minutes:seconds.
		// For example,convertMillis(5500) returns a string 0:0:5,
		// convertMillis(100000) returns a string 0:1:40, and
		// convertMillis(555550000) returns a string 10:19:10.
		// Write a test program that prompts the user to enter a long integer for
		// milliseconds and displays a string in the format of hours:minutes:seconds.

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of milliseconds: ");

		long mili = input.nextLong();

		input.close();

		System.out.printf("Number of hours, minutes and seconds in %d milliseconds is %s.", mili, convertMillis(mili));

	}

	public static String convertMillis(long millis) {

		int seconds = (int) (millis / 1000) % 60;
		int minutes = (int) ((millis / (1000 * 60)) % 60);
		int hours = (int) ((millis / (1000 * 60 * 60)) % 24);

		String sec = String.valueOf(seconds);
		String min = String.valueOf(minutes);
		String hour = String.valueOf(hours);

		return hour + ":" + min + ":" + sec;
	}

}
