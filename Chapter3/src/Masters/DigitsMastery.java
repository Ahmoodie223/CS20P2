package Masters;

import java.util.*;

public class DigitsMastery 
{
	public static void main(String[] args)
	{
		
		
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Please enter your three digit number:");
	
   
	int Number = userInput.nextInt();
    	
	
	int Hundreds = Number / 100;
	
   
	int Tens = (Number / 10) % 10;
  
    
    int Ones = Number % 10;
    
    System.out.println("Hundreds: " + Hundreds);
   
    System.out.println("Tens: " + Tens);
    
    System.out.println("Ones: " + Ones);
    
    System.out.print("Thank You!"); 
	
    {
    	
    }

    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
} 