package Inheritance;
class A{ // A class extends Object class
	A(){
		super();
		System.out.println("In A");
	}
	A(int a){
		super();
		System.out.println("In A int ");
	}
	
}
class B extends A{
	B(){
//		super();
		System.out.println("In B");
	}
	B(int a){
//		super(); // super calls the constructor of parent class
		this(); // this() calls the constructor of the same class 
		System.out.println("In B int");
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		When you create an object of b it calls the constructor of child and parent class both
		System.out.println("Demonstration of super() : ");
		B obj = new B();
	
		System.out.println("Demonstration of this() : ");
		B obj1 = new B(2);
		
//		You can simple comment uncomment the above code to see different outputs
	}

}
