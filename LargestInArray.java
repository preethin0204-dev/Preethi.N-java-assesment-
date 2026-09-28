public class LargestInArray {
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {12, 45, 7, 89, 23, 56};
        
        // Assume the first element is the largest initially
        int max = numbers[0];
        
        // Loop through the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger element is found
            }
        }

        // Print the results
        System.out.println("--- Find Largest Element in Array ---");
        System.out.print("Array Elements : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nLargest Element: " + max);
    }
}
