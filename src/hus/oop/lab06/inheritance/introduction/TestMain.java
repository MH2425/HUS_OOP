package hus.oop.lab06.inheritance.introduction;

public class TestMain {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder: "
                + "radius = " + cylinder1.getRadius() +
                " height = " + cylinder1.getHeight() +
                " base area = " + cylinder1.getArea() +
                " volume = " + cylinder1.getVolume());
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder: "
                + "radius = " + cylinder2.getRadius() +
                " height = " + cylinder2.getHeight() +
                " surface area = " + cylinder2.getArea() +
                " volume = " + cylinder2.getVolume());
        System.out.println(cylinder2);

        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder: "
                + "radius = " + cylinder3.getRadius() +
                " height = " + cylinder3.getHeight() +
                " surface area = " + cylinder3.getArea() +
                " volume = " + cylinder3.getVolume());
        System.out.println(cylinder3);
    }
}
