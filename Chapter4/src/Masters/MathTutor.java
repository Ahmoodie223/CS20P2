package Masters;

import java.util.*;

public class MathTutor 
{
	public static void main(String[] args)
	{
		

		Scanner userInput = new Scanner(System.in);
		
		
		
		Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate two random single-digit numbers
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        String operator = getRandomOperator(random);

        // Handle division to avoid division by zero
        if (operator.equals("/") && num2 == 0) {
            num2 = 1; // Set num2 to 1 to avoid division by zero
        }

        // Create and display the equation
        String equation = num1 + " " + operator + " " + num2;
        System.out.print("What is  ");
        System.out.println(equation +  "?");

        // Calculate the correct answer
        int correctAnswer = calculateAnswer(num1, num2, operator);

        // Get user input
        System.out.print("Your answer: ");
        int userAnswer = scanner.nextInt();

        // Check the answer
        if (userAnswer == correctAnswer) {
            System.out.println("Correct! Amazing job");
        } else {
            System.out.println("Oh No... Wrong! The correct answer is: " + correctAnswer);
        }

        scanner.close();
    }

     static String getRandomOperator(Random random) {
        String[] operators = {"+", "-", "*", "/"};
        return operators[random.nextInt(operators.length)];
    }

     static int calculateAnswer(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2; // Integer division
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}

    
    