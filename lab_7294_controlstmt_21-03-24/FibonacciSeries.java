//Q.1) WAP to generate fibonacci series 0 1 1 2 3 5 8
package com.alnassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count = 7; // Number of elements in the Fibonacci series
        int n1 = 0;
        int n2 = 1;
        
        System.out.println("Fibonacci Series:");
        System.out.print(n1 + " " + n2 + " "); // Print the first two elements
        
        for (int i = 2; i < count; i++) {
            int res = n1 + n2;
            System.out.print(res + " ");
            n1 = n2;
            n2 = res;
        }
	}
}
