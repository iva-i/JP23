package tasks10;

class MyPoint {

	private double x, y;

	// constructors
	public MyPoint() {
		this(0, 0);
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// getters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// methods
	/**
	 * returns the distance from this point to a specified point of the MyPoint
	 * type.
	 * 
	 * @param point
	 * @return double
	 */
	public double distance(MyPoint point) {
		return Math.sqrt(Math.pow((point.getX() - this.x), 2) + Math.pow((point.getY() - this.y), 2));
	}

	/**
	 * returns the distance from this point to another point with specified x- and
	 * y-coordinates.
	 * 
	 * @param x
	 * @param y
	 * @return double
	 */
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
	}

	/**
	 * static method named distance that returns the distance from two MyPoint
	 * objects
	 * 
	 * @param p1
	 * @param p2
	 * @return double
	 */
	public static double distance(MyPoint p1, MyPoint p2) {
		return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
	}

}
