package zadatci;

public class Zadatak3 {

	public static void main(String[] args) {

		int broj1 = 1, broj2 = 1;

		while (broj1 <= 5) {
			while (broj2 <= 5) {
				System.out.print(broj1 * broj2);
				broj2++;
			}
			System.out.println();
			broj1++;
		}

	}

}
