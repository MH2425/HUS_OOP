package hus.oop.lab01.getting_started;

import java.util.Scanner;
public class PrintDayInWord {

    public static int inputDayNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void printDayInWord(int day) {
        if (day == 0)
            System.out.println("MONDAY");
        else if (day == 1)
            System.out.println("TUESDAY");
        else if (day == 2)
            System.out.println("WEDNESDAY");
        else if (day == 3)
            System.out.println("THURSDAY");
        else if (day == 4)
            System.out.println("FRIDAY");
        else if (day == 5)
            System.out.println("SATURDAY");
        else
            System.out.println("SUNDAY");
    }
    public static void main(String[] args) {
        int day = inputDayNumber();
        printDayInWord(day);
    }
}
