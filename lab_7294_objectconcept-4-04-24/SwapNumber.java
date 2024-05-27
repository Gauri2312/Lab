//Q.2)WAP to swap two numbers without using third variable using class 
//and object concept.

package com.alnassignment;
//Start of the Program
//imported scanner class for the input
import java.util.*;
public class SwapNumber { 
	    public static void main(String args[])   
	    {   
	        System.out.println("Enter the value of a and b: ");  
	        Scanner sc = new Scanner(System.in);  
	        /*Define variables*/  
	        int a = sc.nextInt();  
	        int b = sc.nextInt();  
	        System.out.println("before swapping numbers: "+a +" "+ b);  
	       /*Swapping*/  
	        a = a + b;   
	        b = a - b;   
	        a = a - b;   
	        System.out.println("After swapping: "+a +"  " + b);   
	    }        
}
//end of the program