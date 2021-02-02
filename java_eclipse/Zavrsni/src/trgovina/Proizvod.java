package trgovina;

public class Proizvod {
	
	private int sifra;
	private String naziv, proizvodac, opis;
	private double cijena;
	
	
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


	
	

	

}
