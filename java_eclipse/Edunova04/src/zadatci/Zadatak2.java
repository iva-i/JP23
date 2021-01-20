package zadatci;



public class Zadatak2 {

	public static void main(String[] args) {
		//ispisati sve parne brojeve od 10 do 50
		int i=10;
		
		do {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}while(i>=10 && i<=50);
		
		

	}

}
