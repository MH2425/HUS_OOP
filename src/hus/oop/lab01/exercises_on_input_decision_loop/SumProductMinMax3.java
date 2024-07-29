package hus.oop.lab01.exercises_on_input_decision_loop;

import java.util.Scanner;
public class SumProductMinMax3 {
    public static int[] inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int secondNum = sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        int thirdNum = sc.nextInt();
        sc.close();
        return new int[] {firstNum, secondNum, thirdNum};
    }

    public static int sumInteger(int[] arrayNum) {
        int sum = 0;
        for (int num : arrayNum) {
            sum += num;
        }
        return sum;
    }

    public static int productInteger(int[] arrayNum) {
        int product = 1;
        for (int num : arrayNum) {
            product *= num;
        }
        return product;
    }

    public static int min(int[] arrayNum) {
        int min = arrayNum[0];
        for (int num : arrayNum) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int max(int[] arrayNum) {
        int max = arrayNum[0];
        for (int num : arrayNum) {
            if (num < max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = inputData();
        int sum = sumInteger(numbers);
        System.out.println("The sum is: " + sum);
        int product = productInteger(numbers);
        System.out.println("The product is: " + product);
        int min = min(numbers);
        System.out.println("The min is: " + min);
        int max = max(numbers);
        System.out.println("The max is: " + max);
    }
}
