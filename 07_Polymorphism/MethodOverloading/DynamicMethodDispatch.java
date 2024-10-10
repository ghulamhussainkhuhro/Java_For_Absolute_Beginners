package MethodOverloading;
class X{
	public void show() {
		System.out.println("In X show!");
	}
	
}
class Y extends X{
	public void show() {
		System.out.println("In Y show!");
	}
}
class Z extends X{
	public void show() {
		System.out.println("In Z show!");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dynamic Method Dispatch will only work if there is Inheritance
		// Create an object of Y but assign it to a variable of type X
	    X obj1 = new Y(); 

	    // Dynamic Method Dispatch: Call to show() 
	    //resolved at runtime based on obj1's actual type (Y)
	    obj1.show();  // Outputs "Y show"

	    X obj = new X();
	    obj.show();  // Calls X's show method (no dispatch)

	    // obj refers to the same memory location, but now it points to a Y object
	    obj = new Y();

	    // Dynamic Method Dispatch: Call to show() 
	    //resolved at runtime based on obj's actual type (Y)
	    obj.show();  // Outputs "Y show"

	    // obj refers to the same memory location again, 
	    //but now it points to a Z object
	    obj = new Z();

	    // Dynamic Method Dispatch: Call to show() 
	    //resolved at runtime based on obj's actual type (Z)
	    obj.show();  // Outputs "Z show"
	}

}
