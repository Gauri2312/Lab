/*Q.1)Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining               Address
Robert            1994                64C- WallsStreat
Sam               2000                68D- WallsStreat
John              1999                26B- WallsStreat */

package lab.constructor;

//start the program
//part-1

//create class employee
class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;
    
    // Constructor
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
    
    // Method to display employee information
    void display() {  
    	System.out.println(name + "\t\t" + yearOfJoining + "\t\t" + address);
    }
}

