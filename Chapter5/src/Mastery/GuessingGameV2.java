package Mastery;

import java.util.*;

public class GuessingGameV2 {
	
	public static void main(String[] args) {
		
	
		
		 
		 Scanner userInput = new Scanner(System.in); 

	        // Determining a secret number by randomizing a number between 1 and 20
	      
		 Random random = new Random();
	      
		 // Generates a number between 1 and 20
	      
		 int secretNumber = random.nextInt(20) + 1;

	      
		 // Initialize the player's guess
	       
		 int playerGuess = 0; 

	        // Loop until the player guesses the secret number
	        
		 while (playerGuess != secretNumber) {
	          
			 // Prompt the player for a number between 1 and 20
	          
			 System.out.print("Guess a number between 1 and 20: ");
	           
			 playerGuess = userInput.nextInt();

	            // Determine the result and display the appropriate message
	           
			 if (playerGuess == secretNumber) {
	                System.out.println("You won!!!!!!!");
	           
			 } else {
	            
				 System.out.println("Wrong, try again!");
			 }
	        
		 }
      
    }
}

		
		
		
		
		
	
