import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator= new Calculator();

    @RepeatedTest(5)
    public void testAdd() {
        float result = calculator.add(3, 3.5f);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 3);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
    }
}
