package hus.oop.lab07.polymorphism_abstract_classes_interfaces.abstract_superclass_animal_and_subclasses;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Meow");
    }
}
