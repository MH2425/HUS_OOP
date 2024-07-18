package hus.oop.lab01.exercises_on_loop_and_decisions;

import java.util.Scanner;
public class ExtractDigits {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse: ");
        int n = scanner.nextInt();
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n /= 10;
        }
    }
}
