package Arraylist;

import java.util.ArrayList;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Before adding any element...");
		System.out.println("Is list empty ? "+al.isEmpty());
		al.add("Ali");
		al.add("Haider");
		System.out.println("After adding elements...");
		System.out.println(al);
		System.out.println("Is list empty? "+al.isEmpty());

	}

}
