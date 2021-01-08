package project_euler;

public class Zadatak09 {

	public static void main(String[] args) {

		// A Pythagorean triplet is a set of three natural numbers, a < b < c, for
		// which, a2 + b2 = c2
		// For example, 32 + 42 = 9 + 16 = 25 = 52.
		// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
		// Find the product abc.

		int a = 0, b = 0, c = 0, produkt=0;

		boolean trojka = false;

		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				for (int k = 1; k < 1000; k++) {
					if (i * i + j * j == k * k) {
						a = i;
						b = j;
						c = k;
						if (a + b + c == 1000) {
							produkt=a*b*c;
							System.out.printf("%d   ", produkt);
						}
					}
				}
			}
		}

	}

}
