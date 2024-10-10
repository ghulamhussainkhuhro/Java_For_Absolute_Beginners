package Aggregation6;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Course> enrolledCourses = new ArrayList<Course>();
	Student(String name){
		this.name = name;
		this.enrolledCourses = new ArrayList<Course>();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void addCourse(Course course) {
		enrolledCourses.add(course);
	}
	void printEnrolledCourses() {
		System.out.println(name+ " is currently enrolled in");
		for(Course course : enrolledCourses) {
			System.out.println("Course name : " + course.getName()+" Credits : "+course.getcredits()+" hours.");
		}
	}
	
	

}
