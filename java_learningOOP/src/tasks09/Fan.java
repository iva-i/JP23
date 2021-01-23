package tasks09;

class Fan {

	// data fields
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;

	// no arg constructor
	public Fan() {
		this(SLOW, false, 5, "blue");
	}

	public Fan(int speed, boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}

	// getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// methods
	public String toString() {

		String s = "";

		if (this.on) {
			s = "Fan speed is " + this.speed + ", color is " + this.color + ", radius is " + this.radius + ".";
		} else {
			s = "Fan color is " + this.color + ", radius is " + this.radius + ". Fan is off.";
		}

		return s;
	}

}
