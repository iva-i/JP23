package vjezba;

import javax.swing.JOptionPane;

public class Zadatak03 {

	public static void main(String[] args) {
		//korisnik unosi decimalni broj
		//ukoliko je broj veći od 10, a manji od 20 
		//program ispisuje abc, inače def
		
		String a=JOptionPane.showInputDialog("Unesi broj: ");
		
		float i=Float.parseFloat(a);
		
		System.out.println(i>10 & i<20 ? "abc" : "def");
		
		

	}

}
