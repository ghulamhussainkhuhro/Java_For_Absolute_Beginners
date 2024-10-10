package Myfirstjavaprogram;
import java.util.Scanner;

public class ArithematicOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter 1st number : ");
		int x=scanner.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int y=scanner.nextInt();
		
		System.out.println("Sum of the numbers is "+(x+y));
		System.out.println("Difference of the numbers is "+(x-y));
		System.out.println("Product of the numbers is "+(x*y));
		System.out.println("Qoutient of the numbers is "+(x/y));
		System.out.println("Modulus of the numbers is "+(x%y));
		
		

	}

}

	 
