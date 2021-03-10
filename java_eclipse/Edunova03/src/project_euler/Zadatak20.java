package project_euler;

import java.math.BigInteger;

public class Zadatak20 {

	/**
	 * n! means n × (n − 1) × ... × 3 × 2 × 1
	 * 
	 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the
	 * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
	 * 
	 * Find the sum of the digits in the number 100!
	 */

	public static void main(String[] args) {
		
		BigInteger fact = factorial(100);
		BigInteger sum = sumOfDigits(fact);
		
		System.out.println("Sum of digits of 100! is " + sum);

	}
	
	public static BigInteger factorial(Integer num) {
		
		BigInteger fact = BigInteger.valueOf(1);
		
		for(int i = 1; i <= num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		return fact;
	}
	
	public static BigInteger sumOfDigits(BigInteger num) {
		
		char[] digits = num.toString().toCharArray();
		
		BigInteger sum = BigInteger.valueOf(0);
		
		for (Integer i = 0; i < digits.length; i++) {
			sum = sum.add(BigInteger.valueOf(Integer.parseInt(((Character) digits[i]).toString())));
		}
		
		return sum;
	}

}
