package zimski_zadatci;

public class Zadatak01 {

	public static void main(String[] args) {
		// Kreirati program koji unosi 24 broja, ispisuje njihov zbroj, najmanji i
		// najveći uneseni broj.

		java.util.Scanner ulaz = new java.util.Scanner(System.in);

		System.out.println("Unesi 24 broja: ");

		int niz[] = new int[24];

		int zbroj = 0;

		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextInt();
			zbroj += niz[i];
		}
		
		int max = niz[0], min = niz[0];
		
		for (int i = 0; i < niz.length; i++) {
			if (max < niz[i]) {
				max = niz[i];
			}
			if (min > niz[i]) {
				min = niz[i];
			}
		}

		System.out.printf("Zbroj je %d\nNajveci je %d\nNajmanji je %d\n", zbroj, max, min);

	}

}
