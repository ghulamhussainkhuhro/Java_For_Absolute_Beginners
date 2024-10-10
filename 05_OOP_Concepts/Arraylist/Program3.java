package Arraylist;

import java.util.ArrayList;

class Student{
	String name;
	int rollNo;
	int age;
	
	Student(String name, int rollNo, int age){
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
}
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Ghulam Hussain ", 50, 19);
		Student s2 = new Student("Abbas Ali ", 56, 19);
		Student s3 = new Student("Ali Meer ", 17, 19);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
//		Dont't do this it will print hashcode of object
		for(Student s : al) {
			System.out.println(s);
		}
//		To print the data write explicitly attributes (if private use getters)
		for(Student s : al) {
			System.out.println(s.name+"  "+s.rollNo+"  "+s.age);
		}
		
	}

}
