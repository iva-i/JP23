package edunova;

import javax.swing.JOptionPane;

public class E03Omotaci {

	public static void main(String[] args) {
		
		String unioKorisnik= JOptionPane.showInputDialog("Unesi broj");
		
		int i = Integer.parseInt(unioKorisnik);
		
		System.out.println(i);
		
		boolean bo = Boolean.parseBoolean("true");
		char c = Character.forDigit(23,16);
		System.out.println(c);
		
		byte b=Byte.parseByte("12");
		short s=Short.parseShort("2");
		long l=Long.parseLong("12");
		
		//decimalni brojevi
		float f=Float.parseFloat("12.99");
		System.out.println(f);
		double d = Double.parseDouble("12.99");
		System.out.println(d);
		
		
	}

}
