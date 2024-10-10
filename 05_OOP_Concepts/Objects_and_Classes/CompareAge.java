package Objects_and_Classes;

import java.util.Scanner;

class StudentAge{
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void compareAge(StudentAge s1, StudentAge s2) {
		if(s1.age==s2.age) {
			System.out.println("Age of both students is equal.");
		}
		else {
			System.out.println("Ages of both students are different.");
		}
	}
	
}

public class CompareAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentAge a = new StudentAge();
		StudentAge b = new StudentAge();
		System.out.print("Enter age of student 1 : ");
		a.setAge(sc.nextInt());
		System.out.print("Enter age of student 2 : ");
		b.setAge(sc.nextInt());
		
		StudentAge.compareAge(a, b);
		System.out.format("hi");
		
		

	}

}
