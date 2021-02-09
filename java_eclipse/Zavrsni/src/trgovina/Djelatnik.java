package trgovina;

public class Djelatnik {

	private int sifra;
	private String ime, prezime, jbmag, oib, strucnaSprema;
	
	
	//konstrktori
	public Djelatnik() {
		
	}
	
	public Djelatnik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public Djelatnik(int sifra, String ime, String prezime, String jbmag, String oib) {
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.jbmag = jbmag;
		this.oib = oib;
	}
	
	
	//getteri i setteri
	public int getSifra() {
		return sifra;
	}
	
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
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
	public String getJbmag() {
		return jbmag;
	}
	public void setJbmag(String jbmag) {
		this.jbmag = jbmag;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}

	public String getStrucnaSprema() {
		return strucnaSprema;
	}

	public void setStrucnaSprema(String strucnaSprema) {
		this.strucnaSprema = strucnaSprema;
	}
	
	
	
}
