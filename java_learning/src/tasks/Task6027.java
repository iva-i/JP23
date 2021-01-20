package tasks;

public class Task6027 {

	public static void main(String[] args) {
		// (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime
		// number whose reversal is also a prime.
		// For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps.
		// Write a program that displays the first 120 emirps. Display
		// 10 numbers per line, separated by exactly one space, as follows:
		// 13 17 31 37 71 73 79 97 107 113
		// 149 157 167 179 199 311 337 347 359 389
		// ...

		int counter = 0, help = 0;

		for (int i = 10; i < 100000000; i++) {
			if (isPrime(i) && isPrime(reverse(i))) {
				if (reverse(i) != i) {
					System.out.print(i + " ");
					counter++;
				}
			}

			if (counter % 10 == 0 && counter != help) {
				System.out.println();
				help = counter;
			}

			if (counter == 120) {
				break;
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

	public static int reverse(int number) {

		String s = String.valueOf(number);

		int help = 0, reverse = 0;

		for (int i = s.length(); i >= 0; i--) {
			help = number % 10;
			number /= 10;
			reverse += help * Math.pow(10, i - 1);
		}

		return reverse;

	}
}
