public class ExceptionInMethod {

    // Method that may throw an exception
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;  // Can throw ArithmeticException if b == 0
    }

    public static void main(String[] args) {
        int result;

        try {
            result = divide(10, 0);  // This will cause an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in method: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
