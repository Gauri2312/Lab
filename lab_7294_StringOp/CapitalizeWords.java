//Q.3)Write a java program to capitalize each word in string.
package lab.stringop;

//start the program

import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create a StringBuilder to build the capitalized string
        StringBuilder capitalizedString = new StringBuilder();

        // Flag to indicate whether the current character is the start of a new word
        boolean isNewWord = true;

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            if (isNewWord && Character.isLetter(currentChar)) {
                // Capitalize the current character if it's the start of a new word
                currentChar = Character.toUpperCase(currentChar);
                isNewWord = false;
            } else if (!isNewWord && Character.isWhitespace(currentChar)) {
                // Set the flag to true when encountering whitespace to indicate the start of a new word
                isNewWord = true;
            }

            // Append the character to the StringBuilder
            capitalizedString.append(currentChar);
        }

        // Output the capitalized string
        System.out.println("Capitalized string: " + capitalizedString);
    }
}
//end of the program
