package hus.oop.lab01.exercises_on_input_decision_loop;

import java.util.Scanner;

public class AverageWithInputValidation {

    // Declare constant for the number of students
    final static int NUM_STUDENTS = 3;

    // Method to take input from the user
    public static int input(int studentNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark (0–100) for student " + studentNumber + ": ");
        return scanner.nextInt();
    }

    // Method to check if the input is valid
    public static boolean check(int number) {
        return number >= 0 && number <= 100;
    }

    // Method to calculate the average of the marks
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / NUM_STUDENTS;
    }

    public static void main(String[] args) {
        int[] marks = new int[NUM_STUDENTS];
        int number;
        boolean isValid;

        for (int i = 0; i < NUM_STUDENTS; i++) {
            do {
                number = input(i + 1);
                isValid = check(number);
                if (!isValid) {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            marks[i] = number;
        }

        double average = calculateAverage(marks);
        System.out.printf("The average is: %.2f%n", average);
    }
}