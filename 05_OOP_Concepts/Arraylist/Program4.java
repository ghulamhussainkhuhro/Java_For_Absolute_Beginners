package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Creating list 1...");
		System.out.println("Before adding any element : ");
		System.out.println(al);
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println("After adding elements : ");
		System.out.println(al);
		System.out.println("Creating list 2...");
		ArrayList<String> al2 = new ArrayList<String>();
		System.out.println("Before adding any element : ");
		System.out.println(al2);
		al2.add("D");
		al2.add("E");
		al2.add("F");
		System.out.println("After adding elements : ");
		System.out.println(al2);
		System.out.println("Adding list 2 elements in list 1...");
		al.addAll(al2);
		System.out.println("List 1 : ");
		System.out.println(al);
		System.out.println("List 2 : ");
		System.out.println(al2);
//		Adding elements to a specific position 
		al.addAll(1,al2);
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After sorting list 1 : ");
		System.out.println(al);
		al.remove("D");
		al.remove(5);
		al.remove(6);
		System.out.println(al);
		
	}

}
