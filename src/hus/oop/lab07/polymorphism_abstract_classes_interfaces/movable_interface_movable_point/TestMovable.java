package hus.oop.lab07.polymorphism_abstract_classes_interfaces.movable_interface_movable_point;

public class TestMovable {
    public static void main(String[] args) {
        Movable point = new MovablePoint(1, 1, 1, 1);
        System.out.println("Movable point is: " + point);
        point.moveUp();
        point.moveDown();
        point.moveLeft();
        point.moveRight();
    }
}
