package Aggregation6;

public class Course {
	private String courseName;
	private int credits;
	Course(String name, int credits){
		this.courseName = name;
		this.credits = credits;
	}
	public void setName(String name) {
		this.courseName = name;
	}
	public String getName() {
		return courseName;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getcredits() {
		return credits;
	}

}
