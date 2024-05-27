/*Q.3)Create a class Student having roll_ number,Name as fields.
Create another class Marksdetails to accept 5 subject marks.
 Apply Single Inheritance to display the result*/

//part-2

package com.alnassignment;
import java.util.Scanner;
//Child class inheriting from Student
public class MarksDetails1 extends Student1{
	private int[] marks = new int[5];

	 public MarksDetails1(int rollNumber, String name) {
	     super(rollNumber, name);
	 }

	 public void setMarks() {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter marks for 5 subjects:");

	     for (int i = 0; i < 5; i++) {
	         System.out.print("Subject " + (i + 1) + ": ");
	         marks[i] = sc.nextInt();
	     }
	 }

	 public void displayResult() {
	     int totalMarks = 0;
	     for (int mark : marks) {
	         totalMarks += mark;
	     }
	     double average = totalMarks / 5.0;

	     System.out.println("Marks Details:");
	     for (int i = 0; i < 5; i++) {
	         System.out.println("Subject " + (i + 1) + " Marks: " + marks[i]);
	     }
	     System.out.println("Total Marks: " + totalMarks);
	     System.out.println("Average Marks: " + average);
	 }
}
//end of the Child class