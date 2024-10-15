package SkillBuilders;

import java.util.*;

public class NumberSum {
	
	public static void main(String[] args) {
		
	
		
		 
		Scanner scanner = new Scanner(System.in);
	       
		// Prompt the user for a number
	        
		System.out.print(": ");
	        
		int number = scanner.nextInt();
	 // Creating a variable for given input. 
		
		int sum = 0; 
	        
		// Program displays all the numbers from 1 to whatever the user inputed. 
	        
		System.out.println("Numbers from 1 to " + number + ":");
	      
	        
		for (int num = 1; num <= number; num++) {
	           
			System.out.println(num);
	         
			// Add the current number to the sum
		       
			sum += num; 
	       
		}
	       
		//Display the total sum
		
		System.out.println("Thank you!"); 
	       
	       
	        
	     
	   
		
	}
}





