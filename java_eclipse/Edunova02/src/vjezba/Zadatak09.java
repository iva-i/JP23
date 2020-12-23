package vjezba;

import javax.swing.JOptionPane;

public class Zadatak09 {
	public static void main(String[] args) {
		
		//korsinik unosi koordinate točke
		//program provjerava da li se točka nalazi unutar trokuta
		//s vrhovima (0,0),(0,200) i (100,0)
		
	double x = 
			Double.parseDouble(JOptionPane.showInputDialog("Unesi x koordinatu: "));
	double y =
			Double.parseDouble(JOptionPane.showInputDialog("Unesi y koordinatu: "));
	
	
	if(x<200 && x>0 && y<(-1/2)*x+100 && y>0) {
		System.out.println("Točka se nalazi unutar trokuta");
	}else {
		System.out.println("Točka se nalazi izvan trokuta");
	}
	
}
}
