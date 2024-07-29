package hus.oop.lab07.polymorphism_abstract_classes_interfaces.abstract_superclass_and_concrete_subclass;

public class Circle extends Shape {
    protected double radius;
    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString()
                + ", radius = " + this.radius
                + "]";
    }
}
