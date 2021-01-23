package tasks10;

public class Circle2DTest {

	public static void main(String[] args) {

		/**
		 * Write a test program that creates a Circle2D object c1 (new Circle2D(2, 2,
		 * 5.5)), displays its area and perimeter, and displays the result of
		 * c1.contains(3, 3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new
		 * Circle2D(3, 5, 2.3)).
		 */

		Circle2D c1 = new Circle2D(2, 2, 5.5);

		System.out.printf(
				"c1: \narea: %f \nperimeter: %f \ncontains (3,3)?: %b \ncontains circle S(4,5), r=10.5?: %b \noverlaps circle S(3,5), r=2.3?: %b",
				c1.getArea(), c1.getPerimeter(), c1.contains(3, 3), c1.contains(new Circle2D(4, 5, 10.5)),
				c1.overlaps(new Circle2D(3, 5, 2.3)));

	}

}
