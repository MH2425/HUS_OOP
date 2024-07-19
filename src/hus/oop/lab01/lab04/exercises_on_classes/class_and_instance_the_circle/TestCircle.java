package hus.oop.lab01.lab04.exercises_on_classes.class_and_instance_the_circle;

/**
 * Test drive for the Circle class
 */
public class TestCircle {
    public static void main(String[] args) {
        // Declare an instance of Circle class called circle1
        // Construct the instance circle1 by invoking the default constructor
        // which set its radius and color to the default value
        Circle circle1 = new Circle();
        System.out.println("The first circle: " + circle1);
        System.out.println("The circle has radius of " + circle1.getRadius() +
                " and area of " + circle1.getArea());

        Circle circle2 = new Circle(2);
        System.out.println("The second circle: " + circle2);
        System.out.println("The circle has radius of " + circle2.getRadius() +
                ", its area is " + circle2.getArea() + " and its circumference is " + circle2.getCircumference());

        Circle circle3 = new Circle();
        circle3.setRadius(3.0);
        circle3.setColor("green");
        System.out.println(circle3);

        Circle circle4 = new Circle(4.0, "yellow");
        System.out.println("The 4th circle:");
        System.out.println(circle4);
        System.out.printf("The 4th circle's area is: %.2f%n", circle4.getArea());
        System.out.printf("The 4th circle's circumference is: %.2f%n", circle4.getCircumference());
    }
}
