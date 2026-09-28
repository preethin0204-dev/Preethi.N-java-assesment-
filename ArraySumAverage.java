public class ArraySumAverage {
    public static void main(String[] args) {
        // Define an array of numbers
        double[] numbers = {15.5, 23.0, 8.5, 42.0, 10.0};
        
        double sum = 0;
        
        // Loop through the array to calculate the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        // Calculate the average (avoid division by zero if array is empty)
        double average = 0;
        if (numbers.length > 0) {
            average = sum / numbers.length;
        }

        // Print the results
        System.out.println("--- Array Statistics ---");
        System.out.print("Elements : ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nTotal Elements (n) : " + numbers.length);
        System.out.printf("Sum                 : %.2f\n", sum);
        System.out.printf("Average             : %.2f\n", average);
    }
}
