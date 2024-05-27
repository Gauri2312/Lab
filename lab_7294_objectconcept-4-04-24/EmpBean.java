//Q.4)Create bean for Employee with fields(eid,ename,esalary).

//part-2

package com.alnassignment;
//create EmpBean class for main method
public class EmpBean {

	public static void main(String[] args) {
		// Creating an Employee object
        Employee1 e1 = new Employee1(1, "Gauri", 50000.0);

        // Getting and printing employee details
        System.out.println("Employee ID: " + e1.getEid());
        System.out.println("Employee Name: " + e1.getEname());
        System.out.println("Employee Salary: " + e1.getEsalary());
	}
}
//end of the program