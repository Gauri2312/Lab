//Q.3)Wap to check whether the entered number is prime or not
package com.alnassignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int den=2;
		
		while(den<num)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
			if(num==den)
			{
				System.out.println("It is prime number.");
			}
			else
			{
				System.out.println("It is not a prime number.");
			}
	}

}
