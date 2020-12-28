package projecteuler;

public class Zadatak01 {

	public static void main(String[] args) {
		// If we list all the natural numbers below 10 that are multiples of 3 or 5, we
		// get 3, 5, 6 and 9. The sum of these multiples is 23.
		// Find the sum of all the multiples of 3 or 5 below 1000.

		int suma = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				suma = suma + i;
			}
		}
		
		System.out.println(suma);

	}

}
