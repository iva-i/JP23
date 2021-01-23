package tasks10;

public class TimeTest {

	public static void main(String[] args) {
		/**
		 * Write a test program that creates three Time objects (using new Time(), new
		 * Time(555550000), and new Time(5, 23, 55)) and displays their hour, minute,
		 * and second in the format hour:minute:second.
		 */

		Time t1 = new Time(), t2 = new Time(555550000), t3 = new Time(5, 23, 55);

		System.out.printf("Time1: %d:%d:%d\nTime2: %d:%d:%d\nTime3: %d:%d:%d\n", t1.getHour(), t1.getMinute(),
				t1.getSecond(), t2.getHour(), t2.getMinute(), t2.getSecond(), t3.getHour(), t3.getMinute(),
				t3.getSecond());

	}

}
