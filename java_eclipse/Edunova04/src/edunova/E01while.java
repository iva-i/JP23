package edunova;

public class E01while {
	public static void main(String[] args) {
		// provjerava uvijet na početku
		// postoji mogućnost da nikad nećeš ući u while

		// "zamjena" za for
		int i = 0;

		while (i < 10) {
			System.out.println();
			i++;
		}

		i = 0;
		boolean ostaniUPetlji = i < 10;
		while (ostaniUPetlji) {
			System.out.println(i);
			ostaniUPetlji = ++i < 10;
		}

		i = 0;
		while (i < 10) {
			System.out.println(i++);
		}

		// beskorisno
		i = 20;
		while (i < 10) {
			System.out.println("Ovo neće ispisati");
		}

		// beskonačna petlja
		while (true) {
			if (i++ == 20) {
				continue;
			}
			if (i == 21) {
				break;
			}
		}

		// ugnježđene
		i = 0;
		int j = 0;
		while (i < 10) {
			while (j < 10) {
				j++;
			}
			i++;

		}

	}
}
