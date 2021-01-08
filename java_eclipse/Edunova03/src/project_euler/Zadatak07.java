package project_euler;

public class Zadatak07 {
	public static void main(String[] args) {

		// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
		// that the 6th prime is 13.
		// What is the 10 001st prime number?

		int brojac = 0, broj = 0;

		for (int i = 2; i < 10000000; i++) {
			boolean prost = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					prost = false;
					break;
				}
			}
			if (prost) {
				broj = i;
				brojac++;
			}
			if (brojac == 10001) {
				break;
			}
		}
		System.out.println(broj);
	}
}
