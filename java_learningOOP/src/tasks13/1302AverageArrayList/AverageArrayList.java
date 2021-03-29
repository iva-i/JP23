package tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageArrayList {
	
	public AverageArrayList() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter integers into the list (0 to finish): ");
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Integer help = 1;
		
		while(help != 0) {
			try {
				help = input.nextInt();
				list.add(help);
			} catch (Exception e) {
				System.out.println("Enter integer!");
			}
		}
		
		//removed 0 (last input)
		list.remove(list.size()-1);
		
		input.close();
		
		average(list);
		
	}

	public static void main(String[] args) {
		
		new AverageArrayList();
		
	}
	
	public static void average(ArrayList<Integer> list) {
		
		Integer sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		Integer average = sum / list.size();
		
		System.out.println("Average is: " + average);
		
	}

}
