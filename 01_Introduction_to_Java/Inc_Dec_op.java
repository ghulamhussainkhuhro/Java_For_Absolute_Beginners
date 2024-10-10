package Myfirstjavaprogram;

public class Inc_Dec_op {

	public static void main(String[] args) {
		
//		expression = operands and operators
//		operands = values, variables, numbers, quantity
//		operators = + - / * % 
		
		int num=10;
		num=num+10;
		num-=10;
		num=num/3;
		
		System.out.println(num);
		
		num*=4;
		num-=15;
		
		System.out.println(num);
		
		num=num*4;
		num%=7;
		
		System.out.println(num);
//		post an pre-increment
		int x=5;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(++x);
		
//		post and pre-decrement
		int y=5;
		System.out.println(--y);
		System.out.println(y--);
		System.out.println(--y);
//		type casting
		double num1=20;
		num1=num1/3;
		System.out.println(num1);
		
	}

}
