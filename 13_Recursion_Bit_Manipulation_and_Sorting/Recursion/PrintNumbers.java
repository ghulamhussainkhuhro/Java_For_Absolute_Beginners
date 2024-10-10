package Recursion;

import java.util.Scanner;

public class PrintNumbers {
	public static void printNumbers(int n) {
//		base case
		if(n==0) {
			return;
		}
//		if there is no base case then there will be infinite recursions which will lead us to a problem known as stack overflow
		else {
		System.out.print(n+" ");
		printNumbers(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		printNumbers(num);

	}

}
