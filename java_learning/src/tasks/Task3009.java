package tasks;

import java.util.Scanner;

public class Task3009 {

	public static void main(String[] args) {
		// (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
		// consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a
		// checksum,
		// which is calculated from the other 9 digits using the following formula:
		// (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
		// d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11
		// If the checksum is 10, the last digit is denoted as X according to the
		// ISBN-10 convention. Write a program that prompts the user to enter the 
		//first 9 digits and displays the 10-digit ISBN (including leading zeros). 
		//Your program should read the input as an integer.

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first nine digits: ");

		int num = input.nextInt(), checksum = 0;

		checksum = ((num / 100000000) * 1 + ((num / 10000000) % 10) * 2 + ((num / 1000000) % 10) * 3
				+ ((num / 100000) % 10) * 4 + ((num / 10000) % 10) * 5 + ((num / 1000) % 10) * 6
				+ ((num / 100) % 10) * 7+((num/10)%10)*8+(num%10)*9)%11;

		if(num / 100000000 == 0) {
			if(checksum == 10) {
				System.out.println("0" + num +"X"); 
			}
			if(checksum<10) {
				System.out.printf("0%d%d",num,checksum);
			}
		}else {		
			if(checksum == 10) {
				System.out.println(num +"X");
			}
			if(checksum<10) {
				System.out.printf("%d%d",num,checksum);
			}
		}

	}

}
