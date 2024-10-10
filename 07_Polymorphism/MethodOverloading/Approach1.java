package MethodOverloading;

//By changing number of arguments

public class Approach1 {
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum : "+add(1,2));
		System.out.println("Sum : "+add(1,2,3));
		System.out.println("Sum : "+add(1,2,3,4));
	}

}
