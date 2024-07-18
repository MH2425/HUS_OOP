package hus.oop.lab01.exercises_on_loop_and_decisions;

import java.util.Scanner;
public class Fibonacci {
    static Scanner scanner = new Scanner(System.in);
    public static void printAndAverage(int nMax) {
        int f1 = 1;
        int f2 = 1;
        int fn = 0;
        int sum = f1 + f2;
        double average = 0.0;
        System.out.print("The first 20 Fibonacci numbers are: " + f1 + " " + f2 + " ");
        for (int n = 3; n <= nMax; n++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            System.out.print(fn + " ");
            sum += fn;
        }
        System.out.println();
        average = (double) sum / nMax;
        System.out.println("The average are: " + average);
    }

    public static int usingRecursion(int nMax) {
        if (nMax <= 1) {
            return nMax;
        } else {
            return usingRecursion(nMax -1) + usingRecursion(nMax - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the first N numbers of Fibonacci series");
        int nMax = scanner.nextInt();
        printAndAverage(nMax);
        System.out.println(nMax + "th Fibonacci Number: " + usingRecursion(nMax));
    }
}
