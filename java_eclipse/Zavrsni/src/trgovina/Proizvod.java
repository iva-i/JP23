package trgovina;

public class Proizvod {
	
	private int sifra;
	private String sifraProizvoda, naziv, proizvodac, opis, mjernaJedinica;
	private double cijena, kolicinaNaStanju;
	private boolean naStanju;
	
	
	//konstruktori
	public Proizvod() {
		
	}
	
	public Proizvod(String naziv) {
		this.naziv = naziv;
	}
	
	public Proizvod(String naziv, double cijena) {
		this.naziv = naziv;
		this.cijena = cijena;
	}
	
	public Proizvod(int sifra, String naziv, double cijena) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.cijena = cijena;
	}
	
	public Proizvod(int sifra, String naziv, String proizvodac, String opis, double cijena) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.proizvodac = proizvodac;
		this.opis = opis;
		this.cijena = cijena;
	}	
	
	public Proizvod(int sifra, String sifraProizvoda, String naziv, String proizvodac, String opis,
			String mjernaJedinica, double cijena, double kolicinaNaStanju, boolean naStanju) {
		this.sifra = sifra;
		this.sifraProizvoda = sifraProizvoda;
		this.naziv = naziv;
		this.proizvodac = proizvodac;
		this.opis = opis;
		this.mjernaJedinica = mjernaJedinica;
		this.cijena = cijena;
		this.kolicinaNaStanju = kolicinaNaStanju;
		this.naStanju = naStanju;
	}

	//getteri i setteri 
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getProizvodac() {
		return proizvodac;
	}
	public void setProizvodac(String proizvodac) {
		this.proizvodac = proizvodac;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}

	public String getSifraProizvoda() {
		return sifraProizvoda;
	}

	public void setSifraProizvoda(String sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}

	public String getMjernaJedinica() {
		return mjernaJedinica;
	}

	public void setMjernaJedinica(String mjernaJedinica) {
		this.mjernaJedinica = mjernaJedinica;
	}

	public double getKolicinaNaStanju() {
		return kolicinaNaStanju;
	}

	public void setKolicinaNaStanju(double kolicinaNaStanju) {
		this.kolicinaNaStanju = kolicinaNaStanju;
	}

	public boolean isNaStanju() {
		return naStanju;
	}

	public void setNaStanju(boolean naStanju) {
		this.naStanju = naStanju;
	}
}
