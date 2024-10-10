package Objects_and_Classes;
class Student2{
	int id;
	String name;
	int age;
	
	//Parameterized constructor
	Student2(int i, String n, int a ){
		
		System.out.println("Parameterized constuctor called");
		System.out.println("Data members initialized with given values.");
		id = i;
		name = n;
		age = a;
	}
	Student2(Student2 s){
		
		System.out.println("Copy constuctor called");
		System.out.println("Data members initialized with values given in parameterized constructor ");
		id = s.id;
		name = s.name;
		age = s.age;
	}
	void display() {
		System.out.println("Age : "+age);
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}
}
public class CopyConstructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2(50,"Ghulam Hussain Khuhro",19);
		Student2 s2 = new Student2(s1); 
		s1.display();
		s2.display();
//		we can also assign values manually like
//		s2.id=s1.id;
//		s2.name=s1.name;
//		s1.age=s2.age;
	}

}
