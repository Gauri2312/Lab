//wap to check whether the person is eligible for getting loan or not.Condition to grant loan is he should have salary more than 50000 and he should be citizen of india otherwise loan can't be given to customer.
package com.oopexample;

import java.util.Scanner;

public class LoanOfPersonIndia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int sal = sc. nextInt();
        System.out.print("Is the person a citizen of India? (true/false): ");
        String citizenship = sc.next();

        if(sal>50000 && citizenship.equalsIgnoreCase("true"))
        {
            System.out.println("You are eligible for loan.");
        }
        else
        {
            System.out.println("You are not eligible for loan.");
        }
	}
}
