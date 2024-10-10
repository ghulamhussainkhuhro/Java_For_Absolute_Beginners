package Inheritance1;

public class Programmer extends Employee{
	private String role;
	private int idNo;
	
	Programmer(String role, int idNo){
		this.role = role;
		this.idNo = idNo;
		
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRole() {
		return role;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public int getIdNo() {
		return idNo;
	}
	public void showData() {
		System.out.println("Name of Employee : " + getName());
		System.out.println("ID of Employee : " + idNo);
		System.out.println("Role of Employee : " + role);
		System.out.println("Salary of Employee : " + getSalary());
	}

}
