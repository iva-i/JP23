package tasks;

import java.util.Scanner;

public class Task5016 {
	public static void main(String[] args) {
		// (Find the factors of an integer) Write a program that reads an
		// integer and displays all its smallest factors in an increasing order.
		// For example, if the input integer is
		// 120, the output should be as follows: 2, 2, 2, 3, 5.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int num = input.nextInt(), div = 2;
		
		input.close();
		
		while(num!=1) {
			if(num%div == 0) {
				System.out.println(div);
				num/=div;
			}else {
				div++;
			}
		}
		
	}
}
