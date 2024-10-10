package Objects_and_Classes;
class MyClass{
	int m;//instance or non-static variable
	static int n;//class or static variable
	
	//Instance or non-static method
	void xxx() {
		m=10;
		n=20;
	}
	
	//class or static method
	static void yyy() {
//		m=30;//Error : Cannot make a static reference to the non-static field m
//		non static variable m cannot be referenced from static context
		n=40;
	}
	
	void display() {
		System.out.println("m = "+m+"  n = "+n);
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc1 = new MyClass();
		mc1.xxx();
		mc1.display();//m = 10  n = 20
		MyClass mc2 = new MyClass();
		mc2.display();//m = 0 n = 20
		mc2.yyy();
		mc2.display();//m = 0 n = 40
		
		MyClass.n=50;//we can access static member directly without creating objects
		mc1.display();//m = 10 n = 50
		mc2.display();//m = 0  n = 50
		MyClass.yyy();
		mc1.display();//m=10 n=40
		mc2.display();//m=0 n=40
		
	}

}
