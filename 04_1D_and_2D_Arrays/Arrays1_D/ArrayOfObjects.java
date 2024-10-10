package Arrays1_D;
class Student{
	int rollNo;
	String name;
	int marks;
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.rollNo = 12;
		s1.name = "Ghulam Hussain";
		s1.marks = 81;
		Student s2 = new Student();
		s2.rollNo = 13;
		s2.name = "Aliraza";
		s2.marks = 70;
		Student s3 = new Student();
		s3.rollNo = 14;
		s3.name = "Amir";
		s3.marks = 83;
		//Guess the output
		System.out.println(s1);
		//Guess the output
		System.out.println(s1.rollNo+"  "+s1.name+"  "+s1.marks);
		Student Students[] = new Student[3];
		Students[0]=s1;
		Students[1]=s2;
		Students[2]=s3;
		//Guess the output of this line
		System.out.println(Students[0]);
		System.out.println();
		System.out.println("Using for loop : ");
		for(int i=0; i<Students.length; i++) {
			System.out.println(Students[i].rollNo+"  "+Students[i].name+"  "+Students[i].marks);
		}
		System.out.println();
		System.out.println("Using for each loop : ");
		for(Student stud : Students) {
			System.out.println(stud.rollNo+"  "+stud.name+"  "+stud.marks);
		}
	}

}
