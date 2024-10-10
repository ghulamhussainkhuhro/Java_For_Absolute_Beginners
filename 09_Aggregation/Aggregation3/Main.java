package Aggregation3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University u1 = new University("MUET", "Jamshoro");
		Department md1 = new Department("Software Engineering", "Nameem Mahoto");
		u1.addDep(md1);
		Course csw1 = new Course("OOP JAVA", "Naveen Kumar", 96);
		md1.addCourse(csw1);
		Department md2 = new Department("Mechanical", "Don't Know");
		Course cMech1 = new Course("Fluid Mechanics", "Atif KaimKhani", 100);
		Course cMech2 = new Course("Engineering Drawing", "XYZ", 48);
		md2.addCourse(cMech1);
		md2.addCourse(cMech2);
		University u2 = new University("NED", "Karachi");
		Department nd1  = new Department("Electrical Engineering","dsjlfk");
		u2.addDep(nd1);
		nd1.addCourse(csw1);
		nd1.addCourse(cMech2);
		nd1.courseData(csw1);
		nd1.courseData(cMech2);
	}

}
