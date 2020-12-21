package edunova;

import javax.swing.JOptionPane;

public class E04Vjezbanje {

	
	// Korisnik unosi dva cijela broja.
	// Program ispisuje brojeve jedan pored drugog.
	
	public static void main(String[] args) {
		
		String a= JOptionPane.showInputDialog("Unesi broj");
		String b= JOptionPane.showInputDialog("Unesi broj");
		
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		
		System.out.println(a+" "+b);
		
		
	}
	
}
