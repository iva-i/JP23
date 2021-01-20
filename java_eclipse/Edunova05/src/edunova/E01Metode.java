package edunova;

/**
 * Učenje metoda
 * @author Iva Ivezić
 *
 */

import static edunova.E05MetodeV4.slucajniBroj;

public class E01Metode {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// gradivni elementi jezika

		System.out.println("Hello");

		E02MetodaVrsta1.odradiPosao();
		E02MetodaVrsta1.packageScope();
		// E02MetodaVrsta1.nijeStatic(); //nije dostupno jer nije static

		E03MetodeV2.ispisi(2, 3);

		E04MetodeV3.zbroji(2, 3); // ne ispisuje ništa, samo vraća zbroj

		int rez = E04MetodeV3.zbroji(7, 6);
		System.out.println(rez);

		// var upućuje na to da je varijabla
		// tip mu nije bitan jer će desna strana odrediti da je int
		// (zbroji vraća int)
		var r = E04MetodeV3.zbroji(7, 6);
		System.out.println(r);

		System.out.println(E04MetodeV3.zbroji(2, 4));

		System.out.println(slucajniBroj());

		//////////////////////////////

	}

	static boolean isPrimeV1(int num) {

		boolean prime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}

		return prime;
	}

	// bolja verzija
	static boolean isPrimeV2(int num) {

		boolean prime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}

		return prime;
	}
	//najbolja verzija
	static boolean isPrimeV3(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false; // short curcuiting
			}
		}

		return true;
	}

}
