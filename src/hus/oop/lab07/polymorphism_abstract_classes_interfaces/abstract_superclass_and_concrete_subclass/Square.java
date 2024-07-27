package hus.oop.lab07.polymorphism_abstract_classes_interfaces.abstract_superclass_and_concrete_subclass;

public class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double size) {
        this.setWidth(size);
        this.setLength(size);
    }

    @Override
    public void setWidth(double size) {
        super.setWidth(size);
    }

    @Override
    public void setLength(double size) {
        super.setLength(size);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
