package tasks10;

public class MyPointTest {

	public static void main(String[] args) {
		/**
		 * Write a test program that creates the two points (0, 0) and (10, 30.5) and
		 * displays the distance between them.
		 */

		MyPoint p1 = new MyPoint(), p2 = new MyPoint(10, 30.5);
		
		System.out.printf("The distance between the points is %f", MyPoint.distance(p1, p2));
		
		//checking other methods
		System.out.printf("\nThe distance between the points is %f", p1.distance(p2));
		System.out.printf("\nThe distance between the points is %f",p1.distance(10, 30.5));
	
	}

}
