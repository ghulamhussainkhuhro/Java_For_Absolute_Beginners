package Objects_and_Classes;

class EmployeeDetails1 {
    int employeeId;
    String employeeName;
    String employeeAddress;

    // Default constructor
    EmployeeDetails1() {
        employeeId = 0;
        employeeName = "abc";
        employeeAddress = "xyz";
    }

    // Parameterized constructor
    EmployeeDetails1(int eId, String eName, String eAddress) {
        employeeId = eId;
        employeeName = eName;
        employeeAddress = eAddress;
    }

    // Static copy method
    public static EmployeeDetails1 copyEmployee(EmployeeDetails1 e) {
        EmployeeDetails1 e1 = new EmployeeDetails1();
        e1.employeeId = e.employeeId;
        e1.employeeName = e.employeeName;
        e1.employeeAddress = e.employeeAddress;
        return e1;
    }

    // Non-static copy method (now a true non-static copy constructor)
    public EmployeeDetails1 copyEmployee2() {
        EmployeeDetails1 e1 = new EmployeeDetails1();
        e1.employeeId = this.employeeId;
        e1.employeeName = this.employeeName;
        e1.employeeAddress = this.employeeAddress;
        return e1;
    }
}

public class Employee1 {

    public static void main(String[] args) {
        EmployeeDetails1 e2 = new EmployeeDetails1(123, "Aliraza", "Ghalib Nagar Larkana");

        System.out.println("Employee id     : " + e2.employeeId);
        System.out.println("Employee Name   : " + e2.employeeName);
        System.out.println("Employee Address: " + e2.employeeAddress);

        EmployeeDetails1 e4 = EmployeeDetails1.copyEmployee(e2);
        System.out.println("Copied Employee id     : " + e4.employeeId);
        System.out.println("Copied Employee Name   : " + e4.employeeName);
        System.out.println("Copied Employee Address: " + e4.employeeAddress);

        EmployeeDetails1 e5 = e2.copyEmployee2(); // Now calling the non-static copy constructor
        System.out.println("Copied Employee id     : " + e5.employeeId);
        System.out.println("Copied Employee Name   : " + e5.employeeName);
        System.out.println("Copied Employee Address: " + e5.employeeAddress);
    }
}
