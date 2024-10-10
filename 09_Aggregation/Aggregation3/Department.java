package Aggregation3;
import java.util.ArrayList;

public class Department {
    String depName;
    String hod;
    ArrayList<Course> courses;

    Department(String depName, String hod) {
        this.depName = depName;
        this.hod = hod;
        this.courses = new ArrayList<>(); 
    }

    public void addCourse(Course course) {
        courses.add(course); 
    }
    
    public void courseData(Course c) {
    	System.out.println(c.corName+"  "+c.instructor+"  "+c.credits);
    }
     
}