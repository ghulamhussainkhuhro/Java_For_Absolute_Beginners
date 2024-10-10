package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object of ArrayList class  
		ArrayList<String> list = new ArrayList<String>();   
		// adding elements to the ArrayList   
		list.add("Volkswagen");   
		list.add("Toyota");   
		list.add("Porsche");   
		list.add("Ferrari");   
		list.add("Mercedes-Benz");   
		list.add("Audi");   
		list.add("Rolls-Royce");  
		list.add("BMW");  
		// printing the unsorted ArrayList   
		System.out.println("Before Sorting: "+ list);   
		// Sorting ArrayList in ascending Order   
		Collections.sort(list);   
		// printing the sorted ArrayList   
		System.out.println("After Sorting: "+ list);
		ArrayList<Integer> list1 = new ArrayList<Integer>();  
		list1.add(55);  
		list1.add(34);  
		list1.add(98);  
		list1.add(67);  
		list1.add(39);  
		list1.add(76);  
		list1.add(81);  
		//printing ArrayList before sorting  
		System.out.println("ArrayList Before Sorting:");  
		for(int marks: list1)  
		{  
		System.out.println(marks);  
		}  
		//sorting ArrayList in ascending order  
		Collections.sort(list1);  
		//printing ArrayList after sorting  
		System.out.println("ArrayList After Sorting(Ascending order):");  
		for(int marks: list1)  
		{  
		System.out.println(marks);  
		}  
		//sorting ArrayList in descending order
		Collections.sort(list1, Collections.reverseOrder());
		//printing ArrayList after sorting  
		System.out.println("ArrayList After Sorting(descending order):");  
		for(int marks: list1)  
		{  
		System.out.println(marks);  
		}
	}

}
