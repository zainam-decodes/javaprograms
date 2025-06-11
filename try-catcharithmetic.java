public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues after exception handling.");
    }
}
