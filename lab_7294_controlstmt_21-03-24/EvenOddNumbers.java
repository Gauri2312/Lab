//Q.2) WAP to generate even and odd numbers between 1 and 100
package com.alnassignment;

public class EvenOddNumbers {

	public static void main(String[] args) {
		 System.out.println("Even numbers between 1 and 100:");
	        for (int i = 1; i <= 100; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i+" ");
	                
	            }
	        }
	        
	        System.out.println("\n\nOdd numbers between 1 and 100:");
	        for (int i = 1; i <= 100; i++) {
	            if (i % 2 != 0) {
	                System.out.print(i+" ");
	            }
	        }
	}
}
