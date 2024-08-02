package hus.oop.lab07.polymorphism_abstract_classes_interfaces.geometric_object_interface_circle_rectangle;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject rectangle = new Rectangle(1.5, 2.5);
        System.out.println(rectangle);
        System.out.println("Area is: " + rectangle.getArea());
        System.out.println("Perimeter is: " + rectangle.getPerimeter());

        GeometricObject circle = new Circle(4.5);
        System.out.println(circle);
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());
    }
}
