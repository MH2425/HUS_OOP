package hus.oop.lab06.inheritance_vs_composition.circle_cylinder_compostion;

public class Circle {
    private double radius;
    public String color;

    public Circle() {
        radius = 1.0;
        color = "blue";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
}
