package Aggregation6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ghulamHussain = new Student("Ghulam Hussain");
		Course c1 = new Course("OOP JAVA", 96);
		Course c2 = new Course("ISE", 96);
		Course c3 = new Course("Professional Practices", 96);
		
		ghulamHussain.addCourse(c1);
		ghulamHussain.addCourse(c2);
		ghulamHussain.addCourse(c3);
		
		ghulamHussain.printEnrolledCourses();
	}

}
