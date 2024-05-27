/*Q.3)Create a class Student having roll_ number,Name as fields.
Create another class Marksdetails to accept 5 subject marks.
 Apply Single Inheritance to display the result*/

//part-1

package com.alnassignment;
//Start of the Program
//Parent class
public class Student1 {
	protected int rollNumber;
	 protected String name;

	 public Student1(int rollNumber, String name) {
	     this.rollNumber = rollNumber;
	     this.name = name;
	 }

	 public void displayDetails() {
	     System.out.println("Student Details:");
	     System.out.println("Roll Number: " + rollNumber);
	     System.out.println("Name: " + name);
	 }
}
//end of the Parent class