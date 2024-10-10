package DynamicPolymorphism;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal; // Declare an Animal reference variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Select animal you want to hear sound of : ");
		System.out.print("Press (1 for Cat)  (2 for dog) : ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			animal = new Cat(); // Create a Cat object and assign it to the Animal reference
			animal.sound();
		}
		else if (choice == 2) {
			animal = new Dog(); // Create a Dog object and assign it to the Animal reference
			animal.sound();
		}
		else {
			System.out.println("OOPs! That was invalid choice...");
			animal = new Animal(); // Create an Animal object (default case)
			animal.sound();
		}
		
//		--->  Dynamic Polymorphism:
//
//Achieved through inheritance: The Cat and Dog classes inherit from the Animal class. 
//This establishes an "is-a" relationship, where Cat and Dog objects are also Animal objects.
//Deciding on method implementation at runtime: The sound() method is declared in Animal 
//and overridden in Cat and Dog. When animal.sound() is called, the specific implementation 
//to be executed (Meow for Cat or Woof for Dog) is determined at runtime based on the 
//actual object type assigned to the animal reference variable.
//		
//		--->  Dynamic Method Dispatch:
//
//Mechanism behind dynamic polymorphism: Java uses dynamic method dispatch to resolve 
//the method call to the correct implementation at runtime.
//Binding the method call to the object: When animal.sound() is called, even though the 
//reference variable is of type Animal, Java checks the actual object type (Cat or Dog) 
//and invokes the corresponding sound() method.
//In essence, dynamic polymorphism allows for flexible code that can handle objects of 
//different types through a common interface (Animal in this case), while dynamic method 
//dispatch ensures the appropriate method implementation is executed at runtime.

	}

}
