package vjezba;

import javax.swing.JOptionPane;

public class Zadatak04v2 {
public static void main(String[] args) {
		
		//korisnik unosi 2 cijela broja
		//ukoliko je njihov produkt paran program ispisuje razliku ta 2 broja
		//inače ispisuje cijeli dio njihovog kvocijenta
	
	String a=JOptionPane.showInputDialog("Unesi broj: ");
	String b=JOptionPane.showInputDialog("Unesi broj: ");
	
	int i=Integer.parseInt(a);
	int j=Integer.parseInt(b);
	
	switch(i*j%2) {
	case 0 -> System.out.println(i-j);
	default->System.out.println(i/j);
	}
	
}	
}
