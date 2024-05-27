/*Q.3)Create a class Student having roll_ number,Name as fields.
Create another class Marksdetails to accept 5 subject marks.
 Apply Single Inheritance to display the result*/

//part-3

package com.alnassignment;
//imported scanner class for the input
import java.util.Scanner;
//Create SingleInheritance class for main method
public class SingleInheritance {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Input student details
     System.out.print("Enter Roll Number: ");
     int rollNumber = sc.nextInt();
     sc.nextLine(); // Consume newline character
     System.out.print("Enter Name: ");
     String name = sc.nextLine();

     // Creating object of child class MarksDetails
     MarksDetails1 studentMarks = new MarksDetails1(rollNumber, name);

     // Input marks
     studentMarks.setMarks();

     // Displaying student details and marks
     studentMarks.displayDetails();
     studentMarks.displayResult();
   }
}
//end of the program
