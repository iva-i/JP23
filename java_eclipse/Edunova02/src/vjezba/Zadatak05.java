package vjezba;

import javax.swing.JOptionPane;

public class Zadatak05 {

	public static void main(String[] args) {
		// Program od korisnika unosi slovo
		// u slučaju slova A ispisuje 1. mjesto
		// pa sve do slova E gdje ispisuje 5. mjesto
		
		String a=JOptionPane.showInputDialog("Unesi slovo: ");
				
		char c = a.charAt(0);
		
		switch(c) {
        case 'a'->System.out.println("1. mjesto");
        case 'b'->System.out.println("2. mjesto");
        case 'c'->System.out.println("3. mjesto");
        case 'd'->System.out.println("4. mjesto");
        case 'e'->System.out.println("5. mjesto");

	}
	}
}
