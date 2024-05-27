/*Q1)Write a program in Java to accept the name of an employee and his/her annual income. 
 * Pass the name and the annual income. Displays the name of the employee and the income tax
 * as per the given tariff:

Annual Income                Income Tax

Up to ₹2,50,000               No tax

₹2,50,001 to ₹5,00,000        10% of the income exceeding ₹2,50,000

₹5,00,001 to ₹10,00,000       ₹30,000 + 20% of the amount exceeding   ₹5,00,000

₹10,00,001 and above          ₹50,000 + 30% of the amount exceeding ₹10,00,000*/


package com.alnassignment;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Accepting employee name
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        // Accepting annual income
        System.out.print("Enter annual income (in INR): ");
        double income = sc.nextDouble();

        // Calculating income tax
        double tax = calculateIncomeTax(income);

        // Displaying employee name and income tax
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Income Tax: INR " + tax);

	}
	 public static double calculateIncomeTax(double income) {
	        if (income <= 250000) {
	            return 0; // No tax
	        } else if (income <= 500000) {
	            return (income - 250000) * 0.10; // 10% tax on the amount exceeding 250000
	        } else if (income <= 1000000) {
	            return 30000 + (income - 500000) * 0.20; // 30000 + 20% tax on the amount exceeding 500000
	        } else {
	            return 50000 + (income - 1000000) * 0.30; // 50000 + 30% tax on the amount exceeding 1000000
	        }
	    }

}
