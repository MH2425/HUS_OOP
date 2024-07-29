package hus.oop.lab01.exercises_on_input_decision_loop;

import java.util.Scanner;
public class CircleComputation {
    public static double inputRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input radius: ");
        double radius = sc.nextDouble();
        sc.close();
        return radius;
    }

    public static double computeDiameter(double radius) {
        return 2 * radius;
    }

    public static double computeArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double computeCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void print(double diameter, double area, double circumference) {
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circumference);
    }
    public static void main(String[] args) {
        double radius = inputRadius();
        double diameter = computeDiameter(radius);
        double area = computeArea(radius);
        double circumference = computeCircumference(radius);
        print(diameter, area, circumference);
    }
}
