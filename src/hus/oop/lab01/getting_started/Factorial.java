package hus.oop.lab01.getting_started;

import java.util.Scanner;
public class Factorial {
    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number to calculate its factorial: ");
        return sc.nextInt();
    }

    public static double calculateFactorial(int number) {
        double factorial = 1.0;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = inputNumber();
        double factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
