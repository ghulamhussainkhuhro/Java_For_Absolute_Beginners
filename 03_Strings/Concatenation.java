package StringsBasics;

import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		concatenation:
//			In Java, concatenation refers to the process of combining two or more strings
//			to create a new string. You can concatenate strings using the + operator or 
//			the concat() method. The + operator is the more commonly used approach for 
//			string concatenation.
		
//		Concatenation By '+'
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first name : ");
		String fname=sc.nextLine();
		System.out.print("Enter last name : ");
		String lname=sc.nextLine();
		
		System.out.println("Your full name is "+fname+" "+lname+".");
		
//		Concatenation by concat() method :
		
		String s1="Hello";
		String s2="World";
		String result = s1.concat(", ").concat(s2).concat("!");
		System.out.println(result);

	}

}
