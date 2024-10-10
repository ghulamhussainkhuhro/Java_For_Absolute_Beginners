package Recursion;

import java.util.Scanner;

public class SumToN {
	public static void printSum(int i, int n, int sum) {
//		base case
		if(i==n) {
			sum+=i;
			System.out.println("Sum to "+n+" is "+sum);
			return;
		}
//		if there is no base case then there will be infinite recursions which will lead us to a problem known as stack overflow
		else {
			sum+=i;
			printSum(i+1, n, sum);
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int i=1;
		int sum=0;
		printSum(i,num,sum);

	}

}
