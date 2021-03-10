package project_euler;

public class Zadatak21 {

	/**
	 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
	 * which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
	 * and b are an amicable pair and each of a and b are called amicable numbers.
	 * 
	 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
	 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
	 * 71 and 142; so d(284) = 220.
	 * 
	 * Evaluate the sum of all the amicable numbers under 10000.
	 */
	public static void main(String[] args) {
		
		System.out.println("Sum of amicable numbers under 10000 is " + sumOfAmicableNums(10000));
	}
	
	public static int sumOfAmicableNums(int num) {
		
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			if(amicableNumbers(i)) {
				sum += i;
			}
		}
		
		return sum;		
	}
	
	public static boolean amicableNumbers(int num1) {
		
		boolean isAmicable = false;
		
		int num2 = sumOfDivisors(num1);
		
		if(num1 != num2 && sumOfDivisors(num2) == num1) {
			isAmicable = true;
		}
		
		return isAmicable;
	}
	
	public static int sumOfDivisors(int num) {
		
		int sum = 0;
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}

}
