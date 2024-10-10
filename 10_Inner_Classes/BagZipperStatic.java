package InnerClass;


class Bag1{
	public void showBagName() {
		System.out.println("Bag name is Camel!");
	}
static class Zipper1 {
	
	static public void zip() {
		System.out.println("Bag is zipped!");
	}
	
	static public void unZip() {
		System.out.println("Bag is unzipped!");
	}
}
}

public class BagZipperStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Bag object (not required for static nested class)
        // Bag B1 = new Bag();

        // Call outer class method (not required for static nested class)
        // B1.showBagName();

        // Directly access static nested class methods
//		Bag1.Zipper1.zip();
//		Bag1.Zipper1.unZip();

//		Bag1 B1 = new Bag1();
//		B1.showBagName();
				
//		There is no need to create instance of zipper class as methods are static 
//      Bag.Zipper BZ1 = new Zipper();
		
		Bag1.Zipper1.zip();
		Bag1.Zipper1.unZip();

	}

}
/*Static Nested Class:
The Zipper class is declared as static.
Static nested classes can be accessed directly using the outer class name (e.g., Bag.Zipper). 
They don't require an instance of the outer class.
Since it's static, it cannot access non-static members (like name) of the 
outer class directly. It can only access static members of the outer class.

Additional Functionality:

The non-static inner class Zipper can access the name field of the 
Bag object that created it, demonstrating a closer relationship.
The static nested class Zipper is more generic and can be used with any 
Bag object (or even without a Bag object if there are no dependencies on outer class members).
Key Differences:

Instance Creation: Non-static inner classes require an instance of the outer class to be created. Static nested classes do not.
Outer Class Member Access: Non-static inner classes can access all members (static and non-static) of the outer class. Static nested classes can only access static members of the outer class.
Use Cases: Non-static inner classes are typically used when the inner class has a strong relationship with a specific outer class object. Static nested classes are used when the inner class has a more generic purpose and doesn't rely on specific outer class instances.*/
