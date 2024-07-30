package hus.oop.lab04.exercises_on_composition.mytriangle_and_mypoint_classes;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(2, 2);
        MyPoint point3 = new MyPoint(-2, 2);
        MyTriangle triangle = new MyTriangle(point1, point2, point3);
        System.out.println(triangle);

        System.out.println("Triangle's perimeter is: " + triangle.getPerimeter());
        System.out.println("Triangle's type is: " + triangle.getType());
    }
}
