package edunova.primjer1;

//abstract - onemogući stvaranje objekata Osoba
//nema smisla pravit Osobu jer je ona vezana uz polaznik, predavač, ..
public abstract class Osoba {
	// budući da nijedna klasa nema konstruktor nasljeđuje se
	// konstruktor klase Object - njega koristimo
	//ovdje dodan naknadno

	// data fields
	private String ime; // vidi samo ova klasa
	private String prezime;
	protected int status; // vidi ova klasa i sve podklase
	
	public Osoba() {
		//ako se nasljeđuje Object nema smisla zvati super
	}

	public Osoba(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}



	// getters and setters
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

}
