//Q.1)WAP to search given student name is available in the list of student name using String array.
package lab.stringop;
//start the program
//import scanner 
import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of student names
        String studentNames[] = {"Alia", "Riya", "Chetan", "Dev", "Sumit"};

        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();

        // Flag to indicate whether the name is found
        boolean found = false;

        // Loop through the array to search for the name
        for (int i = 0; i < studentNames.length; i++) {
            if (studentNames[i].equalsIgnoreCase(searchName)) { // Case-insensitive comparison
                found = true;
                break; // Name found, no need to continue searching
            }
        }

        // Display result
        if (found) {
            System.out.println("Student found!");
        } else {
            System.out.println("Student not found!");
        }
    }
}
//end of program