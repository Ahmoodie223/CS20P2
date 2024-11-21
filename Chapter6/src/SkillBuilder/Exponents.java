package SkillBuilder;

import java.util.Scanner;

public class Exponents {
	
public static void main(String[] args) {
	      
	Scanner userInput = new Scanner(System.in);
	       
	// Get the base value from the user
	      
	System.out.print("Enter any number of your choice: ");
	       
	double base = userInput.nextDouble();
	      
	// Ask the user for the value of the exponent 
	      
	System.out.print("Enter the number of the exponent: ");
	       
	       
	double exponent = userInput.nextDouble();
	      
	// Calculating the result
	       
	double result = base;
	       
	for (int i = 1; i < exponent; i++) 
		
	// Multiply base for exponent times
		
		result *= base; 
	       
	
	       
	// Show the result
	       
	System.out.println(base + " raised to the power of " + exponent + " is: " + result);
	
	System.out.println("Thank You!");
	      
	
	    }
}
