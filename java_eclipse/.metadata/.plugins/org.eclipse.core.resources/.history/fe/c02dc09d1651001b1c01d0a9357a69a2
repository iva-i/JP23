import java.util.Scanner;

public class Exercise05Test {
//
	public static void main(String[] args) {
		// ciklicka matrica

		Scanner ulaz = new Scanner(System.in);

		int redak = -1, stupac = -1;

		do {
			System.out.println("Unesi broj redaka: ");
			redak = ulaz.nextInt();
		} while (redak <= 0);

		
		do {
			System.out.println("Unesi broj stupaca: ");
			stupac = ulaz.nextInt();
		} while(stupac<=0);
		
		// input no longer required
		// close it.
		// if you don't, you leak memory.
		ulaz.close();

		int pocRedak = 0, pocStupac = 0, zadRedak = redak - 1, zadStupac = stupac - 1, broj = 1;
		int[][] matrica = new int[redak][stupac];
		
		//unos vrijednosti u matricu (iznimka rješena pomoću if-a - linija 61)
		while (broj < redak * stupac) {
			// (redak) desno -> lijevo
			for (int i = zadStupac; i >= pocStupac; i--) {
				matrica[zadRedak][i] = broj++;
				//printMatrix(matrica);
			}
			zadRedak--;
			if (isMatrixFull(matrica, broj))
				break;

			// (stupac) dolje -> gore
			for (int i = zadRedak; i >= pocRedak; i--) {
				matrica[i][pocStupac] = broj++;
				//printMatrix(matrica);
			}
			pocStupac++;
			if (isMatrixFull(matrica, broj))
				break;

			// (redak) lijevo -> desno
			for (int i = pocStupac; i <= zadStupac; i++) {
				matrica[pocRedak][i] = broj++;
				//printMatrix(matrica);
			}
			pocRedak++;
			if (isMatrixFull(matrica, broj))
				break;

			// (stupac) gore -> dolje
			for (int i = pocRedak; i <= zadRedak; i++) {
				matrica[i][zadStupac] = broj++;
				//printMatrix(matrica);
			}
			zadStupac--;	
			if (isMatrixFull(matrica, broj))
				break;
		}
		
		//u slučaju kvadratne matrice neparnog reda da ispuni "zadnje" polje
		if(redak % 2 !=0 && stupac % 2 != 0) {
			matrica[redak/2][stupac/2]=redak*stupac;
		}
		
		//ispis matrice
		System.out.println("Matrica je dana s: ");
		for (int i = 0; i < redak; i++) {
			for (int j = 0; j < stupac; j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	// used for debugging
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%2d ", matrix[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	static boolean isMatrixFull(int[][] matrix, int number) {
		return number >= matrix.length * matrix[0].length;
	}
}
