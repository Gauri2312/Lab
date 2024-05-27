//wap that reads a set of integers and then prints the sum of the even and odd integers
package com.oopexample;

import java.util.Scanner;

public class SumOfEvenOddArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a[] = new int[5];
        System.out.println("Enter five numbers:");
        for(int i=0;i<5;i++) 
        {
            a[i] = sc.nextInt();
        }
        int Even=0;
        int Odd=0;
        for(int i=0;i<5;i++)
        {
        	if (a[i]%2 == 0) 
        	{
                Even += a[i];
            } 
        	else 
            {
                Odd += a[i];
            }
        }
        System.out.println("Sum of even numbers: " + Even);
        System.out.println("Sum of odd numbers: " + Odd);
	}

}
