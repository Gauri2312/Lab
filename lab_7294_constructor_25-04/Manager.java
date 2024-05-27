/*Q.2)WAP to implement abstract methods for class person(id,name,salary) 
and subclass manager and Employee .(add your own attributes of choice)
*/
package lab.constructor;

//part-2

//create class manager with extends a base class
class Manager extends Person {
    String department;
    
    // Constructor
    Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }
    
    // Implementing abstract method
    void displayDetails() {
        System.out.println("Manager Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}