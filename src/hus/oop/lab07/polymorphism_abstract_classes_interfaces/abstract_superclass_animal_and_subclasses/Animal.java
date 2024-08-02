package hus.oop.lab07.polymorphism_abstract_classes_interfaces.abstract_superclass_animal_and_subclasses;

public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    abstract void greets();
}
