package MethodOverriding;

class Animal {
  public void sound() {
    System.out.println("Generic animal sound");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Woof!");
  }
}

public class Overriding2 {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.sound(); // Output: Generic animal sound

    Animal dog = new Dog(); // Polymorphism - Animal reference to Dog object
    dog.sound(); // Output: Woof!

    Dog actualDog = new Dog();
    actualDog.sound(); // Output: Woof!
//    Methods declared as final cannot be overridden.
//    Static methods cannot be overridden, but they can be hidden (shadowed) by subclasses with the same method name.
  }
}
