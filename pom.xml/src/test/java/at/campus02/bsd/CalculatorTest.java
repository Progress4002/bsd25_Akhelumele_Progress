package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    //ADD

    @Test
    void testAdd_PositiveNumbers() {
        assertEquals(8.0, calc.add(5, 3));
    }

    @Test
    void testAdd_WithNegative() {
        assertEquals(2.0, calc.add(5, -3));
    }

    @Test
    void testAdd_WithZero() {
        assertEquals(5.0, calc.add(5, 0));
    }

    //SUBTRACT

    @Test
    void testSubtract_PositiveNumbers() {
        assertEquals(2.0, calc.subtract(5, 3));
    }

    @Test
    void testSubtract_WithNegative() {
        assertEquals(8.0, calc.subtract(5, -3));
    }

    @Test
    void testSubtract_WithZero() {
        assertEquals(5.0, calc.subtract(5, 0));
    }

    //MULTIPLY

    @Test
    void testMultiply_PositiveNumbers() {
        assertEquals(15.0, calc.multiply(5, 3));
    }

    @Test
    void testMultiply_WithNegative() {
        assertEquals(-15.0, calc.multiply(5, -3));
    }

    @Test
    void testMultiply_WithZero() {
        assertEquals(0.0, calc.multiply(5, 0));
    }

    //DIVIDE

    @Test
    void testDivide_PositiveNumbers() {
        assertEquals(2.0, calc.divide(6, 3));
    }

    @Test
    void testDivide_WithNegative() {
        assertEquals(-2.0, calc.divide(6, -3));
    }

    @Test
    void testDivide_ByZero_ThrowsException() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}
