package edunova;

import javax.swing.JOptionPane;

public class E07Vjezba {

	public static void main(String[] args) {
	
		// Korisnik unosi decimalni broj
		// Program ispisuje samo decimalni dio broja
		
		String a=JOptionPane.showInputDialog("Unesi broj");
		
		float j=Float.parseFloat(a);
		int i=(int)(j);
		
		System.out.println(j-i);	

	}

}
