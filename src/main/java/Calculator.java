public class Calculator {
    public float add(float a, float b) {
        return (float) (a + b);
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero ERROR");
        }
        return a / b;
    }
}
