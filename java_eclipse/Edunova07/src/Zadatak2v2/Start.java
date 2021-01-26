package Zadatak2v2;

//Kreirajte paket zadatak2
//Kreirajte model klasa koji opisuje svijet flore i faune
//na minimalno 4 razine nasljeđivanja
//na svakoj razini nasljeđivanja u klasi definirajte minimalno 2 svojstva
//Instancijrajte svaku od kreiranih najnižih klasa
//klase na višoj razini proglasite pastraktnima

public class Start {
	
	public Start() {
		
		Naziv nazivRod = new Naziv("pčela");
		
		Rod rod = new Rod(nazivRod);
		rod.setNazivCarstvo(new Naziv("životinje", "Animalia"));
		
		Staniste staniste = new Staniste("livada");
		
		Vrsta vrsta = new Vrsta(new Naziv("medonosna pčela"));
		vrsta.setStaniste(staniste);
		
		System.out.printf("Vrsta %s je roda %s.",vrsta.getNazivVrsta().getHrvatskiNaziv(),nazivRod.getHrvatskiNaziv());
		System.out.println();
	}

	public static void main(String[] args) {

		new Start();

	}

}
