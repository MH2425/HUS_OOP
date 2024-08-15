package hus.oop.lab02.method;

import java.util.Arrays;
import java.util.Scanner;
public class MethodExercise {

    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 1; i <= exp; i++) {
            product *= base;
        }
        return product;
    }

    public static void testExponent(Scanner in) {
        int exp;
        int base;
        System.out.print("Enter the base: ");
        base = in.nextInt();
        System.out.print("Enter the exponent: ");
        exp = in.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }

    public static boolean hasEight(int number) {
        if (number > 0) {
            while (number > 0) {
                if (number % 10 == 8) {
                    return true;
                }
                number /= 10;
            }
            return false;
        } else if (number < 0) {
            number *= -1;
            while (number > 0) {
                if (number % 10 == 8) {
                    return true;
                }
                number /= 10;
            }
            return false;
        } else {
            return false;
        }
    }

    public static void testMagicSum(Scanner in) {
        int magicSum = 0;
        final int SENTINEL = -1;
        int number;

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTINEL) {
            if (hasEight(number)) {
                magicSum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        System.out.println("The magic sum is: " + magicSum);
    }

    public static void print(int[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            str.append(arr[i]).append(",").append(" ");
        }
        str.append(arr[arr.length - 1]).append("]");
        System.out.println(str);
    }

    public static void print(double[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            str.append(arr[i]).append(",").append(" ");
        }
        str.append(arr[arr.length - 1]).append("]");
        System.out.println(str);
    }

    public static void print(float[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            str.append(arr[i]).append(",").append(" ");
        }
        str.append(arr[arr.length - 1]).append("]");
        System.out.println(str);
    }

    public static String arrayToString(int[] arr) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            str.append(arr[i]).append(",").append(" ");
        }
        str.append(arr[arr.length - 1]).append("]");
        return str.toString();
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void testContains() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(contains(arr, 3));
        System.out.println(contains(arr, 6));
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void testSearch() {
        int[] array = {1, 2, 3, 4};
        int target = 1;
        int result = search(array, target);
        if(target == result)
            System.out.println("Pass");
        else
            System.out.println("Not Pass");
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void testEquals() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 6};
        System.out.println(equals(arr1, arr2));
        System.out.println(equals(arr1, arr3));
    }

    public static int[] copyOf(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public static void testCopyOf() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = copyOf(arr);
        arr1[0] = 0;
        System.out.println(arr[0]);
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] result = new int[newLength];
        for (int i = 0; i < newLength && i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static void anotherTestCopyOf() {
        int[] arr = {1, 2, 3, 4, 5};
        int newLength = 10;
        System.out.println(Arrays.toString(copyOf(arr, newLength)));
    }

    public static boolean swap(int[] array1,int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    public static void testSwap() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        swap(arr1, arr2);
        print(arr1);
        print(arr2);
    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    static void testReverse() {
        int[] arr = {1, 2, 3, 4, 5};
        print(reverse(arr));
    }

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        testExponent(in);
        testMagicSum(in);
        print(new int[] {3, 4, 5, 6, 7});
        print(new double[] {3, 4, 5, 6, 8});
        print(new float[] {3f, 4f, 5f, 6f, 7f, 9f});
        testContains();
        testEquals();
        testSearch();
        testCopyOf();
        anotherTestCopyOf();
        testSwap();
        testReverse();
    }
}
