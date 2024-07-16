package hus.oop.lab01;

import java.util.Scanner;
public class CheckPassFail {
    public static int inputMark() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a mark to check either it passes or not: 22");
        return scanner.nextInt();
    }

    public static void checkPassFail(int number) {
        if (number >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }

    public static void main(String[] args) {
        int mark = inputMark();
        checkPassFail(mark);
    }
}
