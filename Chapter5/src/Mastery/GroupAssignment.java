package Mastery;

import java.util.*;

public class GroupAssignment {
	
	public static void main(String[] args) {
		
	
		
		 
		Scanner userInput = new Scanner(System.in); 
		 

	        // Prompt the user for the first name
	        
		System.out.print("Enter your first name: ");
	       //Creating a variable from given first name using a String function
		
		String firstName = userInput.nextLine();

	      
		// Prompt the user for the last name
	        
		System.out.print("Enter your last name: ");
	     
		String lastName = userInput.nextLine();
	      
		// Combine first name and last name creating a single variable for both
	       
		String fullName = firstName + " " + lastName;

	        // Get the first letter of the last name and convert to uppercase
	      
		//Char function stores the first letter
		char firstLetter = Character.toUpperCase(lastName.charAt(0));

	       // Determine the group assignment based on the first letter
	        
		int groupNumber;
	       
		if (firstLetter >= 'A' && firstLetter <= 'I') 
	            groupNumber = 1;
	        
		else if (firstLetter >= 'J' && firstLetter <= 'S') 
	            groupNumber = 2;
	       
		else if (firstLetter >= 'T' && firstLetter <= 'Z') 
	            groupNumber = 3;
	        
		else 
			// Invalid last name
			groupNumber = -1; 
	        

	        // Display the result
	        
		if (groupNumber != -1) 
	         System.out.println(fullName + " is assigned to group: " + groupNumber);
	        
		else 
	         System.out.println("Invalid last name provided.");
	    
    }
}