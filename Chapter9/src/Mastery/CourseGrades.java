package Mastery;

import java.util.Scanner;

public class CourseGrades {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        // Define the number of students and tests
        final int NUM_STUDENTS = 12;
        final int NUM_TESTS = 5;

        // Initialize the GradeBook object to store grades
        GradeBook gradeBook = new GradeBook(NUM_STUDENTS, NUM_TESTS);

        // Loop through each student to enter their grades
        for (int studentIndex = 0; studentIndex < NUM_STUDENTS; studentIndex++) {
            System.out.println("Enter grades for Student " + (studentIndex + 1) + ":");

            for (int testIndex = 0; testIndex < NUM_TESTS; testIndex++) {
                System.out.print("Test " + (testIndex + 1) + ": ");
                int grade = userinput.nextInt();
                gradeBook.setGrade(studentIndex, testIndex, grade);
            }
        }

        // Display all recorded grades
        gradeBook.showGrades();

        // Calculate and display the average grade for each student
        for (int studentIndex = 0; studentIndex < NUM_STUDENTS; studentIndex++) {
            System.out.println("Average grade for Student " + (studentIndex + 1) + ": " +
                    gradeBook.studentAvg(studentIndex));
        }

        // Calculate and display the average grade for each test
        for (int testIndex = 0; testIndex < NUM_TESTS; testIndex++) {
            System.out.println("Average grade for Test " + (testIndex + 1) + ": " +
                    gradeBook.testAvg(testIndex));
        }

     
    }
}