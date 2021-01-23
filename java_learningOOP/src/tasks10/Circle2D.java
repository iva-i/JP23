package tasks10;

class Circle2D {

	private double x, y, radius; // (x,y) is the center of a circle

	// constructors
	public Circle2D() {
		this(0, 0, 1);
	}

	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// getters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	// methods
	/**
	 * returns the area of the circle
	 * 
	 * @return double
	 */
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	/**
	 * returns the perimeter of a circle
	 * 
	 * @return double
	 */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/**
	 * returns distance between this point and specified point
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public double getDistance(double x, double y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}

	/**
	 * returns true if the specified point (x, y) is inside this circle
	 * 
	 * @param x
	 * @param y
	 * @return boolean
	 */
	public boolean contains(double x, double y) {
		if (getDistance(x, y) < radius) {
			return true;
		}

		return false;
	}

	/**
	 * returns true if the specified circle is inside this circle
	 * 
	 * @param circle
	 * @return boolean
	 */
	public boolean contains(Circle2D circle) {
		if (radius < circle.getRadius() + getDistance(circle.getX(), circle.getY())) {
			return false;
		}

		return true;

	}

	/**
	 * returns true if the specified circle overlaps with this circle
	 * 
	 * @param circle
	 * @return boolean
	 */
	public boolean overlaps(Circle2D circle) {
		if (getDistance(circle.getX(), circle.getY()) > radius + circle.getRadius()) {
			return false;
		}
		return true;
	}

}
