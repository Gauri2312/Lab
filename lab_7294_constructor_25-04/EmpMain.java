/*Q.1)Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining               Address
Robert            1994                64C- WallsStreat
Sam               2000                68D- WallsStreat
John              1999                26B- WallsStreat */

package lab.constructor;

//part-2

//main method
public class EmpMain {
	    public static void main(String[] args) {
	        // Creating objects of Employee class
	        Employee employee1 = new Employee("Robert", 1994, 50000, "64C- WallsStreet");
	        Employee employee2 = new Employee("Sam", 2000, 60000, "68D- WallsStreet");
	        Employee employee3 = new Employee("John", 1999, 70000, "26B- WallsStreet");
	        
	        // Displaying employee information
	        System.out.println("Name      Year of Joining            Address");
	        employee1.display();
	        employee2.display();
	        employee3.display();
	    }
}
//end of the program