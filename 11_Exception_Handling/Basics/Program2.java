package Basics;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Exception : An event that occurs at runtime which disturbs the final execution of program
		
		try {
			System.out.print("Enter whole number you want to divide : ");
			int x = sc.nextInt();
		
			System.out.print("Enter whole number you want to divide by : ");
			int y = sc.nextInt();
		
//			now the below given operation may throw exception if user enters y = 0
//			so surround it by try catch block
		
			int result = x/y;
			System.out.println(x+" divided by "+y+" equals to "+result);
			
		}catch(ArithmeticException e){
			System.out.println("Bro you cannot divide a number by zero!");
		}catch(InputMismatchException e) {
			System.out.println("Bro Please enter a number...!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("This is finally vlock statement");
			System.out.println("It will always run");
		}
		
		sc.close();
		
	}

}
