package hus.oop.lab01.getting_started;

import java.util.Scanner;
public class CheckOddEven {
    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check ");
        return scanner.nextInt();
    }

    public static void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        int number = inputNumber();
        checkOddEven(number);
    }
}
