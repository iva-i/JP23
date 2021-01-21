package tasks;

public class RegularPolygonTest {

	public static void main(String[] args) {
		/**
		 * Write a test program that creates three RegularPolygon objects, created using
		 * the no-arg constructor, using RegularPolygon(6, 4), and using
		 * RegularPolygon(10, 4, 5.6, 7.8). For each object, display its perimeter and
		 * area.
		 */

		RegularPolygon pol1 = new RegularPolygon();
		RegularPolygon pol2 = new RegularPolygon(6, 4);
		RegularPolygon pol3 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println(
				"Perimeter and area of the first polygon are " + pol1.getPerimeter() + " and " + pol1.getArea());
		System.out.println(
				"Perimeter and area of the second polygon are " + pol2.getPerimeter() + " and " + pol2.getArea());
		System.out.println(
				"Perimeter and area of the third polygon are " + pol3.getPerimeter() + " and " + pol3.getArea());

	}
}