package edunova;

public class E02UvjernoGranjaneIf {

	public static void main(String[] args) {
		
		int i=7;
		int j=10; 
		
		if(i==7) {
			System.out.println("To je OK");
		}
		
		if(i==7) 
			System.out.println("To je isto OK");
		
		if(i==7) {
			System.out.println("OK");
		}else {
			System.out.println("NE");
		}
		
		if(i==7) {
			if(j==10) {
				System.out.println("OK 1");
			}
		}
		
		if (i==7 & j==10){
			System.out.println("OK!");
		}
		
		if (i==7 && j==10){
			System.out.println("OK!");
		}
		
		if (i>4 | j<5){
			System.out.println("OK 2");
		}
		
		int a=2;
		
		System.out.println(a==2 ? "ok" : "ne");
		
		
		
		
		

	}

}
