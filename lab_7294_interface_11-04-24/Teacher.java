//Q.1)Create an interface called "Person" with a method called "speak".
//Create two classes  called "Student" and "Teacher" that implement the Person 
//interface and implement the "speak" method. Create objects of both the Student
//and  Teacher classes and call their respective "speak"  methods.

//part-3

package lab.inheritance;
//Implement the Teacher class
public class Teacher implements Person{

	@Override
	public void speak() {
		System.out.println("I am a teacher.");	
	}
}
//end of teacher class