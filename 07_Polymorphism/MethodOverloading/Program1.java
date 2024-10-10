package MethodOverloading;
class A{
	public int getNum(int num) {
		System.out.println("Method in A class");
		return num;
	}
}

class B extends A{
	public int getNum(int num) {
		System.out.println("Method in B class");
		return num;
	}
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.getNum(20);

	}

}
