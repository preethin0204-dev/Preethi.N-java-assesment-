public class FibonacciRecursion {

    // Recursive method to calculate the n-th Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        // Recursive step: sum of the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int totalTerms = 10; // Change this to generate more or fewer terms

        System.out.println("--- Fibonacci Sequence (Recursion) ---");
        System.out.print("First " + totalTerms + " terms: ");

        // Loop to print the sequence up to totalTerms
        for (int i = 0; i < totalTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
