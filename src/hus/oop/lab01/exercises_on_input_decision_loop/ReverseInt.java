package hus.oop.lab01.exercises_on_input_decision_loop;

import java.util.Scanner;
public class ReverseInt {
    public static int inputPosInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int positiveInteger = sc.nextInt();
        sc.close();
        return positiveInteger;
    }

    public static int computeReverseInt(int inNumber) {
        int reverseInt = 0;
        while (inNumber > 0) {
            int inDigit = inNumber % 10;
            reverseInt = reverseInt * 10 + inDigit;
            inNumber /= 10;
        }
        return reverseInt;
    }
    public static void main(String[] args) {
        int number = inputPosInt();
        int reverse = computeReverseInt(number);
        System.out.print("The reverse is: " + reverse);
    }
}
