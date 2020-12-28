package vjezba;

import javax.swing.JOptionPane;

public class Zadatak10 {
	//korisnik unosi težinu i cijenu istog proizvoda u dva različita pakiranja
	//program ispisuje bolju cijenu
	
	public static void main(String[] args) {
		
		double t1 = 
				Double.parseDouble(JOptionPane.showInputDialog("Unesi težinu: "));
		double c1 =
				Double.parseDouble(JOptionPane.showInputDialog("Unesi cijenu: "));
		double t2 = 
				Double.parseDouble(JOptionPane.showInputDialog("Unesi težinu: "));
		double c2 =
				Double.parseDouble(JOptionPane.showInputDialog("Unesi cijenu: "));
		
		if(c1/t1<c2/t2) {
			System.out.println("Prva cijena je bolja");
		}else {
			System.out.println("Prva cijena je bolja");
			}

	}

}
