package Myfirstjavaprogram;
import java.util.Scanner;

public class Calculator_using_Functions {
		public static int caculateSum(int a, int b) {
			return a+b;
		}
		public static int caculateDiference(int a, int b) {
			return a-b;
		}
		public static int caculateProduct(int a, int b) {
			return a*b;
		}
		public static int caculateQoutient(int a, int b) {
			if(b!=0) {
				return a/b;
			}
			else {
				System.out.println("Cannot divide by 0.Please Enter a non-zero number.");
				return 0;
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter first number : ");
			int a=sc.nextInt();
			
			System.out.print("Enter second number : ");
			int b=sc.nextInt();
			
			
			System.out.println("Sum of the Given numbers is : "+caculateSum(a, b));
			
			System.out.println("Difference of numbers is : "+caculateDiference(a, b));
			
			System.out.println("Product of two numbers is : "+caculateProduct(a, b));
			
			System.out.println("Qoutient of two numbers is : "+caculateQoutient(a, b));
			
			sc.close(); // Closing the scanner to prevent resource leaks
	    
		}

	}
 


