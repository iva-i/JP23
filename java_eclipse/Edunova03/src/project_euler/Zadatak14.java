package project_euler;

import java.util.Arrays;

public class Zadatak14 {

	public static void main(String[] args) {
		// The following iterative niz is defined for the set of positive integers:
		// n → n/2 (n is even)
		// n → 3n + 1 (n is odd)
		// Using the rule above and starting with 13, we generate the following
		// niz:
		// 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
		// It can be seen that this niz (starting at 13 and finishing at 1)
		// contains 10 terms. Although it has not been proved yet (Collatz Problem), it
		// is thought that all starting brojs finish at 1.
		// Which starting broj, under one million, produces the longest chain?
		// NOTE: Once the chain starts the terms are allowed to go above one million.

		long duljina = 0, pocetak = 0;
		long niz;

		for (int i = 2; i <= 1000000; i++) {
			int dulj = 1;
			niz = i;
			while (niz != 1) {
				if ((niz % 2) == 0) {
					niz = niz / 2;
				} else {
					niz = niz * 3 + 1;
				}
				dulj++;
			}

			if (dulj > duljina) {
				duljina = dulj;
				pocetak = i;
			}

		}

	}
}
