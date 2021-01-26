package Zadatak2v2;

public class Rod extends Potporodica{

	private Naziv nazivRod;
	private String obiljezjaRod;
	
	
	public Rod() {
		super();
	}
	
	public Rod(Naziv nazivRod) {
		super();
		this.nazivRod = nazivRod;
	}
	
	public Rod(Naziv nazivRod, String obiljezjaRod) {
		super();
		this.nazivRod = nazivRod;
		this.obiljezjaRod = obiljezjaRod;
	}
	

	public Naziv getNazivRod() {
		return nazivRod;
	}

	public void setNazivRod(Naziv nazivRod) {
		this.nazivRod = nazivRod;
	}

	public String getObiljezjaRod() {
		return obiljezjaRod;
	}

	public void setObiljezjaRod(String obiljezjaRod) {
		this.obiljezjaRod = obiljezjaRod;
	}	
	
}
