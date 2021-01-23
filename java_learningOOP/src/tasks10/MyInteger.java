package tasks10;

public class MyInteger {

	private int value;

	// constructors
	public MyInteger() {
		this(0);
	}

	public MyInteger(int value) {
		this.value = value;
	}

	// getter
	public int getValue() {
		return value;
	}

	// methods
	public boolean isEven() {
		return MyInteger.isEven(this.value);
	}

	public boolean isOdd() {
		return MyInteger.isOdd(this.value);
	}

	public boolean isPrime() {
		return MyInteger.isPrime(this.value);
	}

	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}

	public static boolean isPrime(int value) {
		for (int i = 2; i <= Math.sqrt(value); i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger value) {
		return MyInteger.isEven(value.getValue());
	}

	public static boolean isOdd(MyInteger value) {
		return MyInteger.isOdd(value.getValue());
	}

	public static boolean isPrime(MyInteger value) {
		return MyInteger.isPrime(value.getValue());
	}

	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(MyInteger value) {
		return equals(value.getValue());
	}

}
