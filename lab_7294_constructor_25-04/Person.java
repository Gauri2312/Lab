/*Q.2)WAP to implement abstract methods for class person(id,name,salary) 
and subclass manager and Employee .(add your own attributes of choice)
*/
package lab.constructor;

//start the program
//part-1

//create abstract class person 
abstract class Person {
	int id;
    String name;
    double salary;
    
    // Constructor
    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    // Abstract method
    abstract void displayDetails();
}
