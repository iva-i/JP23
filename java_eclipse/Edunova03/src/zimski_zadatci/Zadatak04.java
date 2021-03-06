package zimski_zadatci;

import java.util.Arrays;

public class Zadatak04 {

	public static void main(String[] args) {
		// Kreirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj

		java.util.Scanner ulaz = new java.util.Scanner(System.in);

		int broj = 4;

		System.out.println("Unesi vrijednosti u prvu matricu: ");

		int m1[][] = new int[broj][broj];

		for (int i = 0; i < broj; i++) {
			for (int j = 0; j < broj; j++) {
				m1[i][j] = ulaz.nextInt();
			}

		}

		System.out.println("Unesi vrijednosti u drugu matricu: ");

		int m2[][] = new int[broj][broj];

		for (int i = 0; i < broj; i++) {
			for (int j = 0; j < broj; j++) {
				m2[i][j] = ulaz.nextInt();
			}
		}

		int suma[][] = new int[broj][broj];

		for (int i = 0; i < broj; i++) {
			for (int j = 0; j < broj; j++) {
				suma[i][j] = m1[i][j] + m2[i][j];
			}

		}

		System.out.print(Arrays.deepToString(m1) + " + ");
		System.out.print(Arrays.deepToString(m2) + " = ");
		System.out.print(Arrays.deepToString(suma));

	}

}
