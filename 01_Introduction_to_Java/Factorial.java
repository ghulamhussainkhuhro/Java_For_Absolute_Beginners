package Myfirstjavaprogram;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int a) {
		//base case
		if(a==0 || a==1) {
			return 1; // as factorial of 0 and 1 is 1.
		}
		//recursive case
		else {
			return a*factorial(a-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a=sc.nextInt();
		if(a>=0) {
			System.out.println("Factorial of the number is : "+factorial(a));
		}
		else {
			System.out.println("Factorial not possible");
		}
	}

}
