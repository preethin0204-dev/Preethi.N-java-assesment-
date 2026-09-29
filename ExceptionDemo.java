public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("--- Program Started ---\n");

        try {
            // Uncomment one of the sections below to test different exceptions

            // Scenario A: Array Index Out of Bounds Exception
            // int[] numbers = {10, 20, 30};
            // int value = numbers[5]; 

            // Scenario B: Arithmetic Exception (Division by zero)
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Cannot divide by zero! (" + e.getMessage() + ")");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Index is outside the valid range of the array! (" + e.getMessage() + ")");
        } finally {
            System.out.println("\n--- Finally Block Executed: Clean-up operations complete ---");
        }

        System.out.println("\n--- Program Continued Normally ---");
    }
}
