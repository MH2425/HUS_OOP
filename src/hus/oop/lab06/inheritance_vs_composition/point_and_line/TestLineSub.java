package hus.oop.lab06.inheritance_vs_composition.point_and_line;

public class TestLineSub {
    public static void main(String[] args) {
        Point begin = new Point(1, 1);
        Point end = new Point(3, 3);
        LineSub lineSub = new LineSub(begin, end);
        System.out.println(lineSub);

        System.out.println(lineSub.getBegin());
        System.out.println(lineSub.getBeginX());
        System.out.println(lineSub.getEndX());

        lineSub.setBegin(new Point(5, 6));
        System.out.println(lineSub);

        System.out.println("Length of lineSub is: " + lineSub.getLength());
        System.out.println("Gradient of lineSub is: " + lineSub.getGradient());
    }
}
