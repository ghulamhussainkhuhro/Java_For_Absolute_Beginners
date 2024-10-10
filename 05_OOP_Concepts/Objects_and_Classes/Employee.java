package Objects_and_Classes;
class Employee{
	int employeeId;
	String employeeName;
	String employeeAddress;
	double employeeSalary;
	
	void setEmployeeId(int eId) {
		employeeId=eId;
	}
	int getEmployeeId() {
		return employeeId;
	}
	void setEmployeeName(String eName) {
		employeeName=eName;
	}
	String getEmployeeName() {
		return employeeName;
	}
	void setEmployeeAddress(String eAddress) {
		employeeAddress=eAddress;
	}
	String getEmployeeAddress() {
		return employeeAddress;
	}
	void setEmployeeSalary(double eSalary) {
		employeeSalary=eSalary;
	}
	double getEmployeeSalary() {
		return employeeSalary;
	}
	
	Employee(){
		System.out.println("Default constructor called.");
		employeeId=0001;
		employeeName="Default employee";
		employeeAddress="Default address";
		employeeSalary=50000;
	}
	Employee(int eId, String eName,String eAddress, double eSalary){
		System.out.println("Parameterized constructor called.");
		employeeId=eId;
		employeeName=eName;
		employeeAddress=eAddress;
		employeeSalary=eSalary;
	}
	void compareEmployee(Employee e) {
		if(this.employeeId == e.employeeId) {
			System.out.println("Employees Id matched");
		}
		else {
			System.out.println("ID not matched.");
		}
		if(this.employeeName == e.employeeName) {
			System.out.println("Employees Names matched");
		}
		else {
			System.out.println("Names not matched.");
		}
		if(this.employeeAddress == e.employeeAddress) {
			System.out.println("Employees Address matched");
		}
		else {
			System.out.println("Address not matched.");
		}
		if(this.employeeSalary == e.employeeSalary) {
			System.out.println("Employees Salary equal.");
		}
		else {
			System.out.println("Salary not matched.");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Employee e1 = new Employee();
		System.out.println("Employee id     : "+e1.employeeId);
		System.out.println("Employee Name   : "+e1.employeeName);
		System.out.println("Employee Address: "+e1.employeeAddress);
		System.out.println("Employee Salary : "+e1.employeeSalary);
		System.out.println();
		Employee e2 = new Employee(123, "Aliraza", "Ghalib Nagar Larkana", 345627.746);
		System.out.println("Employee id     : "+e2.employeeId);
		System.out.println("Employee Name   : "+e2.employeeName);
		System.out.println("Employee Address: "+e2.employeeAddress);
		System.out.println("Employee Salary : "+e2.employeeSalary);
		System.out.println();
		System.out.println();
		System.out.println("Calling setters and getters");
		e1.setEmployeeName("Ghulam Hussain");
		e1.setEmployeeId(50);
		e1.setEmployeeAddress("New Busstand larkana");
		e1.setEmployeeSalary(438459.4333);
		
		e2.setEmployeeName("Shah Hussain");
		e2.setEmployeeId(12345);
		e2.setEmployeeAddress("Bander Road Larkana");
		e2.setEmployeeSalary(484935.432);
		
		System.out.println("Employee id     : "+e1.employeeId);
		System.out.println("Employee Name   : "+e1.employeeName);
		System.out.println("Employee Address: "+e1.employeeAddress);
		System.out.println("Employee Salary : "+e1.employeeSalary);
		
		System.out.println("Employee id     : "+e2.employeeId);
		System.out.println("Employee Name   : "+e2.employeeName);
		System.out.println("Employee Address: "+e2.employeeAddress);
		System.out.println("Employee Salary : "+e2.employeeSalary);
		e1.compareEmployee(e2);
		
	}
}
