package tasks;

class QuadraticEquation {

	// data fields
	private double a, b, c;

	// constructor
	public QuadraticEquation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// getters
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	// methods
	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	public double getRoot1() {
		double root = 0;
		if (getDiscriminant() >= 0) {
			root = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		} else {
			root = 0;
		}

		return root;
	}

	public double getRoot2() {
		double root = 0;
		if (getDiscriminant() >= 0) {
			root = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		} else {
			root = 0;
		}

		return root;
	}

}
