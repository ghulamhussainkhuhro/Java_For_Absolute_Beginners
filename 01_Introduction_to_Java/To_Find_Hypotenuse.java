package Myfirstjavaprogram;

import java.util.Scanner;

public class To_Find_Hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x;
		double y;
		double z;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter measurement of Base : ");
		x = scanner.nextDouble();
		
		System.out.println("Enter measurement of Perpendicular : ");
		y = scanner.nextDouble();
		
//		Now here are two methods 
//		1--> Calling method from Math class
//		2--> Using the formula
//		z=Math.sqrt((x*x)+(y*y));
//		System.out.println("Hypotenuse of Triangle is : "+z);
		
//		We will use 1st method for ease
		System.out.println("Hypotenuse of Triangle is : "+Math.hypot(x, y));
	}

}
