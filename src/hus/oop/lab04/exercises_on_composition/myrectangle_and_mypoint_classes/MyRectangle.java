package hus.oop.lab04.exercises_on_composition.myrectangle_and_mypoint_classes;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getArea() {
        return Math.abs(topLeft.getX() - bottomRight.getX()) * Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public double getPerimeter() {
        return 2 * (Math.abs(topLeft.getX() - bottomRight.getX()) + Math.abs(topLeft.getY() - bottomRight.getY()));
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft.toString() + ",bottomRight=" + bottomRight.toString() + "]";
    }
}
