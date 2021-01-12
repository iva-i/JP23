package tasks;

public class Task5012 {
	public static void main(String[] args) {
		// (Find the smallest n such that n^3 7 12,000) Use a while loop to find the
		// smallest integer n such that n^3 is greater than 12,000.
		
		double n=0;
		
		while(Math.pow(n, 3)<12000) {
			n++;
		}
		
		System.out.println(n);
	}
}
