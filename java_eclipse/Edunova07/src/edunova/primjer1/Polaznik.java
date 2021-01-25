package edunova.primjer1;

public class Polaznik extends Osoba {
	// ima sva svojstva kao osoba

	private String brojUgovora;
	private int status;
	
	public Polaznik() {
		super(); //poziva prazan konstruktor od osobe
				// i bez supera radi
	}

	//iako nema ova klasa ime i prezime nasljeđeno je iz Osoba
	public Polaznik(String ime, String prezime, String brojUgovora) {
		super(ime, prezime); //poziva pun konstruktor od Osoba
		this.brojUgovora = brojUgovora;
	}



	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		// kad se obraćam prvoj natklasi koristim ključnu riječ super
		super.status = 1; // status iz Osoba
		this.status = 2; // ovaj status
		this.brojUgovora = brojUgovora;
	}

}
