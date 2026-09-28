public class SimpleCalculator {
    public static void main(String[] args) {
        // Define input numbers and the operator (+, -, *, /)
        double num1 = 20.5;
        double num2 = 5.0;
        char operator = '+'; // Change this to '-', '*', or '/' to test other operations
        double result = 0;
        boolean validOperation = true;

        System.out.println("--- Simple Calculator ---");
        System.out.println("Expression: " + num1 + " " + operator + " " + num2);

        // Perform calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero error
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
                break;
        }

        // Print the result if the operation was successful
        if (validOperation) {
            System.out.printf("Result    : %.2f\n", result);
        }
    }
}
