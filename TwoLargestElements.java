public class TwoLargestElements {
    public static void main(String[] args) {
        // Define an array of numbers (including a duplicate to test handling)
        int[] numbers = {12, 45, 7, 89, 23, 56, 89};
        
        // Initialize the two largest variables with the minimum possible integer value
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        // Loop through the array to find the top two largest elements
        for (int num : numbers) {
            if (num > firstMax) {
                // If current number is greater than firstMax, shift firstMax to secondMax, then update firstMax
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                // If current number is between firstMax and secondMax, update secondMax
                secondMax = num;
            }
        }

        // Print the results
        System.out.println("--- Find Two Largest Elements ---");
        System.out.print("Array Elements : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nFirst Largest  : " + firstMax);
        System.out.println("Second Largest : " + secondMax);
    }
}
