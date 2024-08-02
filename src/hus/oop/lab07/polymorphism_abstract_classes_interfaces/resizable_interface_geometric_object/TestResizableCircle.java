package hus.oop.lab07.polymorphism_abstract_classes_interfaces.resizable_interface_geometric_object;

public class TestResizableCircle {
    public static void main(String[] args) {
        Resizable resizableCircle = new ResizableCircle(1.7);
        System.out.println(resizableCircle);
        resizableCircle.resize(150);
        System.out.println(resizableCircle);
    }
}
