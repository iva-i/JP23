package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zadatak1 {
	public static void main(String[] args) {
	
		// korisnik unosi cijeli broj.
	// Program ispisuje 1 ako ne neparan, 0 ako je paran
		
		String a = JOptionPane.showInputDialog("Unesi broj: ");
		
		int i=Integer.parseInt(a);
		
		System.out.println(i%2);
	
	
	}
	}	

