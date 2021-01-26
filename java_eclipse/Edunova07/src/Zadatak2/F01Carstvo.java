package Zadatak2;

//*apstraktna klasa ne može biti instancirana
public abstract class F01Carstvo {

	private String nazivCarstvo, opis;

	// getteri i setteri
	public String getNazivCarstvo() {
		return nazivCarstvo;
	}

	public void setNazivCarstvo(String nazivCarstvo) {
		this.nazivCarstvo = nazivCarstvo;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

}