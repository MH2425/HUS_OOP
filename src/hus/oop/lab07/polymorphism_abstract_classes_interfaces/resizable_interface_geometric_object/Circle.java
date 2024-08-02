package hus.oop.lab07.polymorphism_abstract_classes_interfaces.resizable_interface_geometric_object;

import hus.oop.lab07.polymorphism_abstract_classes_interfaces.geometric_object_interface_circle_rectangle.GeometricObject;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius = " + radius +
                ']';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
