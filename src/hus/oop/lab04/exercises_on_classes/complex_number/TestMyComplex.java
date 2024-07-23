package hus.oop.lab04.exercises_on_classes.complex_number;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex complex = new MyComplex();
        MyComplex another = new MyComplex(0.0, 2.0);

        System.out.println("First complex number: " + complex);
        System.out.println("Another complex number: " + another);

        System.out.println("Does the first number is real? " + complex.isReal());
        System.out.println("Does the second number is imaginary? " + another.isImaginary());

        complex.setReal(9.0);
        complex.setImag(8.0);
        System.out.println(complex);

        another.setValue(8.5, 5.8);
        System.out.println(another);

        System.out.println("Does the first one equals to the second? " + complex.equals(another));
        System.out.println("The magnitude of the first complex number is: " + complex.magnitude());
        // complex = 17.55 + 13.879999999999999i
        System.out.println("Add 2nd number into the 1st number: " + complex.add(another));
        System.out.println("Create a new number that equals the sum of 1st complex number " +
                "and 2nd complex number: " + complex.addNew(another));
        // New complex number = 17.55 + 13.879999999999999i + 8.55 + 5.88i = 26.1 + 22.43i
        // complex variable remains the same
        System.out.println(complex);
        System.out.println("Multiply test: " + complex.multiply(another)); // complex = 68.43810000000002 + 521.0900280000001i
        System.out.println("Divide test: " + complex.divide(another)); // complex = -23.02131292449913 + 40.11960243472784i
        System.out.println("Conjugate of complex: " + complex.conjugate());
    }
}
