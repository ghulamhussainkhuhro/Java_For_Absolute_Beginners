package Myfirstjavaprogram;

import java.util.Scanner;

public class Calculate_sum {
	public static int caculateSum(int a, int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a=sc.nextInt();
		System.out.print("Enter second number : ");
		int b=sc.nextInt();
		int sum=caculateSum(a, b);
		System.out.print("Sum of the Given numbers is : "+sum);
		
	}

}
