package Zadatak2v2;

public class Vrsta extends Rod {

	private Naziv nazivVrsta;
	private String obiljezjaVrsta;

	
	public Vrsta() {
		super();
	}

	public Vrsta(Naziv nazivVrsta) {
		super();
		this.nazivVrsta = nazivVrsta;
	}
	
	
	public Vrsta(Naziv nazivVrsta, String obiljezjaVrsta) {
		super();
		this.nazivVrsta = nazivVrsta;
		this.obiljezjaVrsta = obiljezjaVrsta;
	}

	public Naziv getNazivVrsta() {
		return nazivVrsta;
	}

	public void setNazivVrsta(Naziv nazivVrsta) {
		this.nazivVrsta = nazivVrsta;
	}

	public String getobiljezjaVrsta() {
		return obiljezjaVrsta;
	}

	public void setobiljezjaVrsta(String obiljezjaVrsta) {
		this.obiljezjaVrsta = obiljezjaVrsta;
	}

}
