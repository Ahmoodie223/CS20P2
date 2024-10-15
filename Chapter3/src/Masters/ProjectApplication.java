package Masters;

import java.text.DecimalFormat;

import java.util.*;

public class ProjectApplication 
{
	public static void main(String[] args)
	{
		
		
	Scanner userInput = new Scanner(System.in);
	
	///Preparing format to get the percentages
	DecimalFormat formatter = new DecimalFormat("#.##");
	 
	///declaring variables by using 'double' to receive decimal numbers instead of using integers that only gives us normal number 
	double designing, coding, debugging, testing, totaltime, designingper, codingper, debuggingper, testingpr;
	
	
	
	/// Telling the user to enter values for variables
	System.out.print("Please enter your amount of minutes for designing:");
	
	designing = userInput.nextInt();
	
	System.out.print("Time of coding:");
	coding = userInput.nextInt();
	
	System.out.print("Time of debugging:");
	debugging = userInput.nextInt();
	
	System.out.print("Time of testing:");
	testing = userInput.nextInt();
	
	///Adding all of the time into a single variable
	
	totaltime = (designing + coding + debugging + testing); 
	
	///finding percentages of each task
	
	designingper = (designing/totaltime) *100 ;
	codingper = (coding/totaltime)  *100;
	debuggingper = (debugging/totaltime) *100 ;
	testingpr = (testing/totaltime) *100;
	///Outputting the result of each percentage using the decimal format
	
	
	System.out.println("Task       %Time"); 
	
	System.out.println("‎ ‎ ‎ ");
	
	System.out.println("Designing: " + formatter.format(designingper) + "%");
	
	System.out.println("Coding: " + formatter.format(codingper) + "%");
	
	System.out.println("Debugging:" + formatter.format(debuggingper) + "%");
	
	System.out.println("Testing:" + formatter.format(testingpr) + "%");
	
	System.out.println("Thank you for using my program!"); 
	
	
	
	
	
	
	
	
	
	
	
	}
		
	} 
	
    
    	
    