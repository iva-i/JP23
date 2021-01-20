package zadatci;

import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.println("unesi brojeve");

		int i = 0, zbroj = 0;

		while (i != -1) {
			i = ulaz.nextInt();
			if (i != -1) {
				zbroj += i;
			}
		}

		System.out.println(zbroj);

	}
}
