package tasks11;

import java.util.Scanner;

public class GeometricObjectTest {

	public GeometricObjectTest() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three sides of a triangle: ");

		GeometricObjectTriangle tri = new GeometricObjectTriangle(input.nextDouble(), input.nextDouble(),
				input.nextDouble());

		System.out.println("Enter a color of a triangle: ");

		tri.setColor(input.next());

		System.out.println("Enter filled property: ");

		tri.setFilled(input.nextBoolean());

		System.out.printf("The area is %f, the perimeter is %f, the color is %s and the filled is %b.", tri.getArea(),
				tri.getPerimeter(), tri.getColor(), tri.isFilled());
		
		input.close();

	}

	public static void main(String[] args) {

		new GeometricObjectTest();

	}

}
