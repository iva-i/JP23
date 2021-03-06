package project_euler;

import java.math.BigInteger;

public class Zadatak15 {

	public static void main(String[] args) {
		// Starting in the top left corner of a 2×2 grid, and only being able to move to
		// the right and down, there are exactly 6 routes to the bottom right corner.
		// How many such routes are there through a 20×20 grid?

		int n = 40, r = 20; // ukupan broj mogućih koraka i ukupan broj koraka u "jednom" smjeru

		// rješenje: kombinacije bez ponavljanja ("n povrh r")

		BigInteger rjesenje = faktorijel(n).divide(faktorijel(r).multiply(faktorijel(n - r)));

		System.out.println(rjesenje);

	}

	public static BigInteger faktorijel(int x) {

		BigInteger produkt = BigInteger.ONE;

		for (int i = 1; i <= x; i++) {
			produkt = produkt.multiply(BigInteger.valueOf(i));
		}
		return produkt;
	}

}
