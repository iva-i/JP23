package zimski_zadatci;

public class Zadatak02 {

	public static void main(String[] args) {
		// Kreirati program koji ispisuje tablicu množenja 15x15 lijepo formatiranu

		int tablica[][] = new int[15][15];

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				tablica[i][j] = (i + 1) * (j + 1);
				System.out.printf("%5d ", tablica[i][j]);
			}
			System.out.println();
		}

	}

}
