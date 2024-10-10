package Recursion;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*=factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to print its factorial : ");
		int n=sc.nextInt();
		System.out.println("Factorial of the number is "+factorial(n));
	

	}

}
