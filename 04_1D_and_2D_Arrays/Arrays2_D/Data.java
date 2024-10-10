package Arrays2_D;

import java.util.ArrayList;
import java.util.*;
class Student{
	private String name;
	int age;
	
	Student(String n, int a){
		name=n;
		age=a;
	}
	
	public void printr() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
}


public class Data {
	public static void main(String agr[]) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Student> al=new ArrayList<>();
		
		Student s1=new Student("ghulam hussain",19);
		Student s2=new Student("ali",91);
		
		System.out.println("Enter data: ");
		for(int i=0;i<4; i++) {
			String name=scan.next();
			int age=scan.nextInt();
			al.add(new Student(name,age));
		}
		
		al.add(s1);
		al.add(s2);
		
		for(Student s:al) {
			s.printr();
		}
	}
}
