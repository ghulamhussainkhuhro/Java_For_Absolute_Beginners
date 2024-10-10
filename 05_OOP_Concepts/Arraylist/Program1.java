package Arraylist;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ghulam ");
		al.add(1, "Hussain ");
		al.add(2, "Khuhro ");
		System.out.println(al.get(0)+al.get(1)+al.get(2));
		al.set(0, "Shah ");
		al.set(1, "Muhammad ");
		System.out.println(al.get(0)+al.get(1)+al.get(2));
		al.addFirst("Ghulam ");
		System.out.println(al.get(0)+al.get(1)+al.get(2));
		al.addLast("Muhammad");
		System.out.println(al);
//		using for-each loop
		System.out.println("Printing through for each loop");
		for(String str : al) {
			System.out.println(str);
		}
//		getting particular element at an index
		System.out.println("getting element at an index 2 : ");
		System.out.println(al.get(2));
//		setting particular element at an index
		al.set(2, "Hussain");
//		After setting particular element at an index
		System.out.println("After setting new value getting element at an index 2 : ");
		System.out.println(al.get(2));		
		
	}

}
