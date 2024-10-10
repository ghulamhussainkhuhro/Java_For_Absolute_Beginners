package AggregationAIQ2;

import java.util.ArrayList;

public class Department {
	private String Dname;
	private ArrayList<Employee> Demployees = new ArrayList<Employee>();
	
	Department(String Dname){
		this.Dname = Dname;
		this.Demployees = new ArrayList<Employee>();
	}
	public void getData() {
		System.out.println("Department name : "+Dname);
		System.out.println("Employees in the department are : ");
		for(Employee a : Demployees) {
			System.out.println("Employee Name : "+a.getEname()+" Employee position : "+a.getEposition());
		}
	}
	public void setEmployee(Employee employee ) {
		Demployees.add(employee);
	}
	public void searchByPos(String searchPos) {
		for(Employee employee : Demployees) {
			if(employee.getEposition().contains(searchPos)) {
				System.out.println("Yes, "+employee.getEname()+" yahan as a "+employee.getEposition()+" kaam karta hy.");
			}
		}
	}
}
