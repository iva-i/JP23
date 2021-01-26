package Zadatak2;

public class F05Red extends F04Razred{
	
	private String nazivRed, latinskiNazivRed;
	
	
	public F05Red() {
		super();
	}

	public F05Red(String nazivRed, String latinskiNazivRed) {
		super();
		this.nazivRed = nazivRed;
		this.latinskiNazivRed = latinskiNazivRed;
	}
	

	public String getNazivRed() {
		return nazivRed;
	}

	public void setNazivRed(String nazivRed) {
		this.nazivRed = nazivRed;
	}

	public String getLatinskiNazivRed() {
		return latinskiNazivRed;
	}

	public void setLatinskiNazivRed(String latinskiNazivRed) {
		this.latinskiNazivRed = latinskiNazivRed;
	}

}
