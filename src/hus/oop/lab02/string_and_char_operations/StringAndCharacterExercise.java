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

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String cipherCaesarCode(String inStr) {
        // shift n = 3
        String strToLower = inStr.toLowerCase();
        StringBuilder sb= new StringBuilder();
        for (int charIdx = 0; charIdx < strToLower.length(); charIdx++) {
            int pos = ALPHABET.indexOf(strToLower.charAt(charIdx));
            int encryptPos = (pos + 3) % 26;
            char encryptChar = ALPHABET.charAt(encryptPos);
            sb.append(encryptChar);
        }
        return sb.toString().toUpperCase();
    }

    public static void testCipherCaesarCode() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = in.nextLine();
        System.out.println("The ciphertext string is: " + cipherCaesarCode(inStr));
        in.close();
    }

    public static String decipherCaesarCode(String inStr) {
        // shift n = 3
        String strToLower = inStr.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int charIdx = 0; charIdx < strToLower.length(); charIdx++) {
            int encryptPos = ALPHABET.indexOf(strToLower.charAt(charIdx));
            int pos = (encryptPos - 3) % 26;
            char posChar = ALPHABET.charAt(pos);
            sb.append(posChar);
        }
        return sb.toString().toUpperCase();
    }

    public static void testDecipherCaesarCode() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = in.nextLine();
        System.out.println("The plaintext string is: " + decipherCaesarCode(inStr));
        in.close();
    }

    public static boolean isHexString(String hexStr) {
        for (int charIdx = 0; charIdx < hexStr.length(); charIdx++) {
            if (!((hexStr.charAt(charIdx) >= '0' && hexStr.charAt(charIdx) <= '9')
                    || (hexStr.charAt(charIdx) >= 'A' && hexStr.charAt(charIdx) <= 'F')
                    || (hexStr.charAt(charIdx) >= 'a' && hexStr.charAt(charIdx) <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static void testHexString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hexStr = in.nextLine();
        if (isHexString(hexStr)) {
            System.out.println("\"" + hexStr + "\"" + " is a hex string");
        } else {
            System.out.println("\"" + hexStr + "\"" + " is NOT a hex string");
        }
        in.close();
    }

    public static int binaryToDecimal(String binStr) {
        int decimalValue = 0;
        for (int charIdx = 0; charIdx < binStr.length(); charIdx++) {
            if (binStr.charAt(charIdx) == '1') {
                decimalValue += (int) Math.pow(2, binStr.length() - charIdx - 1);
            } else if (binStr.charAt(charIdx) == '0') {
                decimalValue += 0;
            } else {
                decimalValue += Integer.MIN_VALUE;
            }
        }
        return decimalValue;
    }

    public static void testBinaryToDecimal() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String binStr = in.nextLine();
        if (binaryToDecimal(binStr) >= 0) {
            System.out.println("The equivalent decimal number for binary "
                    + "\"" + binStr +"\"" + " is: " + binaryToDecimal(binStr));
        } else {
            System.out.println("error: invalid binary string "
            + "\"" + binStr + "\"");
        }
        in.close();
    }

    public static final String DIGITS = "0123456789ABCDEF";
    public static int hexadecimalToDecimal(String hexStr) {
        int decimalValue = 0;
        String hexToUpper = hexStr.toUpperCase();
        for (int charIdx = 0; charIdx < hexStr.length(); charIdx++) {
            char hexChar = hexToUpper.charAt(charIdx);
            int digit = DIGITS.indexOf(hexChar);
            decimalValue = 16 * decimalValue + digit;
        }
        return decimalValue;
    }

    public static void testHexadecimalToDecimal() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = in.nextLine();
        if (isHexString(hexStr)) {
            System.out.println("The equivalent decimal number for hexadecimal "
                    + "\"" + hexStr +"\"" + " is: " + hexadecimalToDecimal(hexStr));
        } else {
            System.out.println("error: invalid hexadecimal string "
                    + "\"" + hexStr + "\"");
        }
        in.close();
    }

    public static int octalToDecimal(String octalStr) {
        int decimalValue = 0;
        for (int charIdx = 0; charIdx < octalStr.length(); charIdx++) {
            switch (octalStr.charAt(charIdx)) {
                case '1':
                    decimalValue += (int) Math.pow(8, octalStr.length() - charIdx - 1);
                    break;
                case '2':
                    decimalValue += (int) ((int) 2.0 * Math.pow(8, octalStr.length() - charIdx - 1));
                    break;
                case '3':
                    decimalValue += (int) ((int) 3.0 * Math.pow(8, octalStr.length() - charIdx - 1));
                    break;
                case '4':
                    decimalValue += (int) ((int) 4.0 * Math.pow(8, octalStr.length() - charIdx - 1));
                    break;
                case '5':
                    decimalValue += (int) ((int) 5.0 * Math.pow(8, octalStr.length() - charIdx - 1));
                    break;
                case '6':
                    decimalValue += (int) ((int) 6.0 * Math.pow(8, octalStr.length() - charIdx - 1));
                    break;
                case '7':
                    decimalValue += (int) ((int) 7.0 * Math.pow(8, octalStr.length() - charIdx - 1));
                    break;
            }
        }
        return decimalValue;
    }

    public static void testOctalToDecimal() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String octalStr = in.nextLine();
        System.out.println("The equivalent decimal number "
        + "\"" + octalStr + "\" is: " + octalToDecimal(octalStr));
        in.close();
    }

    public static int radixNToDecimal(String radixNStr, int radix) {
        int length = radixNStr.length();
        int decimalValue = 0;
        int base = 1;
        for (int i = length - 1; i >= 0; i--) {
            int digitValue = getDigitValue(radixNStr, i);
            decimalValue += digitValue * base;
            base *= radix;
        }
        return decimalValue;
    }

    private static int getDigitValue(String radixNStr, int i) {
        char currentChar = radixNStr.charAt(i);
        int digitValue;
        if (currentChar >= '0' && currentChar <= '9') {
            digitValue = currentChar - '0';
        } else if (currentChar >= 'a' && currentChar <= 'f') {
            digitValue = currentChar - 'a' + 10;
        } else if (currentChar >= 'A' && currentChar <= 'F') {
            digitValue = currentChar - 'A' + 10;

        } else {
            throw new IllegalArgumentException("Invalid character in the input string: " + currentChar);
        }
        return digitValue;
    }

    public static void testRadixNToDecimal() {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = scanner.nextInt();
        System.out.print("Enter the string: ");
        String radixNStr = scanner.next();
        int decimalValue = radixNToDecimal(radixNStr, radix);
        System.out.println("The equivalent decimal number \"" + radixNStr + "\" is: " + decimalValue);
        scanner.close();
    }
    public static void main(String[] args) {
        testReverseString();
        testCountVowelsDigits();
        testPhoneKeyPad();
        testCipherCaesarCode();
        testDecipherCaesarCode();
        testHexString();
        testBinaryToDecimal();
        testHexadecimalToDecimal();
        testOctalToDecimal();
        testRadixNToDecimal();
        testRadixNToDecimal();
    }
}
