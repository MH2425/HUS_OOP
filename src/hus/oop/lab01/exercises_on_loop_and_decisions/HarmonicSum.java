package hus.oop.lab01.exercises_on_loop_and_decisions;

import java.util.Scanner;
public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            sumL2R += 1.0 / denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

        for (int denominator = MAX_DENOMINATOR; denominator >= 1; --denominator) {
            sumR2L += 1.0 / denominator;
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);

        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
            System.out.println("Absolute different = " + absDiff);
        } else {
            absDiff = sumR2L - sumL2R;
            System.out.println("Absolute different = " + absDiff);
        }
    }
}
