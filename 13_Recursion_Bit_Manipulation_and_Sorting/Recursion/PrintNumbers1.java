package Recursion;

import java.util.Scanner;

public class PrintNumbers1 {
	public static void printNumbers(int n, int num) {
//		base case
		if(n==num+1) {
			return;
		}
//		if there is no base case then there will be infinite recursions which will lead us to a problem known as stack overflow
		else {
		System.out.print(n+" ");
		printNumbers(n+1,num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int n=1;
		printNumbers(n,num);

	}

}
