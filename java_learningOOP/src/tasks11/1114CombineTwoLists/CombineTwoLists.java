package tasks11;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoLists {
	
	public CombineTwoLists() {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		//Filling two lists
		System.out.println("Enter 5 integers into the first list: ");
		
		try {
			for(int i = 0; i < 5; i++) {
				list1.add(input.nextInt());
			}
			
		} catch (Exception e) {
			System.out.println("INPUT ERROR!");
		}
		
		System.out.println("Enter 5 integers into the second list: ");
		
		try {
			for(int i = 0; i < 5; i++) {
				list2.add(input.nextInt());
			}
			
		} catch (Exception e) {
			System.out.println("INPUT ERROR!");
		}
		
		//union(list1, list2);
		
		System.out.println("Union of two lists is given by: " + union(list1, list2).toString());
		
		
		input.close();
		
	}

	public static void main(String[] args) {
		
		new CombineTwoLists();
		
	}
	
	/**
	 * Method adds elements of two lists to one list
	 * @param list1
	 * @param list2
	 * @return ArrayList<Integer>
	 */
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		addElements(list1, list);
		addElements(list2, list);
		
		return list;
		
	}
	
	/**
	 * Method adds all elements of list1 to list2
	 * @param list1
	 * @param list2
	 */
	public static void addElements(ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		for(Integer num : list1) {
			list2.add(num);
		}
		
	}
	
	
}
