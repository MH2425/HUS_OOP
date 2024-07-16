package hus.oop.lab01.exercises_on_loop_and_decisions;

import java.util.Scanner;
public class SumAverageRunningInt {
    public static int inputLowerBound() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int inputUpperBound() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int sumRunningInt(int lowerbound, int upperbound) {
        int sum = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            sum += number;
        }
        return sum;
    }

    public static double averageRunningInt(int lowerbound, int upperbound) {
        double numbers = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            numbers++;
        }
        double sum = sumRunningInt(lowerbound, upperbound);
        return sum / numbers;
    }
    public static void main(String[] args) {
        final int LOWERBOUND = inputLowerBound();
        final int UPPERBOUND = inputUpperBound();
        int sum = sumRunningInt(LOWERBOUND, UPPERBOUND);
        double average = averageRunningInt(LOWERBOUND, UPPERBOUND);
        System.out.println("The sum of " + LOWERBOUND + " to "
                            + UPPERBOUND + " is " + sum);
        System.out.print("The average is ");
        System.out.printf("%.1f%n", average);
    }
}
