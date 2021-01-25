package edunova.primjer1;

import javax.swing.JButton;

public class Start {

	public Start() {
		Polaznik polaznik = new Polaznik(); //pouvao se konstruktor klase Object
		polaznik.setIme("Ivan");
		polaznik.setPrezime("Mak");
		polaznik.setBrojUgovora("1/2021");

		Ravnatelj ranatelj = new Ravnatelj();
}

	public static void main(String[] args) {

		new Start();
	}
}
