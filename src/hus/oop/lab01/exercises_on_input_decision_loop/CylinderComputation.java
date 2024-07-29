package hus.oop.lab01.exercises_on_input_decision_loop;

import java.util.Scanner;
public class CylinderComputation {
    public static double inputRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input radius: ");
        return sc.nextDouble();
    }

    public static double inputHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height: ");
        double height = sc.nextDouble();
        sc.close();
        return height;
    }

    public static double computeBaseArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double computeSurfaceArea(double radius, double height) {
        return 2.0 * Math.PI * radius * height + 2.0 * computeBaseArea(radius);
    }

    public static double computeVolume(double radius, double height) {
        return computeBaseArea(radius) * height;
    }

    public static void print(double baseArea, double surfaceArea, double volume) {
        System.out.printf("Base area is: %.2f%n", baseArea);
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
    public static void main(String[] args) {
        double radius = inputRadius();
        double height = inputHeight();
        double baseArea = computeBaseArea(radius);
        double surfaceArea = computeSurfaceArea(radius, height);
        double volume = computeVolume(radius, height);
        print(baseArea, surfaceArea, volume);
    }
}
