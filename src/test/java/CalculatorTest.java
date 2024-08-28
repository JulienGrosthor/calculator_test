import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator= new Calculator();

    @Test
    public void testAdd() {
//        Calculator calculator = new Calculator();
        int result = calculator.add(3, 3);
    }

    @Test
    public void testSubtract() {
//        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
    }

    @Test
    public void testMultiply() {
//        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 3);
    }

    @Test
    public void testDivide() {
//        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
    }
}
