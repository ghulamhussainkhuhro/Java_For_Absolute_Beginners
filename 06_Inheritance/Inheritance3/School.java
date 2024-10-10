package Inheritance3;

public class School extends Student {
	private int classNumber;
	private String schoolName;

	public School(int classNumber, String schoolName) {
		this.classNumber = classNumber;
		this.schoolName = schoolName;
	}
	public School(String name, String fName, String address, int classNumber, String schoolName) {
		
	super(name,fName,address);
	
}
}
