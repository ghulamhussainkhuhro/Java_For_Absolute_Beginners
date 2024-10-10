package AggregationAIQ2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Ali", "Assistant Professor");
		Employee e2 = new Employee("Sarmad", "Professor");
		Employee e3 = new Employee("Wajid", "Lecturer");
		
		Department d1  = new Department("SWE Department");
		d1.setEmployee(e1);
		d1.setEmployee(e2);
		d1.setEmployee(e3);
		
		d1.getData();
		d1.searchByPos("Professor");
	}

}
