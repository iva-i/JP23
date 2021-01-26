package Zadatak2v2;

public class Naziv {

	private String hrvatskiNaziv, latinskiNaziv;

	
	public Naziv() {
		
	}
	
	public Naziv(String hrvatskiNaziv) {
		this.hrvatskiNaziv = hrvatskiNaziv;
	}
	
	public Naziv(String hrvatskiNaziv, String latinskiNaziv) {
		this.hrvatskiNaziv = hrvatskiNaziv;
		this.latinskiNaziv = latinskiNaziv;
	}
	

	public String getHrvatskiNaziv() {
		return hrvatskiNaziv;
	}

	public void setHrvatskiNaziv(String hrvatskiNaziv) {
		this.hrvatskiNaziv = hrvatskiNaziv;
	}

	public String getLatinskiNaziv() {
		return latinskiNaziv;
	}

	public void setLatinskiNaziv(String latinskiNaziv) {
		this.latinskiNaziv = latinskiNaziv;
	}
	
}