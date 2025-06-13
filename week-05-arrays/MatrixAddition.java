public class MatrixAddition {

    public static void main(String[] args) {
        // Take two matrices
        int[][] one = {
            {1, 3},
            {1, 0},
            {1, 2}
        };
        int[][] two = {
            {0, 0},
            {7, 5},
            {2, 1}
        };

        // Check the two matrices to be added to ensure they are the same shape
        final int ROWS = one.length;
        final int COLUMNS = one[0].length;

        boolean correct = ROWS == two.length;  // Check if row counts match
        if (correct) {
            // Check if all rows in 'one' have the same number of columns
            for (int[] row : one)
                correct = correct && row.length == COLUMNS;
        }
        if (correct) {
            // Check if all rows in 'two' have the same number of columns
            for (int[] row : two)
                correct = correct && row.length == COLUMNS;
        }

        // Add them together to produce a third matrix
        if (correct) {
            int[][] sum = new int[ROWS][COLUMNS];

            // Perform element-wise addition
            for (int r = 0; r < ROWS; r++) {
                for (int c = 0; c < COLUMNS; c++) {
                    sum[r][c] = one[r][c] + two[r][c];
                }
            }

            // Print out the resulting matrix using formatted output
            System.out.println("Sum of the two matrices:");
            for (int[] row : sum) {
                for (int value : row) {
                    System.out.printf("%5d", value);  // Field width of 5 for alignment
                }
                System.out.println();  // Move to next row
            }
        } else {
            // If matrix shapes don’t match, show error message
            System.out.println("The two matrices are not the same shape");
        }

        // It is safe to mix System.out and EasyWriter here because only
        // one of the two versions would have been executed.
    }
}
