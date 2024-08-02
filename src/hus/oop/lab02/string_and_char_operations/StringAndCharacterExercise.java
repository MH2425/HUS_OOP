package hus.oop.lab02.string_and_char_operations;

import java.util.Scanner;
public class StringAndCharacterExercise {
    public static String reverseString(String inStr) {
        int inStrLen = inStr.length();
        StringBuilder reverseStr = new StringBuilder();
        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
            reverseStr.append(inStr.charAt(charIdx));
        }
        return reverseStr.toString();
    }

    public static void testReverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next();
        String reverseString = reverseString(inStr);
        System.out.println("The reverse of the String" + "\""
                + inStr + "\" is " + "\"" + reverseString + "\".");
    }

    public static int countVowels(String inStr) {
        int count = 0;
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            if ((inStr.charAt(charIdx) == 'a') || (inStr.charAt(charIdx) == 'e')
            || (inStr.charAt(charIdx) == 'o') || (inStr.charAt(charIdx) == 'i')
            || (inStr.charAt(charIdx) == 'u')) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String inStr) {
        int count = 0;
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            if ((inStr.charAt(charIdx) >= '0') && (inStr.charAt(charIdx) <= '9')) {
                count++;
            }
        }
        return count;
    }

    public static void testCountVowelsDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next().toLowerCase();
        int stringLength = inStr.length();
        System.out.print("Number of vowels: " + countVowels(inStr) + " ");
        System.out.printf("(%.2f%%)", (countVowels(inStr) * 100.0/ stringLength));
        System.out.println();
        System.out.print("Number of digits: " + countDigits(inStr) + " ");
        System.out.printf("(%.2f%%)", (countDigits(inStr) * 100.0/ stringLength));
    }

    public static String phoneKeyPad(String inStr) {
        StringBuilder result = new StringBuilder();
        for (char ch : inStr.toCharArray()) {
            if (ch >= 'a' && ch <= 'c') {
                result.append('2');
            } else if (ch >= 'd' && ch <= 'f') {
                result.append('3');
            } else if (ch >= 'g' && ch <= 'i') {
                result.append('4');
            } else if (ch >= 'j' && ch <= 'l') {
                result.append('5');
            } else if (ch >= 'm' && ch <= 'o') {
                result.append('6');
            } else if (ch >= 'p' && ch <= 's') {
                result.append('7');
            } else if (ch >= 't' && ch <= 'v') {
                result.append('8');
            } else if (ch >= 'w' && ch <= 'z') {
                result.append('9');
            }
        }
        return result.toString();
    }

    public static void testPhoneKeyPad() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next().toLowerCase();
        System.out.println("Keypad digits: " + phoneKeyPad(input));
        in.close();
    }
    public static void main(String[] args) {
//        testReverseString();
//        testCountVowelsDigits();
//        testPhoneKeyPad();
    }
}
