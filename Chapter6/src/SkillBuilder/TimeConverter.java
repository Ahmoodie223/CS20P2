package SkillBuilder;

import java.util.*;

public class TimeConverter {
	
	//Converts hours to minutes
		public static void hoursToMin()
		{
			//Declaration
			int hours, mins;
			
			//Preparing for user input
			
			Scanner userinput = new Scanner(System.in);
			
			//Prompt and record user input
			
			System.out.println("Enter the number of hours: ");
			
			hours = userinput.nextInt();
			
			mins = hours * 60;
			
			System.out.println( "There are "+ mins + " minutes in "+ hours + " hours.");		
			
		}
		
		//Convert days to hours
		public static void daysToHours()
		{
			//Declaration
			int days, hours;
			
			//Preparing for user input
			
			Scanner userinput = new Scanner(System.in);
			
			//Prompt and record user input
			
			System.out.println("Enter the number of days: ");
			
			days = userinput.nextInt();
			
			//Convert days to hours
			
			hours = days * 24;
			
			//Output the final message to the user
			
			System.out.println( "There are "+ hours + " hours in "+ days + " days." );		
			
		}
		
		public static void main(String[] args) 
		{
			
			int choice;
			
			//Preparing for user input
			
			Scanner userinput = new Scanner(System.in);
					
			//Prompt and record user input
			
			System.out.println( "Please choose one of the following options: ");
			
			System.out.println( "1. Hours to minutes. ");
			
			System.out.println( "2. Days to hours. ");
			
			//Record the users choice
			
			choice = userinput.nextInt();
			
			//Let the switch statement decide which method to call
			
			switch(choice)
			{
				
			case 1:
					hoursToMin();
					
				
				case 2:
					daysToHours();
				
			}

		}

	}
		
	