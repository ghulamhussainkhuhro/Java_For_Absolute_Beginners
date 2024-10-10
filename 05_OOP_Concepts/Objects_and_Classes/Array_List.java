package Objects_and_Classes;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creation
		ArrayList<Integer> myList = new ArrayList<>();
		ArrayList<Integer> myList1 = new ArrayList<>();
		//Addition of elements
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		//Accessing list
		System.out.println(myList);
		
		//Getting elements at an index
		System.out.println(myList.get(0));
		System.out.println(myList.get(1));
		System.out.println(myList.get(2));
		System.out.println(myList.get(3));
		System.out.println(myList.get(4));
		// Update elements
		myList.set(0, 1);
		System.out.println(myList.get(0));
		myList.set(1, 10);
		System.out.println(myList.get(1));
		myList.set(2, 100);
		System.out.println(myList.get(2));
		myList.set(3, 1000);
		System.out.println(myList.get(3));
		myList.set(4, 10000);
		System.out.println(myList.get(4));
		// Removing elements by index
		myList.remove(0);
		myList.remove(3);
		System.out.println(myList);
		System.out.println("Size of array list is : "+myList.size());
		System.out.println(myList.isEmpty());
		
		myList1.add(11);
		myList1.add(111);
		myList.addAll(myList1);
		System.out.println(myList);
		myList1.clear();
		System.out.println(myList1);
	}

}
