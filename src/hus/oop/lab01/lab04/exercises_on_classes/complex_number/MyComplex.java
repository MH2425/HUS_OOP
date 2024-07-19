package hus.oop.lab01.lab04.exercises_on_classes.complex_number;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isReal()) {
            sb.append(this.real);
        } else if (isImaginary()) {
            sb.append(this.imag).append("i");
        } else {
            if (this.imag < 0)
                sb.append(this.real).append(" - ").append((-1) * this.imag).append("i");
            else
                sb.append(this.real).append(" + ").append(this.imag).append("i");
        }
        return sb.toString();
    }

    public boolean isReal() {
        return (this.imag == 0);
    }

    public boolean isImaginary() {
        if (this.real == 0 && this.imag == 0) {
            return false;
        } else {
            return this.real == 0;
        }
    }

    public boolean equals(double real, double imag) {
        return (this.real == real) && (this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real) && (this.imag == imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.real);
    }

    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.real);
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double denominator = (right.real * right.real + right.imag * right.imag);
        this.real = (this.real * right.real - this.imag * right.imag) / denominator;
        this.imag = (this.real * right.imag + this.imag * right.real) / denominator;
        return this;
    }

    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }
}
