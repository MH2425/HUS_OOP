package hus.oop.lab06.inheritance.shape_circle_rectangle_square;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        width = 1.0;
        length= 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
                ", width = " + width +
                ", length = " + length +
                ']';
    }
}
