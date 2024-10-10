package Basics01;
class A extends Thread{
	 public void run() {
		 for(int i=0; i<=100; i++) {
			 System.out.println("Hi");
		 }
	 }
	
}

class B extends Thread{
	 public void run() {
		 for(int i=0; i<=100; i++) {
			 System.out.println("Hello");
		 }
	 }
	
}

public class Thread0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj1 = new A();
		B obj2 = new B();
		
		
		obj1.start();
		try {
			obj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		

	}

}
