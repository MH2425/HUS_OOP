package hus.oop.lab04.exercises_on_composition.myrectangle_and_mypoint_classes;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(2, 3, 5, 6);
        System.out.println(rectangle1);

        MyPoint topLeft = new MyPoint(7, 3);
        MyPoint bottomRight = new MyPoint(9, 10);
        MyRectangle rectangle2 = new MyRectangle(topLeft, bottomRight);
        System.out.println(rectangle2);

        System.out.println("The area of the first rectangle is: " + rectangle1.getArea());
        System.out.println("The perimeter of the fisrt rectangle is: " + rectangle1.getPerimeter());

        System.out.println("The area of the second rectangle is: " + rectangle2.getArea());
        System.out.println("The perimeter of the second rectangle is: " + rectangle2.getPerimeter());
    }
}
