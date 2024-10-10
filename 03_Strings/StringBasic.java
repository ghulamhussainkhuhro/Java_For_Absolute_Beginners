package StringsBasics;

public class StringBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		string is an stream of characters
		
//		method 1-->
//		In this method object is created automatically
//		this is preferable
//		String name = "Ghulam Hussain";
		
//		String is actually a class so there must be a object
		
		String name = new String("Ghulam Hussain");
		System.out.println(name);
//		hashcode is a number associated with an object that helps collections
//		like HashMap and HashSet efficiently store and retrieve those objects.
		System.out.println("Hashcode is : "+name.hashCode());
		name = name.concat(" Khuhro");
		System.out.println(name);
		
		String s1 = "Ghulam";
		String s2 = "Ghulam";
//		Although it may sound tricky here but You are not actually creating two separate objects.
//		Instead, both s1 and s2 refer to the same object in the string constant pool.
//		This pool is a special memory area in the Java Virtual Machine (JVM) 
//		that stores unique string literals to save memory and improve performance.

//		Here's how you can verify this:
		System.out.println(s1 == s2); // This will print true
		System.out.println(s1.equals(s2)); // This will also print true

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2)); // These will print the same hashcode
		
//		Even though strings are immutable, their value can be effectively "changed" by re-assigning variables to new string objects.
		String s3 = "Software"; // Create a string "Software"

		// The `+` operator creates a new string, not modifying s1:
		s3 = s3 + " 23 batch"; // s1 now points to "Software 23 batch"

		// Original string "Software" is still in the string constant pool
//		After the line 41, you have two String objects: "Software" (original) and "Software 23 batch" (new).
//		s1 only points to the new string, not the original one.
//		The original "Software" string can still be accessed by other variables pointing to it (if any).


	}

}
