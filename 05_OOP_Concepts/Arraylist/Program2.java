package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(13);
		al.add(2);
		al.add(7);
		System.out.println("Before sorting : ");
		for(Integer a : al) {
			System.out.println(a);
		}
		Collections.sort(al);
		System.out.println("After Sorting : ");
		for(Integer a : al) {
			System.out.println(a);
		}
//		In similar way we can sort elements of other wrapper classes including String class
		
	}

}
