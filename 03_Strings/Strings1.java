package StringsBasics;

import java.util.Scanner;

public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String Declaration
//		String name="Hussain";
//		String fullname="Ghulam Hussain";
//		String sentence="My name is Ghulam Hussain Khuhro";
		
//		Getting String as input from user
		System.out.print("Enter a word : ");
		String word=sc.next();
		sc.nextLine();
		
//		But why we added another sc.nextLine();
//		Answer:The unexpected behavior in your code might be due to the way Scanner handles input. 
//		When you use sc.next() to get a word, it only reads the next token 
//		(a sequence of characters separated by whitespace) and leaves the newline character in the input buffer.
//		When you later use sc.nextLine() to get the name, it reads the remaining newline character from the previous input,
//		resulting in an empty string for the name.
//		To fix this issue, you can add an additional sc.nextLine() after sc.next() to consume the newline character left in the buffer:
		
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		System.out.print("Enter your favourite sentence : ");
		String sentence=sc.nextLine();
		
		System.out.println("Hello "+name+"!");
		System.out.println("Your entered word : "+word);
		System.out.println("Your Entered sentence : "+sentence);
	}

}
