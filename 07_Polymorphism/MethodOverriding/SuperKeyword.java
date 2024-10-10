package MethodOverriding;

class Animal1 {
	  String name;

	  public Animal1(String name) {
	    this.name = name;
	  }

	  public void makeSound() {
	    System.out.println("Generic animal sound");
	  }
	}

	class Dog1 extends Animal1 {
	  String breed;

	  public Dog1(String name, String breed) {
	    super(name); // Call superclass constructor with name
	    this.breed = breed;
	  }

	  @Override
	  public void makeSound() {
	    super.makeSound(); // Call superclass makeSound method
	    System.out.println("Woof!");
	  }
	}

	public class SuperKeyword {
	  public static void main(String[] args) {
		Dog1 dog = new Dog1("Buddy", "Labrador");
	    dog.makeSound(); // Outputs "Generic animal sound\nWoof!"
	  }
	}

