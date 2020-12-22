package vjezba;

import javax.swing.JOptionPane;

public class Zadatak06 {

	public static void main(String[] args) {
		//korisnik unosi decimalni broj
		//program ispisuje samo decimalni dio broja
		
		String str=JOptionPane.showInputDialog("Unesi decimlani broj: ");
		
		char ch='.';
		
		int index=str.indexOf(ch)+1;
		
		char[] chs = str.toCharArray();
		
		String dec = new String(chs, index, chs.length - index);
		
		System.out.println(dec);

	}

}
