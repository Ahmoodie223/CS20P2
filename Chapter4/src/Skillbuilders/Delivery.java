package Skillbuilders;

import java.util.*;

public class Delivery 
{
	public static void main(String[] args)
	{
		

		Scanner userInput = new Scanner(System.in);

         // Prompt the user for the dimensions of the package
        System.out.print("Enter the length of the package: ");
        double length = userInput.nextInt();;

        System.out.print("Enter the width of the package: ");
        double width =userInput.nextInt();

        System.out.print("Enter the height of the package: ");
        double height = userInput.nextInt();

        // Check dimensions and display result
        if (length > 10 || width > 10 || height > 10) 
            System.out.println("Reject");
         else 
            System.out.println("Accept");
        

        
    }
}