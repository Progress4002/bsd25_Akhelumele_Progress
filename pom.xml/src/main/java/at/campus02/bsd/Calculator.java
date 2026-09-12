package at.campus02.bsd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Provides basic arithmetic operations and factorial calculation.
 */
public class Calculator {
    private static final Logger LOGGER = LogManager.getLogger(Calculator.class);	

    /**
     * Adds two numbers.
     *
     * @param a first number
     * @param b second number
     * @return the sum of both numbers
     */
    public double add(double a, double b) {
	LOGGER.debug("add({}, {})", a, b);        
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
 	LOGGER.debug("subtract({}, {})", a, b);        
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
	LOGGER.debug("multiply({}, {})", a, b);
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
 	LOGGER.debug("divide({}, {})", a, b);        
	if(b==0){
 	LOGGER.error("Division by zero attempted");
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
    LOGGER.debug("factorial({})", number);

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
