//Q.1)Create an interface called "Person" with a method called "speak".
//Create two classes  called "Student" and "Teacher" that implement the Person 
//interface and implement the "speak" method. Create objects of both the Student
//and  Teacher classes and call their respective "speak"  methods.

//part-2

package lab.inheritance;

//Implement the Student class
public class Student implements Person {

	@Override
	public void speak() {
		System.out.println("I am a student.");
	}

}
//end of student class