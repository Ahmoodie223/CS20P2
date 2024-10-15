package Skillbuilders;

import java.util.*;

public class GradeAveragePT1
{
	public static void main(String[] args)
	{
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please Enter Your First Grade:");
		int Grade1 = userInput.nextInt();
		
		System.out.print("Please Enter Your Second Grade:");
		int Grade2 = userInput.nextInt();
		
		System.out.print("Please Enter Your Third Grade:");
		int Grade3 = userInput.nextInt();
		
		System.out.print("Please Enter Your Fourth Grade:");
		int Grade4 = userInput.nextInt();
		
		System.out.print("Please Enter Your Fifth Grade:");
		int Grade5 = userInput.nextInt();
		
		int sum = (Grade1 + Grade2 + Grade3 + Grade4 + Grade5);
		
		int Divide = 5;
		
		int Total = sum/Divide;
		
		System.out.println("The Average of Your Grades Are " + Total + "%" );

		
	
	}
}
		