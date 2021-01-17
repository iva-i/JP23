package tasks;

public class Task6028 {

	public static void main(String[] args) {
		// (Mersenne prime) A prime number is called a Mersenne prime if it can
		// be written in the form 2^p - 1 for some positive integer p.
		// Write a program that finds all Mersenne primes with p <= 31.
		
		System.out.printf("p          2^p-1 \n");
		System.out.println("________________");
		
		for(int i=2; i<=2147483647; i++ ) {
			if(isPrime(marsenne(i))) {
				System.out.printf(i +"          "+marsenne(i)+"\n");
			}
		}

	}
	
	static int marsenne(int num) {
		
		int marsenne = (int)Math.pow(2, num)-1;
		
		return marsenne;
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
