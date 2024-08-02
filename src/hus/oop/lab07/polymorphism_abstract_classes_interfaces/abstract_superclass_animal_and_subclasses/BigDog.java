package hus.oop.lab07.polymorphism_abstract_classes_interfaces.abstract_superclass_animal_and_subclasses;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woow");
    }

    public void greets(Dog another) {
        System.out.println("Wooooooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooooooooooooooooow");
    }
}
