package Zadatci;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double broj=0;

		while (broj <= 0) {
			System.out.println("unesi broj: ");

			broj = input.nextDouble();
		}

		System.out.println("unesi mjesto znamenke: ");

		int mjesto = input.nextInt();

		String s = String.valueOf(broj);

		char ch = s.charAt(mjesto%s.length()-1);

		System.out.println(ch);

	}

}
