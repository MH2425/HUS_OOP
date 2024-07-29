package hus.oop.lab01.exercises_on_input_decision_loop;

import java.util.Scanner;

public class InputValidation {

    // Method to take input from the user
    public static int input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0–10 or 90–100: ");
        return scanner.nextInt();
    }

    // Method to check if the input is valid
    public static boolean check(int number) {
        return (number >= 0 && number <= 10) || (number >= 90 && number <= 100);
    }

    public static void main(String[] args) {
        int number;
        boolean isValid;

        do {
            number = input();
            isValid = check(number);
            if (!isValid) {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);

        System.out.println("You have entered: " + number);
    }
}