package tasks09;

public class RectangleTest {

	public static void main(String[] args) {

		// creating Rectangle objects
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);

		// displaying width, height, area and perimeter of both rectangles
		System.out.println("Rectangle 1:" + "\n width: " + rec1.getWidth() + "\n height: " + rec1.getHeight() + "\n area: " + rec1.getArea()
		+ "\n perimeter: " + rec1.getPerimeter());
		
		System.out.println("Rectangle 2:" + "\n width: " + rec2.getWidth() + "\n height: " + rec2.getHeight() + "\n area: " + rec2.getArea()
		+ "\n perimeter: " + rec2.getPerimeter());

	}

}
