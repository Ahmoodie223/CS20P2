package Skillbuilders;

import java.util.*;

public class digits 
{
	public static void main(String[] args)
	{
		
		
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Please enter your two digit number:");
	
    int Number = userInput.nextInt();
    
    int Tens = (Number / 10) % 10;
    
    int Ones = Number % 10;
    
    System.out.println("Tens: " + Tens);
    System.out.println("Ones: " + Ones);
    
    System.out.print("Thank You!"); 
	
	}
}