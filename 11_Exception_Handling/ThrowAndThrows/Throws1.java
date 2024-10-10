package ThrowAndThrows;

public class Throws1 {

    public static void divide(int num, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        int result = num / divisor;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            divide(10, 2);  // Valid division
            divide(10, 0);  // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
