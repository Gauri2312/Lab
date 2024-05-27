//wap to find greatest among three number using nested if 
package com.oopexample;

import java.util.Scanner;

public class GreatestNestedIf{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		double n3=sc.nextDouble();
		
		if (n1 >= n2) 
		{
	       if (n1 >= n3) 
	       {
	    	   System.out.println("The greatest number is: " + n1);
	       } 
	       else 
	       {
	    	   System.out.println("The greatest number is: " + n3);
	       }
	    } 
		else 
		    {
	          if (n2 >= n3) 
	            {
	        	  System.out.println("The greatest number is: " + n2);
	            } 
	            else 
	            {
	            	System.out.println("The greatest number is: " + n3);
	            }
	        }
	  	}

	}


