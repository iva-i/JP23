package tasks11;

public class GeometricObjectTriangle extends GeometricObject {

	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

	// constructors
	public GeometricObjectTriangle() {
		super();
	}

	public GeometricObjectTriangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// getters
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// methods
	/** returns area of a triangle */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	/** returns perimeter of a triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** Return a string representation of this object (triangle) */
	public String toString() {
		return "Object is a triangle whose side lengths are " + side1 + ", " + side2 + ", " + side3 + ".";
	}

}
