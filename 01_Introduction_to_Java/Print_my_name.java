package Myfirstjavaprogram;

import java.util.Scanner;

public class Print_my_name {
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=scanner.nextLine();
		System.out.print("Your name is ");
		printMyName(name);
		
	}

}
