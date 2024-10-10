package Objects_and_Classes;
class Student{
	int id;
	String name;
	int age;
	
	//Default constructor
	Student(){
		System.out.println("Default constuctor created!");
		System.out.println("Data members initialized with default values.");
	}
}

public class Default_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println("Age : "+s1.age);
		System.out.println("ID : "+s1.id);
		System.out.println("Nmae : "+s1.name);

	}

}
