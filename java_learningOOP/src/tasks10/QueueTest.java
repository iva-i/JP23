package tasks10;

public class QueueTest {

	public static void main(String[] args) {
		/**
		 * Implement the class with the initial array size set to 8. The array size will
		 * be doubled once the number of the elements exceeds the size. After an element
		 * is removed from the beginning of the array, you need to shift all elements in
		 * the array one position the left. Write a test program that adds 20 numbers
		 * from 1 to 20 into the queue then removes these numbers and displays them.
		 */

		Queue q = new Queue();

		for (int i = 1; i <= 20; i++) {
			q.enqueue(i);
		}

		for (int i = 0; i < 20; i++) {
			System.out.print(q.dequeue()+" ");
		}

	}

}
