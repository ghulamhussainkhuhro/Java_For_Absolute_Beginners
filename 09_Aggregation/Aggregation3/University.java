package Aggregation3;

import java.util.ArrayList;

public class University {
    String uniName;
    String address;
    ArrayList<Department> departments;

    University(String uniName, String address) {
        this.uniName = uniName;
        this.address = address;
        this.departments = new ArrayList<>();
    }

    public void addDep(Department department) {
        departments.add(department);
    }
    public void getUniData() {
    	System.out.println(uniName + "  " + address );
    }
    public void departmentData(Department d) {
    	System.out.println(d.depName+"  "+d.hod);
    }
    
}

