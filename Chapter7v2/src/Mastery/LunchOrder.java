package Mastery;

import java.util.Scanner;

public class LunchOrder {
    public static void main(String[] args) {
        // Define food items with their respective prices and nutritional data
        Foods burger = new Foods(1.85, 9, 33, 1);
        Foods greens = new Foods(2.00, 1, 11, 5);
        Foods  fries = new Foods(1.30, 11, 36, 4);
        Foods drink = new Foods(0.95, 0, 38, 0);
        
        // Create a Scanner object for user input
        Scanner userinput = new Scanner(System.in);
  
        // Ask the user for the quantity of each item
        System.out.print("How many hamburgers would you like?: ");
        int burgerQty = userinput.nextInt();

        System.out.print("How many salads would you like?: ");
        int greensQty = userinput.nextInt();

        System.out.print("How many orders of French fries would you like?: ");
        int friesQty = userinput.nextInt();

        System.out.print("How many sodas would you like? ");
        int drinkQty = userinput.nextInt();

        // Calculate the total price
        double totalAmount = (burger.getPrice() * burgerQty) +
                             (greens.getPrice() * greensQty) +
                             (fries.getPrice() * friesQty) +
                             (drink.getPrice() * drinkQty);

        // Calculate the nutritional values for each item
        int burgerFat = burger.getFat() * burgerQty;
        int burgerCarbs = burger.getCarbs() * burgerQty;
        int burgerFiber = burger.getFiber() * burgerQty;

        int greensFat = greens.getFat() * greensQty;
        int greensCarbs = greens.getCarbs() * greensQty;
        int greensFiber = greens.getFiber() * greensQty;

        int friesFat = fries.getFat() * friesQty;
        int friesCarbs = fries.getCarbs() * friesQty;
        int friesFiber = fries.getFiber() * friesQty;

        int drinkFat = drink.getFat() * drinkQty;
        int drinkCarbs = drink.getCarbs() * drinkQty;
        int drinkFiber = drink.getFiber() * drinkQty;

        // Print the details of the order
        System.out.println("\nOrder Breakdown:");
        System.out.println("\nHamburgers:");
        System.out.println("  Fat: " + burgerFat + "g");
        System.out.println("  Carbs: " + burgerCarbs + "g");
        System.out.println("  Fiber: " + burgerFiber + "g");

        System.out.println("\nSalads:");
        System.out.println("  Fat: " + greensFat + "g");
        System.out.println("  Carbs: " + greensCarbs + "g");
        System.out.println("  Fiber: " + greensFiber + "g");

        System.out.println("\nFrench Fries:");
        System.out.println("  Fat: " + friesFat + "g");
        System.out.println("  Carbs: " + friesCarbs + "g");
        System.out.println("  Fiber: " + friesFiber + "g");

        System.out.println("\nSodas:");
        System.out.println("  Fat: " + drinkFat + "g");
        System.out.println("  Carbs: " + drinkCarbs + "g");
        System.out.println("  Fiber: " + drinkFiber + "g");

        // Display the final totals
        System.out.printf("\nTotal cost: $%.2f%n", totalAmount);
        System.out.println("Total fat: " + (burgerFat + greensFat + friesFat + drinkFat) + "g");
        System.out.println("Total carbohydrates: " + (burgerCarbs + greensCarbs + friesCarbs + drinkCarbs) + "g");
        System.out.println("Total fiber: " + (burgerFiber + greensFiber + friesFiber + drinkFiber) + "g");
    }
}
