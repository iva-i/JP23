package vjezba;

import javax.swing.JOptionPane;

public class Zadatak07 {

	public static void main(String[] args) {
		
		//korisnik unosi decimalni broj
		//program ispisuje samo cijeli dio broja
				
		String str=JOptionPane.showInputDialog("Unesi decimlani broj: ");
			
		char ch='.';
				
		int index=str.indexOf(ch)+1;
				
		char[] chs = str.toCharArray();
				
		String cij = new String(chs,0, chs.length - index);
				
		System.out.println(cij);


	}

}
