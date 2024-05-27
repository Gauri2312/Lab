/*3)WAP to Reverse a string with the help of loop.
*/
package com.alnassignment;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String ip = sc.nextLine();

        // Reversed string
        String rev = reverseString(ip);

        // Output the reversed string
        System.out.println("Reversed string: " + rev);
    }

    public static String reverseString(String str) {
        // Initialize an empty string to store the reversed string
        String rev = " ";

        // Iterate through the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            rev += str.charAt(i);
        }

        // Return the reversed string
        return rev;
    }
}

