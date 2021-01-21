package tasks;

public class RegularPolygon {

	// data fields
	private int n = 3; // number of sides
	private double side = 1; // side's length
	private double x = 0, y = 0; // coordinates od polygon's center
	
	//constructors
	public RegularPolygon() {
		super();
	}
	
	public RegularPolygon(int n, double side) {
		super();
		this.n = n;
		this.side = side;
	}

	public RegularPolygon(int n, double side, double x, double y) {
		super();
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	//getters and setters
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	//methods
	public double getPerimeter() {
		return n*side;
	}
	
	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
}
