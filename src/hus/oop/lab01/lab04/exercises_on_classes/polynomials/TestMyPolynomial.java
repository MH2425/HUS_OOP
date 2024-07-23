package hus.oop.lab01.lab04.exercises_on_classes.polynomials;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial myPolynomial = new MyPolynomial(5, 0, 10, -6);
        System.out.print("f(x) = ");
        System.out.println(myPolynomial);

        MyPolynomial rightPolynomial = new MyPolynomial(1, 2, 4);
        System.out.print("g(x) = ");
        System.out.println(rightPolynomial);

        System.out.print("h(x) = f(x) + g(x) = ");
        myPolynomial.add(rightPolynomial);
        System.out.println(myPolynomial);

        System.out.print("m(x) = h(x) * g(x) = ");
        myPolynomial.multiply(rightPolynomial);
        System.out.println(myPolynomial);
    }
}
