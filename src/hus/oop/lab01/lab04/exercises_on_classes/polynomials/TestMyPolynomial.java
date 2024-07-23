package hus.oop.lab01.lab04.exercises_on_classes.polynomials;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial myPolynomial = new MyPolynomial(2, 0, 2, -1);
        System.out.print("f(x) = ");
        System.out.println(myPolynomial);

        MyPolynomial rightPolynomial = new MyPolynomial(2, 1, -1, 0);
        System.out.print("g(x) = ");
        System.out.println(rightPolynomial);

        System.out.print("h(x) = f(x) + g(x) = ");
        myPolynomial.add(rightPolynomial);
        System.out.println(myPolynomial);

        System.out.print("m(x) = f(x) * g(x) = ");
//        myPolynomial.multiply(rightPolynomial);
//        System.out.println(myPolynomial);
    }
}
