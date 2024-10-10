package HeiraricalInheritance;

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
class Cat extends Animal {
	public void  meow() {
		System.out.println("Meowing...");
	}
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog moti = new Dog();
		moti.eat();
		moti.bark();
		Cat kitty = new Cat();
		kitty.eat();
		kitty.meow();

	}

}
