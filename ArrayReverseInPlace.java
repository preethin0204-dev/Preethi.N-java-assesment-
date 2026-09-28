public class ArrayReverseInPlace {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        System.out.println("--- Array Reversal In-Place ---");
        System.out.print("Original Array : ");
        printArray(numbers);

        // In-place reversal logic using two pointers
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        System.out.print("Reversed Array : ");
        printArray(numbers);
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
