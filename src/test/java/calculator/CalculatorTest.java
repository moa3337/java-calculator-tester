package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        float result = calculator.add(8.3f, 6.4f);
        assertEquals(14.7, result);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        float result = calculator.subtract(9f, 1.5f);
        assertEquals(7.5f, result);
    }

    @Test
    void testDevide() {
        Calculator calculator = new Calculator();
        float result = calculator.devide(25.0f, 5.0f);
        assertEquals(5.0f, result);
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        float result = calculator.multiply(20.0f, 5.0f);
        assertEquals(100f, result);
    }
}