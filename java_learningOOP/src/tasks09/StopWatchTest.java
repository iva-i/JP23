package tasks09;

public class StopWatchTest {

	public static void main(String[] args) {
		// Write a test program that measures the execution time
		// of sorting 100,000 numbers using selection sort.

		StopWatch stopWatch = new StopWatch();

		stopWatch.start();

		int[] arr = new int[100000];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100000);
		}

		selectionSort(arr);

		stopWatch.stop();

		System.out.println("Execution time of sorting 100,000 numbers : " + stopWatch.getElapsedTime());

	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;// searching for lowest index
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

}
