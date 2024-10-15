package Masters;

import java.util.*;

public class GuessingGame  
{
	public static void main(String[] args)
	{
		

		Scanner userInput = new Scanner(System.in); 

        //  Determining a secret number by randomizing a number between 1 and 20
        Random random = new Random();
       // Generates a number between 1 and 20
        int secretNumber = random.nextInt(20) + 1 ; 

        // Create a Scanner object to read input from the player
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the player for a number between 1 and 20
        System.out.print("Guess a number between 1 and 20: ");
        int playerGuess = scanner.nextInt();

        // Compare the player's number to the secret number
        // Display the secret number and the player's number
        System.out.println("Your guess: " + playerGuess);
        System.out.println("Secret number: " + secretNumber);

        // Determine the result and display the appropriate message
        if (playerGuess == secretNumber) {
            System.out.println("You won!!!!!!!!!!!!!!!!!!!!!!!!!");
        } else {
            System.out.println("Better luck next time...maybe");
        }

        
        
    }
}