package Mastery;

public class EvenAndOdds {

public static void main(String[] args) {
	       
	        //Generate 25 random numbers between 0 and 99
	        int[] numbers = generateRandomNumbers(25, 0, 99);
	       
	        //Print all odd numbers
	        System.out.println("ODD Numbers:");
	     
	        printNumbers(numbers, false);  //false flag indicates printing odd numbers
	       
	        //Print a new line before displaying even numbers
	        System.out.println("\nEVEN Numbers:");
	       
	        //Print all even numbers
	        printNumbers(numbers, true);   //true flag indicates printing even numbers
	    }
	    //Method to generate an array of random numbers
	    public static int[] generateRandomNumbers(int size, int min, int max) {
	       
	        // Create an array to hold the random numbers
	        int[] numbers = new int[size];
	       
	        //Calculate the range of random numbers
	        int range = max - min + 1;
	       
	        // Loop to populate the array with random numbers in the given range
	        for (int i = 0; i < size; i++) {
	         
	        	//Assign a random number between min and max to each element
	            numbers[i] = (int) (Math.random() * range) + min;
	        }
	       
	        //Return the populated array
	        return numbers;
	    }
	    //Method to print either even or odd numbers based on the flag
	    public static void printNumbers(int[] numbers, boolean printEven) {
	       
	        //Loop through each number in the array
	        for (int num : numbers) {
	           
	            //If printEven is true, print only even numbers
	            if (printEven && num % 2 == 0) {
	               
	            	System.out.print(num + " ");
	           
	            //If printEven is false, print only odd numbers
	            } else if (!printEven && num % 2 != 0) {
	              
	            	System.out.print(num + " ");
	            }
	        }
	    }
	



	}


