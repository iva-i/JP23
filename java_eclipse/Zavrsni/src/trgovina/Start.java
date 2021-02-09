package trgovina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

	private List<Proizvod> proizvodi;
	private List<Djelatnik> djelatnici;
	private List<Stavka> stavke;

	private Start() {

		proizvodi = new ArrayList<>();

		glavniIzbornik();

	}

	public static void main(String[] args) {
		new Start();
	}

	// ******************* IZBORNICI i POMOĆNE METODE ******************************
	public static final Scanner ulaz = new Scanner(System.in);

	private int odaberiOpciju(String poruka, int min, int max) {

		int opcija;

		while (true) {
			System.out.println(poruka + ": ");

			try {
				opcija = ulaz.nextInt();
				if (opcija < min || opcija > max) {
					System.out.println("Moguće opcije su " + min + "-" + max);
				}
				return opcija;
			} catch (Exception e) {
				System.out.println("Neispravan unos!");
			}
		}

	}

	public static int ucitajCijeliBroj(String poruka) {
		int i;
		while (true) {
			System.out.print(poruka + ": ");
			try {
				i = ulaz.nextInt();
				return i;
			} catch (Exception e) {
				System.out.println("Neispravan unos!");
			}
		}
	}
	
	public static double ucitajDecimalniBroj(String poruka) {
		double i;
		while (true) {
			System.out.print(poruka + ": ");
			try {
				i = ulaz.nextDouble();
				return i;
			} catch (Exception e) {
				System.out.println("Neispravan unos!");
			}
		}
	}

	public static String ucitajString(String poruka) {
		String s;
		while (true) {
			System.out.print(poruka + ": ");
			ulaz.nextLine();
			s = ulaz.nextLine();
			if (s.trim().isEmpty()) {
				System.out.println("Obavezan unos!");
				continue;
			}
			return s;
		}
	}

	private void glavniIzbornik() {

		System.out.println("||||| TRGOVINA |||||");

		stavkeGlavnogIzbornika();

		switch (odaberiOpciju("Odaberi opciju", 1, 5)) {
		case 1:
			proizvodiIzbornik();
			break;
		case 2:
			racunIzbornik();
			break;
		case 3:
			stavkaIzbornik();
			break;
		case 5:
			System.out.println("Doviđenja!");
			break;
		}

	}

	private void stavkaIzbornik() {
		
		stavkeStavkeIzbornik();
		
		switch (odaberiOpciju("Odaberi opciju", 1, 2)) {
		case 1:
			dodajStavku();
			break;
		case 2:
			glavniIzbornik();
			break;

		}
		
	}

	

	private void dodajStavku() {

		System.out.println("~~~~~ Dodavanje stavke ~~~~~");

		Stavka s = new Stavka();
		Proizvod p = new Proizvod(Start.ucitajString("Unesi proizvod"));
		s.setProizvod(p);
		s.setKolicina(Start.ucitajDecimalniBroj("Unesi količinu"));
		s.setCijena(Start.ucitajDecimalniBroj("Unesi cijenu"));		

		stavke.add(s);

		stavkaIzbornik();
		
	}

	private void stavkeStavkeIzbornik() {
		
		System.out.println("~~~~~ STAVKE ~~~~~ ");
		System.out.println("1. Dodaj stavku");
		System.out.println("2. Glavni izbornik");
		
	}

	private void stavkeGlavnogIzbornika() {
		System.out.println("1. Proizvodi");
		System.out.println("2. Racun");
		System.out.println("3. Stavka");
		System.out.println("4. Djelatnik");
		System.out.println("5. Izlaz");
	}

	private void proizvodiIzbornik() {

		stavkeProizvodiIzbornik();

		switch (odaberiOpciju("Odaberi opciju", 1, 3)) {
		case 1:
			prikaziProizvode();
			break;
		case 2:
			dodajProizvod();
			break;
		case 3:
			glavniIzbornik();
			break;

		}

	}

	private void stavkeProizvodiIzbornik() {

		System.out.println("~~~~~ PROIZVODI ~~~~~ ");
		System.out.println("1. Izlistaj proizvode");
		System.out.println("2. Dodaj proizvod");
		System.out.println("3. Glavni izbornik");

	}

	private void dodajProizvod() {

		System.out.println("~~~~~ Dodavanje proizvoda ~~~~~");

		Proizvod p = new Proizvod();
		p.setNaziv(Start.ucitajString("Unesi naziv proizvoda"));
		p.setSifra(Start.ucitajCijeliBroj("Unesi sifru proizvoda"));

		proizvodi.add(p);

		proizvodiIzbornik();

	}

	private void prikaziProizvode() {

		System.out.println("~~~~~ Izlistanje proizvoda ~~~~~");

		if (proizvodi.isEmpty()) {
			System.out.println("Nema proizvoda!");
		} else {
			for (Proizvod proizvod : proizvodi) {
				System.out.println(proizvod.getNaziv());
			}
		}

		proizvodiIzbornik();
	}

	private void racunIzbornik() {

		stavkeRacunIzbornik();

		switch (odaberiOpciju("Odaberi opciju", 1, 3)) {
		case 1:
			prikaziDjelatnika();
			break;
		case 2:
			prikaziSifruRacuna();
			break;
		case 3:
			glavniIzbornik();
			break;
		}

	}

	private void stavkeRacunIzbornik() {

		System.out.println("~~~~~ RACUN ~~~~~");

		System.out.println("1. Prikazi djelatnika");
		System.out.println("2. Prikazi sifru racuna");
		System.out.println("3. Glavni izbornik");
	}

	private void prikaziDjelatnika() {
		System.out.println("u izradi");
	}
	
	private void prikaziSifruRacuna() {
		System.out.println("u izradi");
	}

}
