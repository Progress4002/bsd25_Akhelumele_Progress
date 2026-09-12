package at.campus02.bsd;

/**
 * Demonstrates the calculator operations.
 */
public class CalculatorMain {

    /**
     * Runs the calculator demonstration.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition: "
                + calculator.add(10.0, 5.0));

        System.out.println("Subtraction: "
                + calculator.subtract(10.0, 5.0));

        System.out.println("Division: "
                + calculator.divide(10.0, 5.0));

        System.out.println("Multiplication: "
                + calculator.multiply(10.0, 5.0));

        System.out.println("Akhelumele");

        try {
            calculator.divide(10.0, 0.0);
        } catch (ArithmeticException exception) {
            System.out.println("Fehler: " + exception.getMessage());
        }
    }
}
