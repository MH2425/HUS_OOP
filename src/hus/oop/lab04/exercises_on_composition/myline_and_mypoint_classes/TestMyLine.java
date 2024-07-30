package hus.oop.lab04.exercises_on_composition.myline_and_mypoint_classes;

import hus.oop.lab04.exercises_on_composition.mypoint.MyPoint;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint();
        System.out.println("begin point: " + begin);
        MyPoint end = new MyPoint(5, 5);
        System.out.println("end point: " + end);

        begin.setXY(1, 1);
        System.out.println("begin's x = " + begin.getX());
        System.out.println("begin's y = " + begin.getY());
        end.setXY(7, 7);
        System.out.println("end's x = " + end.getX());
        System.out.println("end's y = " + end.getY());
        System.out.println("the distance between two points above is: " + begin.distance(end));

        MyLine myLine = new MyLine(begin, end);
        System.out.println("line is: " + myLine);
        System.out.println("the length of the line is: " + myLine.getLength());
        System.out.println("the gradient of the line is: " + myLine.getGradient());
    }
}
