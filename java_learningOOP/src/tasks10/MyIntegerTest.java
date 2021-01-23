package tasks10;

public class MyIntegerTest {

	public static void main(String[] args) {

		/**
		 * Write a client program that tests all methods in the class.
		 */

		MyInteger myInt = new MyInteger(5);

		System.out.printf("My integer is: %d", myInt.getValue());
		System.out.println();
		System.out.printf("\nMy integer is even?: %b", myInt.isEven());
		System.out.printf("\nMy integer is odd?: %b", myInt.isOdd());
		System.out.printf("\nMy integer is prime?: %b", myInt.isPrime());
		System.out.println();
		System.out.printf("\nMy integer is even?: %b", MyInteger.isEven(myInt));
		System.out.printf("\nMy integer is odd?: %b", MyInteger.isOdd(myInt));
		System.out.printf("\nMy integer is prime?: %b", MyInteger.isPrime(myInt));
	}

}
