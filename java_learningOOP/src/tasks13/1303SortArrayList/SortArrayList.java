package tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
	
	public SortArrayList() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numbers into the list (0 to finish): ");
		
		ArrayList<Number> list = new ArrayList<>();
		
		Integer help = 1;
		
		while(help != 0) {
			try {
				help = input.nextInt();
				list.add(help);
			} catch (Exception e) {
				System.out.println("Enter number!");
			}
		}
		
		list.remove(list.size()-1);
		
		input.close();
		
		sort(list);
		
	}
	
	public static void main(String[] args) {
		
		new SortArrayList();
		
	}
	
	public static void sort(ArrayList<Number> list) {
		
		list.sort(null);
		
		for(int i = 0;  i < list.size(); i++) {
			System.out.printf("%d ", list.get(i));
		}
		
	}

}
