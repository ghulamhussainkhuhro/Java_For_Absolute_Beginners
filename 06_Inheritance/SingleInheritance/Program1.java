package SingleInheritance;
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

public class Program1 {

	public static void main(String[] args) {						
		// TODO Auto-generated method stub
		Dog GermanShepherd = new Dog();
		GermanShepherd.eat();
		GermanShepherd.bark();
	}

}
