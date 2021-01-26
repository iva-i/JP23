package Zadatak2;

public class F07Vrsta extends F06Porodica {
	
	private String nazivVrsta, karakteristike;
	
	
	public F07Vrsta() {
		super();
	}

	public F07Vrsta(String nazivVrsta, String karakteristike) {
		super();
		this.nazivVrsta = nazivVrsta;
		this.karakteristike = karakteristike;
	}
	

	public String getNazivVrsta() {
		return nazivVrsta;
	}

	public void setNazivVrsta(String nazivVrsta) {
		this.nazivVrsta = nazivVrsta;
	}

	public String getKarakteristike() {
		return karakteristike;
	}

	public void setKarakteristike(String karakteristike) {
		this.karakteristike = karakteristike;
	}
	
	
	

}
