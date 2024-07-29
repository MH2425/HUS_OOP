package hus.oop.lab01.exercises_on_input_decision_loop;

import java.util.Scanner;
public class SphereComputation {
    public static double inputRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input radius: ");
        double radius = sc.nextDouble();
        sc.close();
        return radius;
    }

    public static double computeSurfaceArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    public static double computeVolume(double radius) {
        return (4.0 * Math.PI * radius * radius * radius) / 3;
    }

    public static void print(double surfaceArea, double volume) {
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
    public static void main(String[] args) {
        double radius = inputRadius();
        double surfaceArea = computeSurfaceArea(radius);
        double volume = computeVolume(radius);
        print(surfaceArea, volume);
    }
}
