package project_euler;

public class Zadatak03 {

	public static void main(String[] args) {
		// The prime factors of 13195 are 5, 7, 13 and 29.
		// What is the largest prime factor of the number 600851475143 ?

		long broj = 600851475143L, najveci=0;

		for (int i =2; i <= broj; i++) {
			
			boolean isPrime = true;
			
			if (i < 2) {
				isPrime = false;
			}
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0 && i != 1) {
					isPrime = false;
				}
			}
			
			if (isPrime && broj%i==0) {
				broj=broj/i;
				najveci=i;
			}
		}
		
		System.out.println(najveci);

	}
}
