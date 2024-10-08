package hus.oop.lab06.inheritance_vs_composition.point_and_line;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(2, 2);
        Point p2 = new Point(3, 4);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println("Length of line 1 is: " + l1.getLength());
        System.out.println("Gradient of line 2 is: " + l2.getGradient());
    }
}
