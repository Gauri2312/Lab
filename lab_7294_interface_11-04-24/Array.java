//2)Write a program that asks the user to input ten integers and stores 
//them in an array.

package lab.inheritance;

//start of the program
import java.util.Scanner;
public class Array {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Create an array to store the integers
	        int[] numbers = new int[10];

	        // Ask the user to input ten integers
	        System.out.println("Please enter ten integers, one at a time:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter integer " + (i + 1) + ": ");
	            numbers[i] = sc.nextInt();
	        }

	        // Find the smallest and largest values in the array
	        int smallest = numbers[0];
	        int largest = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < smallest) {
	                smallest = numbers[i];
	            }
	            if (numbers[i] > largest) {
	                largest = numbers[i];
	            }
	        }

	        // Display the smallest and largest values
	        System.out.println("The smallest integer is: " + smallest);
	        System.out.println("The largest integer is: " + largest);

	        // Close the scanner
	        sc.close();
	    }
}
//end of the program