package projecteuler;

public class Zadatak05 {

	public static void main(String[] args) {
		// 2520 is the smallest number that can be divided by each of the numbers from 1
		// to 10 without any remainder.
		// What is the smallest positive number that is evenly divisible by all of the
		// numbers from 1 to 20?

		long broj = 21;
		while (1 == 1) {
			boolean djeljiv = true;
			for (int i = 1; i < 21; i++) {
				djeljiv = true;
				if (broj % i != 0) {
					djeljiv = false;
					break;
				}
			}
			if (djeljiv) {
				System.out.println(broj);
				break;
			}

			broj++;
		}

	}

}
