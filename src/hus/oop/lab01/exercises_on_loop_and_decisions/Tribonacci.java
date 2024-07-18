package hus.oop.lab01.exercises_on_loop_and_decisions;

import java.util.Scanner;
public class Tribonacci {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the first N numbers of Tribonacci series: ");
        int nMax = scanner.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f3 = 2;
        int fn;
        System.out.println("The first " + nMax + " numbers of Tribonacci series are: ");
        System.out.print(f1 + " " + f2 + " " + f3 + " ");
        for (int n = 4; n <= 20; n++) {
            fn = f1 + f2 + f3;
            f1 = f2;
            f2 = f3;
            f3 = fn;
            System.out.print(fn + " ");
        }
    }
}
