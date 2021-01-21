package tasks;

class Rectangle {

	// data fields (with initial values)
	private double width = 1;
	private double height = 1;

	// no-arg constructor
	// creates default rectangle
	public Rectangle() {
		super();
	}

	// constructor that creates rectangle with specified width and heigth
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	//getters and setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}	

	// method that returns area
	public double getArea() {
		return width * height;
	}

	// method that returns perimeter
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
