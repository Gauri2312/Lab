/*Q.2)WAP to implement abstract methods for class person(id,name,salary) 
and subclass manager and Employee .(add your own attributes of choice)
*/
package lab.constructor;

//part-4

//main method
public class PersonMain {
	 public static void main(String[] args) {
	        Manager manager = new Manager(101, "Janvi Sharma", 80000, "HR");
	        Employee1 employee = new Employee1(201, "Sumit Tiwari", 50000, "Software Engineer");
	        
	        // Displaying details
	        manager.displayDetails();
	        System.out.println();
	        employee.displayDetails();
	    }
}
//end of the program