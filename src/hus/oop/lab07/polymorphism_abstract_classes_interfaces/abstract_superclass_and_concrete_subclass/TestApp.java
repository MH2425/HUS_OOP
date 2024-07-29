package hus.oop.lab07.polymorphism_abstract_classes_interfaces.abstract_superclass_and_concrete_subclass;

public class TestApp {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
//        System.out.println(shape1.getRadius()); // Error, shape1 cannot invoke getRadius() method

        // Downcast back to Circle
        Circle circle1 = (Circle) shape1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius()); // After down casting, the circle1 object now can invoke the getRadius() method

//        Shape shape2 = new Shape(); // Shape is abstract class, so can not be initialized

        Shape shape3 = new Rectangle(1, 2, "red", false);
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
//        System.out.println(shape3.getLength()); => Compile error

        Rectangle rectangle1 = (Rectangle) shape3; // Down casting
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());

        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
//        System.out.println(shape4.getSide()); => Error

        Square square1 = (Square) shape4;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());
        System.out.println(square1.getWidth());
    }
}
