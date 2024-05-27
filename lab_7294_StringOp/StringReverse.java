//Q.2)WAP a program to reverse a given String without using reverse() method.
package lab.stringop;
//start the program
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        // Convert the string to a character array
        char charArray[] = input.toCharArray();

        // Initialize indices for reversing
        int start = 0;
        int end = charArray.length - 1;

        // Reverse the string by swapping characters from start to end
        while (start < end) {
            // Swap characters
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        // Convert the character array back to a string
        String reversedString = new String(charArray);

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);
    }
}
//end of the program