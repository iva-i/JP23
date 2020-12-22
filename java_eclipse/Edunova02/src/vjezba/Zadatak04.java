package vjezba;

import javax.swing.JOptionPane;

public class Zadatak04 {

	public static void main(String[] args) {
		
		//korisnik unosi 2 cijela broja
		//ukoliko je njihov produkt paran program ispisuje razliku ta 2 broja
		//inače ispisuje cijeli dio njihovog kvocijenta

		
		String a=JOptionPane.showInputDialog("Unesi broj: ");
		String b=JOptionPane.showInputDialog("Unesi broj: ");
		
		int i=Integer.parseInt(a);
		int j=Integer.parseInt(b);
		
		if((i*j) %2==0) {
			System.out.println(i-j);
		}else {
			System.out.println((int)(i/j));
		}
		
		
		
		
	}

}
