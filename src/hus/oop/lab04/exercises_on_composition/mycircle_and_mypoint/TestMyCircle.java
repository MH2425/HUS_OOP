package hus.oop.lab04.exercises_on_composition.mycircle_and_mypoint;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle = new MyCircle();
        System.out.println("First circle: " + circle);

        circle.setCenterXY(1, 5);
        circle.setRadius(5);
        System.out.println(circle);

        System.out.println("Area is: " + circle.getArea());
        System.out.println("Circumference is: " + circle.getCircumference());

        MyCircle anotherCircle = new MyCircle();
        System.out.println("Another circle: " + anotherCircle);
        System.out.println("Distance between them is: " + circle.distance(anotherCircle));
    }
}
