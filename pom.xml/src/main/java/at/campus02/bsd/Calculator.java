package at.campus02.bsd;
/**
 * Provides basic arithmetic operations and factorial calculation.
 */
public class Calculator {
    /**
     * Adds two numbers.
     *
     * @param a first number
     * @param b second number
     * @return the sum of both numbers
     */
    public double add(double a, double b) {
        return a + b;
    }
    /**
     * Subtracts the second number from the first number.
     *
     * @param a first number
     * @param b number to subtract
     * @return the difference between both numbers
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    /**
     * Multiplies two numbers.
     *
     * @param a first number
     * @param b second number
     * @return the product of both numbers
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    /**
     * Divides the first number by the second number.
     *
     * @param a dividend
     * @param b divisor
     * @return the quotient of both numbers
     * @throws ArithmeticException if the divisor is zero
     */
    public double divide(double a, double b) {
        if(b==0){
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    /**
     * Calculates the factorial of a number.
     *
     * @param number number for which the factorial is calculated
     * @return the factorial, or 0 if the number is negative
     */
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
