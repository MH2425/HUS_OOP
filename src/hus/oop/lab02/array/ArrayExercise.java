package hus.oop.lab02.array;

import java.util.Scanner;
public class ArrayExercise {
    public static int[] createArray(Scanner in) {
        System.out.print("Enter the number of items:");
        final int NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
        }
        return items;
    }

    public static void printArray(int[] arr) {
        System.out.print("The values are: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i]);
            } else {
                System.out.print(", " + arr[i]);
            }
        }
        System.out.println("]");
    }

    public static int[] generateStudentGrade(Scanner in) {
        System.out.print("Enter the number of students: ");
        int numStudent = in.nextInt();
        int[] students = new int[numStudent];
        for (int student = 0; student < students.length; student++) {
            System.out.print("Enter the grade for student " + (student+1) + ": ");
            students[student] = in.nextInt();
        }
        return students;
    }

    public static void simpleGradesStatistics(int[] arr) {
        int size = arr.length;
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        double average = sum / size;
        System.out.print("The average is: ");
        System.out.printf("%.2f%n", average);
        System.out.println("The minimum is: " + sortLowestGrade(arr));
        System.out.println("The maximum is: " + sortHighestGrade(arr));
    }

    public static int sortLowestGrade(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0];
    }

    public static int sortHighestGrade(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0];
    }

    public static String hexadecimalToBinary(String hexStr) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
        "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011",
        "1100", "1101", "1110", "1111"};
        StringBuilder sb = new StringBuilder();
        for (int charIdx = 0; charIdx < hexStr.length(); charIdx++) {
            switch (hexStr.charAt(charIdx)) {
                case '0':
                    sb.append(HEX_BITS[0]);
                    break;
                case '1':
                    sb.append(HEX_BITS[1]);
                    break;
                case '2':
                    sb.append(HEX_BITS[2]);
                    break;
                case '3':
                    sb.append(HEX_BITS[3]);
                    break;
                case '4':
                    sb.append(HEX_BITS[4]);
                    break;
                case '5':
                    sb.append(HEX_BITS[5]);
                    break;
                case '6':
                    sb.append(HEX_BITS[6]);
                    break;
                case '7':
                    sb.append(HEX_BITS[7]);
                    break;
                case '8':
                    sb.append(HEX_BITS[8]);
                    break;
                case '9':
                    sb.append(HEX_BITS[9]);
                    break;
                case 'a':
                    sb.append(HEX_BITS[10]);
                    break;
                case 'b':
                    sb.append(HEX_BITS[11]);
                    break;
                case 'c':
                    sb.append(HEX_BITS[12]);
                    break;
                case 'd':
                    sb.append(HEX_BITS[13]);
                    break;
                case 'e':
                    sb.append(HEX_BITS[14]);
                    break;
                case 'f':
                    sb.append(HEX_BITS[15]);
                    break;
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void testHexadecimalToBinary() {
        System.out.print("Enter a hexadecimal string: ");
        String hexStr = in.nextLine().toLowerCase();
        System.out.println("The equivalent binary for hexadecimal "
                + "\"" + hexStr + "\" is: " + hexadecimalToBinary(hexStr));
    }

    public static String decimalToHexadecimal(int positiveInteger) {
        final char HEX_CHARS[] = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9',
        'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        StringBuilder reversedStr = new StringBuilder();
        while (positiveInteger > 0) {
            rem = positiveInteger % 16;
            reversedStr.append(HEX_CHARS[rem]);
            positiveInteger /= 16;
        }

        StringBuilder hexStr = new StringBuilder();
        for (int charIdx = reversedStr.length() - 1; charIdx >= 0; charIdx--) {
            hexStr.append(reversedStr.charAt(charIdx));
        }
        return hexStr.toString();
    }

    public static void testDecimalToHexadecimal() {
        System.out.print("Enter a decimal number: ");
        int decimalNum = in.nextInt();
        System.out.println("The equivalent hexadecimal number is: " + decimalToHexadecimal(decimalNum));
    }
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        printArray(createArray(in));
        simpleGradesStatistics(generateStudentGrade(in));
        testHexadecimalToBinary();
        testDecimalToHexadecimal();
    }
}
