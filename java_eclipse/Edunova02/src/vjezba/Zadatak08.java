package vjezba;

public class Zadatak08 {
	public static void main(String[] args) {
		
	//. Napiši program koji određuje površinu trokuta zadanih stranica.
		
	float a=3;
	float b=4;
	float c=5;
	
	float s=(a+b+c)/2;
	
	double pov=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	
	System.out.println(pov);
	
	
		
	}
}
