package project_euler;

public class Zadatak10 {
	public static void main(String[] args) {
		// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
		// Find the sum of all the primes below two million.

		int suma = 0;

		for (int i = 1; i < 2000000; i++) {
			boolean prost = true;
			if (i < 2) {
				prost = false;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0 && i != 1) {
					prost = false;
				}
			}
			if (prost) {
				suma += i;
			}
		}

		System.out.printf("%d", suma);

	}
}
