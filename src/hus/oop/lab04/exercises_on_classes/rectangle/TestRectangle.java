package hus.oop.lab04.exercises_on_classes.rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1.2f, 2.3f);
        System.out.println("The 1st rectangle: ");
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle();
        System.out.println("The 2nd rectangle: ");
        System.out.println(rectangle2);
        System.out.println("--------------------------------------------\n");
        System.out.println("Setting new attributes for the two rectangle:");
        rectangle1.setLength(3.3f);
        rectangle1.setWidth(4.4f);
        System.out.println("New 1st rectangle: ");
        System.out.println(rectangle1);
        System.out.println("The area of 1st rectangle is: " + rectangle1.getArea() +
                " and its perimeter is: " + rectangle1.getPerimeter());
    }
}
