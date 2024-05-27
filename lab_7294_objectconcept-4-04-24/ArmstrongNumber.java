//Q.1)WAP to check Whether the number is Armstrong number or 
//not using class and object concept

package com.alnassignment;
//Start of the Program
//imported scanner class for the input
import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
      //Created the Scanner object to take input from the user
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter a number: ");
      int num=sc.nextInt();//taking the input from user

      int rem,result=0,originalNumber;//declaring varibles for calculation
      originalNumber=num;//storing user input to original number because while calculation it's value is going to change.
      while (originalNumber!=0) {
          rem=originalNumber%10;//finding the reminder of the number
          result+=Math.pow(rem,3);//if its 3 digit number we are finding it's cube root and adding into the result.
          originalNumber/=10;//dividing original number by 10 to get remaining numbers .
      }
      /*If the user enterd number is equal to the result then it is the Armstrong number */
      if(result==num){
          System.out.println(num+" is an Armstrong number.");
      }
      else{
          System.out.println(num+" is not armstrong number.");
      }
  sc.close();//closing the object of the Scanner class.
  }
  
}
//End of the Program