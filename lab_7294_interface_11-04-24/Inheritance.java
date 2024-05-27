//Q.1)Create an interface called "Person" with a method called "speak".
//Create two classes  called "Student" and "Teacher" that implement the Person 
//interface and implement the "speak" method. Create objects of both the Student
//and  Teacher classes and call their respective "speak"  methods.

//part-4

package lab.inheritance;
//Main class to demonstrate the usage
public class Inheritance {

	public static void main(String[] args) {
		// Create objects of both Student and Teacher classes
        Student s = new Student();
        Teacher t = new Teacher();
        
        // Call the speak method of both objects
        s.speak();
        t.speak();
	}
}
//end of the program