package hus.oop.lab05.mypolynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(coeffs[0]);
        if (coeffs[1] > 0) {
            if (coeffs[1] != 1)
                stringBuilder.append(" + ").append(coeffs[1]).append("x");
            else
                stringBuilder.append(" + ").append("x");
        } else if (coeffs[1] < 0) {
            stringBuilder.append(" - ").append((-1) * coeffs[1]).append("x");
        }
        for (int coeffIdx = 2; coeffIdx < coeffs.length; coeffIdx++) {
             if (coeffs[coeffIdx] > 0) {
                if (coeffs[coeffIdx] != 1)
                    stringBuilder.append(" + ").append(coeffs[coeffIdx]).append("x^").append(coeffIdx);
                else
                    stringBuilder.append(" + ").append("x^").append(coeffIdx);
            } else {
                if (coeffs[coeffIdx] != -1)
                    stringBuilder.append(" - ").append((-1) * coeffs[coeffIdx]).append("x^").append(coeffIdx);
                else
                    stringBuilder.append(" - ").append("x^").append(coeffIdx);
            }
        }
        return stringBuilder.toString();
    }

    public double evaluate(double x) { // Horner's method
        double result = coeffs[0];
        for (int coeffIdx = 1; coeffIdx < coeffs.length; coeffIdx++) {
            result = result * x + coeffs[coeffIdx];
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int degree = Math.min(this.getDegree(), right.getDegree());
        for (int coeffIdx = 0; coeffIdx <= degree; coeffIdx++) {
            this.coeffs[coeffIdx] += right.coeffs[coeffIdx];
        }
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int degree = this.getDegree() + right.getDegree() + 1;
        double[] temp = new double[degree];
        for (int i = 0; i < this.getDegree(); i++) {
            temp[i] = 0;
        }
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                temp[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        this.coeffs = temp;
        return this;
    }
}
