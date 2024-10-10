package Abstraction;
abstract class Man{
	
	public abstract void name(); //Abstract method No definition only declaration
	// Definition of abstract method will lead to error: Abstract methods do not specify a body
	
	public void caste() {
		System.out.println("Khoso");
	}
	
}
//abstract anyhow override in child class.
//if we create abstract method of any class,that class must be abstract.
//it mean, The type ClassName must be an abstract class to define abstract methods
//abstract methods are always empty, there is no-body {}, block.
//2-ways, 
//1- override method of parent class which are abstract.
//2- make it abstract. 

//pre-defined, already java files, jdk, built-in.

//normal methods can be or can not be override by child.

//the object of abstract class can be created normally.
//use approach to create object of abstract called dynamic methods dispatch
//use approach to access child class methods by the parent

class Person3 extends Man{
	public void name() {
		System.out.println("Ahmed");
	}
	
	public void caste() {
		System.out.println("Shah");
	}
}


class Person2 extends Man{
	public void name() {
		System.out.println("Ali");
	}
	
	//public void caste() {
		//System.out.println("Sindhi");
	//}
		
}

//Parent can not access child properties.
//child can.

//dynamic method dispatch parent can access child properties. 
//in case if there is method overrided in child


public class Abstraction0 {
	public static void main(String[] args) {
		//Man m=new Man();
		Person2 p=new Person2();
		
		Man m1=p;
		//dynamic method dispatch.
		//m1=reference object.
		
		m1.caste();
		
		Man m2=new Person3();
		m2.caste();
		m2.name();
		
	}
}
