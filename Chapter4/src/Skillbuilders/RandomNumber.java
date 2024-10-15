package Skillbuilders;

import java.util.*;

public class RandomNumber
{
	public static void main(String[] args)
	{
		

		Scanner userInput = new Scanner(System.in);

         // Prompt the user for minimum and maximum values
        System.out.print("Enter the minimum value: ");
        int min = userInput.nextInt();
        
        System.out.print("Enter the maximum value: ");
        int max = userInput.nextInt();
        
        // Generate a random number between min and max
        Random random = new Random();
        int randomNum = random.nextInt((max - min) + 1) + min; // inclusive of min and max
        
        // Display the random number
        System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
        
        
    }
}
