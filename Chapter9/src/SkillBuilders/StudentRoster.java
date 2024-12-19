package SkillBuilders;

import java.util.Scanner;

public class StudentRoster {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner userinput = new Scanner(System.in);

        // Prompt the user for the number of students in the class
        System.out.print("Enter the number of students in the class: ");
        int numberOfStudents = userinput.nextInt();
        userinput.nextLine(); // Consume the newline left by nextInt()

        // Create an array to store the names of the students
        String[] studentNames = new String[numberOfStudents];

        // Prompt the user for each student's name
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = userinput.nextLine();
      
        }

       
        // Display the title and the student roster
      
        System.out.println("\nStudent Roster:");
       
        for (String student : studentNames) {
            
        	System.out.println(student);
        }

       
    }
}
