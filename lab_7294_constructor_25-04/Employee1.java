/*Q.2)WAP to implement abstract methods for class person(id,name,salary) 
and subclass manager and Employee .(add your own attributes of choice)
*/
package lab.constructor;

//part-3

//create class employee with extends a base class
class Employee1 extends Person {
    String designation;
    
    // Constructor
    Employee1(int id, String name, double salary, String designation) {
        super(id, name, salary);
        this.designation = designation;
    }
    
    // Implementing abstract method
    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}