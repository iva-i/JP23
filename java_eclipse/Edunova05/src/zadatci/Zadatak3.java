package zadatci;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// kreiraj metodu naziva ucitajBroj tipa int
		// koja od korisnika beskonačno traži unos
		// sve dok korisnik ne unese veći od 0
		// kada se to dogodi metoda tako unesenu vrijednost
		// vrati onome koji ju je pozvao

		System.out.println(ucitajBroj());

	}

	static int ucitajBroj() {
		Scanner input = new Scanner(System.in);

		int broj = -1;
		
		input.close();

		while (broj < 0) {
			System.out.println("unesi broj ");
			broj = input.nextInt();
		}

		return broj;
	}

}
