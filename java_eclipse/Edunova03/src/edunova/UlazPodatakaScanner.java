package edunova;



public class UlazPodatakaScanner {

	public static void main(String[] args) {
		
		java.util.Scanner ulaz = new java.util.Scanner(System.in);
		
		System.out.print("Unesi broj: ");
		
		int i = ulaz.nextInt();
		int j = ulaz.nextInt();
		
		
		System.out.println(i+j);

	}

}
