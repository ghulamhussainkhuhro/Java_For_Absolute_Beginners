package Myfirstjavaprogram;

import java.util.Scanner;

public class Factorial_using_loops {
	public static void factorial(int n) {
		int factorial=1;
		if(n<=0) {
			System.out.println("Factorial not possibe.");
			return;
		}
		else {
		for(int i=n; i>=1;i--) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of "+n+" is "+factorial);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		int a=sc.nextInt();
		factorial(a);
		

	}

}
