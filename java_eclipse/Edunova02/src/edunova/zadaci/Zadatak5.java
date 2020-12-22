package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zadatak5 {

	public static void main(String[] args) {
		String a= JOptionPane.showInputDialog("Unesi broj");
		
		int i = Integer.parseInt(a);
		
		System.out.println(i%2==0 ? "Osijek" : "Zagreb");

	}

}
