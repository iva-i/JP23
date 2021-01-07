package zimski_zadatci;

import java.util.Scanner;

public class Zadatak05 {
//
	public static void main(String[] args) {
		// ciklicka matrica (ne radi u slučaju kvadratne matrice neparnog reda?!)
		
		Scanner ulaz=new Scanner(System.in);
		
		System.out.println("Unesi broj redaka: ");
		
		int redak = ulaz.nextInt();
		
		System.out.println("Unesi broj stupaca: ");
		
		int stupac = ulaz.nextInt();

		int pocredak = 0, pocstupac = 0, zadredak = redak - 1, zadstupac = stupac - 1, broj = 1;

		int[][] matrica = new int[redak][stupac];

		while (broj <= redak * stupac) {

			// (redak) desno -> lijevo
			for (int i = zadstupac; i > pocstupac; i--) {
				matrica[zadredak][i] = broj++;
			}

			// (stupac) dolje -> gore
			for (int i = zadredak; i > pocredak; i--) {
				matrica[i][pocstupac] = broj++;
			}

			// (redak) lijevo -> desno
			for (int i = pocstupac; i < zadstupac; i++) {
				matrica[pocredak][i] = broj++;
			}

			// (stupac) gore -> dolje
			for (int i = pocredak; i < zadredak; i++) {
				matrica[i][zadstupac] = broj++;
			}

			zadstupac--;
			zadredak--;
			pocstupac++;
			pocredak++;
		}

		for (int i = 0; i < redak; i++) {
			for (int j = 0; j < stupac; j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
	}
}