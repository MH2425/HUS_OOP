package hus.oop.lab07.polymorphism_abstract_classes_interfaces.resizable_interface_geometric_object;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }

    @Override
    public void resize(int percent) {
        this.radius *= percent / 100.0;
    }
}
