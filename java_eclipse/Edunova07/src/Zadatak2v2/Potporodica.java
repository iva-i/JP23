package Zadatak2v2;

public abstract class Potporodica extends Porodica {

	private Naziv nazivPotporodica;
	private Staniste staniste;
	
	
	public Naziv getNazivPotporodica() {
		return nazivPotporodica;
	}
	public void setNazivPotporodica(Naziv nazivPotporodica) {
		this.nazivPotporodica = nazivPotporodica;
	}
	public Staniste getStaniste() {
		return staniste;
	}
	public void setStaniste(Staniste staniste) {
		this.staniste = staniste;
	}	
	
}
