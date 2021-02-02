package trgovina;

public class Stavka {
	
	private int sifra;
	private Proizvod proizvod;
	private Racun racun;
	private double kolicina, cijena;
	
	
	//konstruktori
	public Stavka() {
		
	}
	
	public Stavka(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	public Stavka(int sifra, Proizvod proizvod, Racun racun, double kolicina) {
		this.sifra = sifra;
		this.proizvod = proizvod;
		this.racun = racun;
		this.kolicina = kolicina;
	}
	
	public Stavka(int sifra, Proizvod proizvod, Racun racun, double kolicina, double cijena) {
		this.sifra = sifra;
		this.proizvod = proizvod;
		this.racun = racun;
		this.kolicina = kolicina;
		this.cijena = cijena;
	}
	
	
	//getteri i setteri
	public int getSifra() {
		return sifra;
	}
	
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public Proizvod getProizvod() {
		return proizvod;
	}
	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	public Racun getRacun() {
		return racun;
	}
	public void setRacun(Racun racun) {
		this.racun = racun;
	}
	public double getKolicina() {
		return kolicina;
	}
	public void setKolicina(double kolicina) {
		this.kolicina = kolicina;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	
	

}
