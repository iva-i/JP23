package vjezba;

import javax.swing.JOptionPane;

public class Zadatak08v2 {
	public static void main(String[] args) {
		
		//korisnik unosi koordinate od tri točke
		//. Napiši program koji određuje površinu trokuta
			
		
		double x1 = 
				Double.parseDouble(JOptionPane.showInputDialog("Unesi x koordinatu: "));
		double y1 =
				Double.parseDouble(JOptionPane.showInputDialog("Unesi y koordinatu: "));
		double x2 =
				Double.parseDouble(JOptionPane.showInputDialog("Unesi x koordinatu: "));
		double y2 =
				Double.parseDouble(JOptionPane.showInputDialog("Unesi y koordinatu: "));
		double x3 =
				Double.parseDouble(JOptionPane.showInputDialog("Unesi x koordinatu: "));
		double y3 =
				Double.parseDouble(JOptionPane.showInputDialog("Unesi y koordinatu: "));
		
		double a=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));	
		double b=Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		double c=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		
		
		double s=(a+b+c)/2;
		
		double pov=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println(pov);
		
		
			
		}
}
