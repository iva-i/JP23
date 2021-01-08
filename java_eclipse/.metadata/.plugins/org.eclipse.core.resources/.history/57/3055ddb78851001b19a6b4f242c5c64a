package projecteuler;

public class Zadatak04 {

	public static void main(String[] args) {
		// A palindromic number reads the same both ways. The largest palindrome made
		// from the product of two 2-digit numbers is 9009 = 91 × 99.
		// Find the largest palindrome made from the product of two 3-digit numbers.

		int pal = 0, najveci = 0;

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				pal = i*j;
				if (String.valueOf(pal).length() == 5) {
					if (pal / 10000 == pal % 10 && (pal / 1000) % 10 == (pal / 10) % 10) {
						najveci = pal;
					}
				} else if (String.valueOf(pal).length() == 6) {
					if (pal / 100000 == pal % 10 && (pal / 10000) % 10 == (pal / 10) % 10
							&& (pal / 1000) % 10 == (pal / 100) % 10) {
						najveci = pal;
					}
				}
			}
		}

		System.out.println(najveci);

	}

}
