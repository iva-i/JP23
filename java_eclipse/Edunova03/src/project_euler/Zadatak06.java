package project_euler;

public class Zadatak06 {

	public static void main(String[] args) {
		// Find the difference between the sum of the squares of the first one hundred
		// natural numbers and the square of the sum.
		
		int sumakv=0, pomoc= 0, kvsume=0;
		
		for(int i=1; i<101; i++) {
			sumakv+=i*i;
		}
		
		for(int i=1; i<101; i++) {
			pomoc+=i;
		}
		
		kvsume=pomoc*pomoc;
		
		System.out.println(kvsume-sumakv);

	}

}
