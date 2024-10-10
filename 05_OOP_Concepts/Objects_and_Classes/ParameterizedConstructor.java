package Objects_and_Classes;
class Student1{
	int id;
	String name;
	int age;
	
	//Parameterized constructor
	Student1(int i, String n, int a ){
		
		System.out.println("Parameterized constuctor called");
		System.out.println("Data members initialized with given values.");
		id = i;
		name = n;
		age = a;
	}
	void display() {
		System.out.println("Age : "+age);
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
}
}
public class ParameterizedConstructor {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student1 s1 = new Student1(50,"Ghulam Hussain Khuhro",19);
			s1.display();
		}

	}


