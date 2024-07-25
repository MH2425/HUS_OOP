package hus.oop.lab06.inheritance.point;

public class TestPoints {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println("Point 2D: ");
        System.out.println(point2D);

        Point2D point3D = new Point3D(); // Down casting
        System.out.println("Point 3D: ");
        System.out.println(point3D);

        // Test getter, setter
        point2D.setX(0.111f);
        point2D.setY(0.3f);
        System.out.println(point2D);
        System.out.println("x = " + point2D.getX());
        System.out.println("y = " + point2D.getY());

        Point3D point3D1 = (Point3D) point3D; // Down casting
        point3D1.setX(0.33f);
        point3D1.setY(0.3333f);
        point3D1.setZ(0.3f);
        System.out.println(point3D);
        System.out.println("x = " + point3D1.getX());
        System.out.println("y = " + point3D1.getY());
        System.out.println("z = " + point3D1.getZ());

//        if (point3D instanceof Point3D point3D1) {
//            point3D1.setX(0.33f);
//            point3D1.setY(0.3333f);
//            point3D1.setZ(0.3f);
//            System.out.println(point3D);
//            System.out.println("x = " + point3D1.getX());
//            System.out.println("y = " + point3D1.getY());
//            System.out.println("z = " + point3D1.getZ());
//        }
    }
}
