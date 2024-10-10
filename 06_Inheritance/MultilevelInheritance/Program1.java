package MultilevelInheritance;
class Animal{
	public void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal {
	public void bark() {
		System.out.println("Barking...");
	}
}
class BabyDog extends Dog {
	public void weep() {
		System.out.println("Weeping...");
	}
	
}
/*Why multiple inheritance is not supported by java 
 * Consider a scenario where A, B, and C are three classes. 
 * The C class inherits A and B classes. If A and B classes 
 * have the same method and you call it from child class object, 
 * there will be ambiguity to call the method of A or B class.*/

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog babyDog = new BabyDog();
		babyDog.eat();
		babyDog.bark();
		babyDog.weep();

	}

}
