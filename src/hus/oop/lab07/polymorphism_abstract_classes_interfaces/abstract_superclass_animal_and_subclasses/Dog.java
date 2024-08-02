package hus.oop.lab07.polymorphism_abstract_classes_interfaces.abstract_superclass_animal_and_subclasses;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Wooof");
    }
}
