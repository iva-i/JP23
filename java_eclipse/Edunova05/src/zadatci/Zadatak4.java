package zadatci;

public class Zadatak4 {

	public static void main(String[] args) {
		// kreirati metodu tipa int naziva suma
		// koja prima jedan parametar koji je tipa niz cijelih brojeva
		// metoda vraća sumu svih elem

		// prikazati poziv metode td rezultat bude 12

		int[] niz = { 10, 2 };

		System.out.println(suma(niz));
	}

	static int suma(int[] array) {
		int suma = 0;

		for (int v : array) {
			suma += v;
		}

		return suma;
	}

}
