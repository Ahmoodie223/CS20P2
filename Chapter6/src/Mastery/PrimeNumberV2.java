package Mastery;

import java.util.*;

public class PrimeNumberV2 {
	
	public static void main(String[] args) {
		
	
		
		 
		Scanner userInput = new Scanner(System.in); 

		
		  System.out.print("Welcome! Please enter any number of your choice: ");
	      
		  int num = userInput.nextInt();
		
		  // Start assuming it's prime if > 1 using boolean function
	   
		  boolean isPrime = (num > 1); 

	     for (int i = 2; i * i <= num; i++) {
	    
	     if (num % i == 0) {
	    // Finding a divisor
	   
	    isPrime = false; 
	     
	       
	       //Ends the code once number is stored and calculated if its prime or not. 
	     
	    	break;
	            }
	        }
	     
	     //Tells the user if the given number is prime or not. 

	      System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
	     
	      System.out.println("Thank you!"); 
		
		
	}
}