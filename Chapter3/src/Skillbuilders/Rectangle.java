package Skillbuilders;

import java.util.*;

public class Rectangle
{
	public static void main(String[] args)
	{
		
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Please Enter The Length Value Of The Rectangle: ");
		
		int length = userInput.nextInt();
		
		System.out.print("Please Enter The Width Value Of The Rectangle: ");
		
		int width = userInput.nextInt();
		
		int perimeter  = length + width + length + width;
		
		System.out.print("The Perimeter Of The Rectangle Is: "+ perimeter);
		
		
	}
}
		
