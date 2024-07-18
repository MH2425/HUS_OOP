package hus.oop.lab01.exercises_on_loop_and_decisions;

import java.util.Scanner;
public class ComputePI {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = scanner.nextInt();
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;
            } else {
                System.out.println("Impossible");
            }
        }
        System.out.println("The value of PI is: " + 4 * sum);
    }
}
