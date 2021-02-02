package trgovina;

public class Racun {

	private int sifra;
	private Djelatnik djelatnik;
	private String kupac;
	
	
	//konstruktori
	public Racun() {
		
	}
	
	public Racun(int sifra, Djelatnik djelatnik) {
		this.sifra = sifra;
		this.djelatnik = djelatnik;
	}
	
	public Racun(int sifra, Djelatnik djelatnik, String kupac) {
		this.sifra = sifra;
		this.djelatnik = djelatnik;
		this.kupac = kupac;
	}
	
	
	//getteri i setteri
	public int getSifra() {
		return sifra;
	}
	
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public Djelatnik getDjelatnik() {
		return djelatnik;
	}
	public void setDjelatnik(Djelatnik djelatnik) {
		this.djelatnik = djelatnik;
	}
	public String getKupac() {
		return kupac;
	}
	public void setKupac(String kupac) {
		this.kupac = kupac;
	}
	
	
}
