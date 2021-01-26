package Zadatak2;

public class F06Porodica extends F05Red {
	
	private String nazivPorodica, staniste;
	
	
	public F06Porodica() {
		super();
	}

	public F06Porodica(String nazivPorodica, String staniste) {
		super();
		this.nazivPorodica = nazivPorodica;
		this.staniste = staniste;
	}

	
	public String getNazivPorodica() {
		return nazivPorodica;
	}

	public void setNazivPorodica(String nazivPorodica) {
		this.nazivPorodica = nazivPorodica;
	}

	public String getStaniste() {
		return staniste;
	}

	public void setStaniste(String staniste) {
		this.staniste = staniste;
	}
	
}
