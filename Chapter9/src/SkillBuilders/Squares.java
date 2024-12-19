package SkillBuilders;

public class Squares {

 public static void main(String[] args) {
       
	 // Create an array with 5 elements
        
	 int[] numbers = new int[5];

        // Store the square of each index in the array
       
	 for (int i = 0; i < numbers.length; i++) 
      
		 numbers[i] = i * i; // Square of the index
       
	 

        // Display the values of each element in the array
       
	 System.out.println("Values in the array:");
        for (int i = 0; i < numbers.length; i++) 
       
        	System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
