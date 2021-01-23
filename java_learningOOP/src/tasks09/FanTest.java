package tasks09;

public class FanTest {

	public static void main(String[] args) {

		/**
		 * Write a test program that creates two Fan objects. Assign maximum speed,
		 * radius 10, color yellow, and turn it on to the first object. Assign medium
		 * speed, radius 5, color blue, and turn it off to the second object. Display
		 * the objects by invoking their toString method.
		 */
		
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		fan2.setSpeed(Fan.MEDIUM);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
		

	}

}
