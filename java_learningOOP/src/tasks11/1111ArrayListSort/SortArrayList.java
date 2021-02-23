package tasks11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {

	public SortArrayList() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter integers: ");

		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			temp.add(input.nextInt());
		}

		sort(temp);

		System.out.println(temp);

		input.close();

	}

	public static void main(String[] args) {

		new SortArrayList();

	}

	public static void sort(ArrayList<Integer> list) {

		list.sort(null);

	}

}
