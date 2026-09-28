public class MatrixRowSum {
    public static void main(String[] args) {
        // Define a 2D array (Matrix) with 3 rows and 3 columns
        int[][] matrix = {
            {5, 10, 15},
            {2, 4, 6},
            {1, 3, 5}
        };

        System.out.println("--- Matrix Row Sums ---");
        
        // Loop through each row of the matrix
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            
            // Loop through each column element in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            
            // Print the sum for the current row
            System.out.println("Sum of Row " + (i + 1) + " : " + rowSum);
        }
    }
}
