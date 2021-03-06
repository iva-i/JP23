package zimski_zadatci;

public class Zadatak03 {

	public static void main(String[] args) {
		// Kreirati program koji za dva unesena broja ispisuje sve prim/prosti/prime
		// brojeve između njih.

		java.util.Scanner ulaz = new java.util.Scanner(System.in);

		System.out.print("Unesi 2 broja: ");

		int prvibroj = ulaz.nextInt();
		int drugibroj = ulaz.nextInt();
		int pomocni = 0;

		if (prvibroj > drugibroj) {
			pomocni = prvibroj;
			prvibroj = drugibroj;
			drugibroj = pomocni;
		}

		for (int i = prvibroj + 1; i < drugibroj; i++) {
			boolean isPrime = true;
			if (i < 2) {
				isPrime = false;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0 && i != 1) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.printf("%d, ", i);
			}
		}

	}
}