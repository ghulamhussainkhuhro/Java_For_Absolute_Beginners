package Abstraction;
abstract class Animal{
	public abstract void sound();
	public abstract int legs();
	public abstract int averageLife();
}

class Dog extends Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Sound of Dog is Woof Woof!");
	}

	@Override
	public int legs() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int averageLife() {
		// TODO Auto-generated method stub
		return 12;
	}
	
}
class Human extends Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Human can make different sounds xd!");
		
	}

	@Override
	public int legs() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int averageLife() {
		// TODO Auto-generated method stub
		return 65;
	}
	
}
public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog = new Dog();
		Animal human  = new Human();
		
		dog.sound();
		System.out.println("Dogs have "+dog.legs()+" legs.");
		System.out.println("Average life of dog is "+dog.averageLife()+" years.");
		
		human.sound();
		System.out.println("Humans have "+human.legs()+" legs.");
		System.out.println("Average life of Human is "+human.averageLife()+" years.");
		

	}

}
