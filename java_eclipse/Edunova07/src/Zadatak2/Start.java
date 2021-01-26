package Zadatak2;

// OVO RJEŠENJE NEMA SMISLA

//Kreirajte paket zadatak2
//Kreirajte model klasa koji opisuje svijet flore i faune
//na minimalno 4 razine nasljeđivanja
//na svakoj razini nasljeđivanja u klasi definirajte minimalno 2 svojstva
//Instancijrajte svaku od kreiranih najnižih klasa
//klase na višoj razini proglasite pastraktnima

public class Start {
	
	public Start() {
		
		F05Red red = new F05Red();
		red.setLatinskiNazivRed("Hymenoptera");
		red.setNazivCarstvo("Životinje");
		red.setNazivNatkoljeno("Dvostrano simetrične životinje");
		red.setNazivKoljeno("Člankonošci");
		red.setNazivRazred("Kukci");
		red.setNazivRed("Opnokrilci");
		
		F06Porodica porodica = new F06Porodica();
		porodica.setNazivPorodica("Pčele");
		porodica.setNazivCarstvo(red.getNazivCarstvo());
		porodica.setNazivRed(red.getNazivRed());
		
		F07Vrsta vrsta = new F07Vrsta();
		vrsta.setNazivVrsta("Medonosna pčela");
		vrsta.setNazivPorodica(porodica.getNazivPorodica());
		vrsta.setNazivCarstvo(porodica.getNazivCarstvo());
		
		System.out.printf("Vrsta %s pripada porodici %s, u carstvu %s.", vrsta.getNazivVrsta(),vrsta.getNazivPorodica(),vrsta.getNazivCarstvo());
		
	}

	public static void main(String[] args) {

		new Start();
		
	}

}
