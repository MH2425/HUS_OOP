package hus.oop.lab04.exercises_on_composition.mytriangle_and_mypoint_classes;

import hus.oop.lab04.exercises_on_composition.mycircle_and_mypoint.MyCircle;

public class MyTriangle {
    private MyPoint v1, v2, v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1 = " + this.v1.toString()
                + ", v2 = " + this.v2.toString()
                + ", v3 = " + this.v3.toString()
                + "]";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double edge1 = v1.distance(v2);
        double edge2 = v2.distance(v3);
        double edge3 = v3.distance(v1);
        if ((edge1 == edge2) && (edge2 == edge3) && (edge3 == edge1)) {
            return "equilateral";
        } else if ((edge1 != edge2) && (edge2 != edge3) && (edge3 != edge1)) {
            return "scalene";
        } else {
            return "isosceles";
        }
    }
}
