package Mastery;

import java.util.Scanner;

public class DigitExtractor {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in); 
        
        // Get user input for the integer
       
        System.out.print("Please Enter An Integer: ");
       
        int num =  userInput.nextInt();
    
        // Initialize choice with a default value to start the loop
       
        int choice = -1; 
        
        while (choice != 0) {
            // Display menu options
            System.out.println("\nShow (O)nes digit");
            System.out.println("Show (T)ens digit");
            System.out.println("Show (H)undreds digit");
            System.out.println("Show (W)hole number");
            System.out.println("      (Q)uit");
            System.out.print("Enter your choice: ");
            
            // Read the user choice
           
            char inputChoice = userInput.next().toUpperCase().charAt(0);
            
            // Map the input character to the appropriate choice number
           
            switch (inputChoice) {
                
            case 'O': // Show ones digit
                    System.out.println("Ones digit: " + (num % 10));
                    break;
                
                case 'T': // Show tens digit
                    System.out.println("Tens digit: " + ((num / 10) % 10));
                    break;
                
                case 'H': // Show hundreds digit
                    System.out.println("Hundreds digit: " + ((num / 100) % 10));
                    break;
                
                case 'W': // Show whole number
                
                	System.out.println("The whole number is: " + num);
                    break;
                
                case 'Q': // Quit the program
                  
                	System.out.println("Thank you for using Khaled's the program!");
                    
                	choice = 0; // Exit the loop
                
                    break;
               
                default:
                   
                	System.out.println("Invalid choice. Please try again.");
                    
                	break;
            
        
            }
        }
       
    }
}