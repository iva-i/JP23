package edunova;

import javax.swing.JOptionPane;

public class E06Vjezbanje {
	public static void main(String[] args) {
	// Korisnik unosi decimalni broj
	// Program ispisuje samo cijeli dio broja
	
	String a=JOptionPane.showInputDialog("Unesi broj");
	
	float j=Float.parseFloat(a);
	int broj = (int)(j);
	
	System.out.println(broj);		

		
	}
}
