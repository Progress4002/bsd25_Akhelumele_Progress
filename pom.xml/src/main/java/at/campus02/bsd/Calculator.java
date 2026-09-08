package at.campus02.bsd;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if(b==0){
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    public int factorial(int number) {
        if (number < 0) {
            return 0;
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
