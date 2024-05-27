//Q.4)Create bean for Employee with fields(eid,ename,esalary).

//part-1

package com.alnassignment;
//Start the program
//Create Employee1 class
public class Employee1 {
	    private int eid;
	    private String ename;
	    private double esalary;

	    // Constructor
	    public Employee1(int eid, String ename, double esalary) {
	        this.eid = eid;
	        this.ename = ename;
	        this.esalary = esalary;
	    }

	    // Getter and Setter methods for eid
	    public int getEid() {
	        return eid;
	    }

	    public void setEid(int eid) {
	        this.eid = eid;
	    }

	    // Getter and Setter methods for ename
	    public String getEname() {
	        return ename;
	    }

	    public void setEname(String ename) {
	        this.ename = ename;
	    }

	    // Getter and Setter methods for esalary
	    public double getEsalary() {
	        return esalary;
	    }

	    public void setEsalary(double esalary) {
	        this.esalary = esalary;
	    }

	    // Optional: toString method for printing employee details
	    @Override
	    public String toString() {
	        return "Employee{" +
	                "eid=" + eid +
	                ", ename='" + ename + '\'' +
	                ", esalary=" + esalary +
	                '}';
	    }
}

