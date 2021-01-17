package tasks;

public class Task6029 {
	public static void main(String[] args) {
		// (Twin primes) Twin primes are a pair of prime numbers that differ by 2.
		// For example, 3 and 5 are twin primes, 5 and 7 are twin primes,
		// and 11 and 13 are twin primes.
		// Write a program to find all twin primes less than 1,200. Display the
		// output as follows:
		// (3, 5)
		// (5, 7)
		// ...
		
		for(int i = 2; i<1200; i++) {
			if(isPrime(i) && isPrime(i+2)) {
				System.out.printf("(%d,%d)\n"
						+ "",i,i+2);
			}
		}
		
	}
	
	static boolean isPrime(int num) {

		boolean prime = true;

		for (int i = 2; i < Math.sqrt(num) + 1; i++) {
			if (num != 2 && num % i == 0) {
				prime = false;
				break;
			}
		}

		return prime;

	}
}
