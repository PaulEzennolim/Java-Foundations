public class Generation {

    // 2D array representing the grid for the generation
    private int[][] grid;

    // Getter methods to support external access
    public int[][] getGrid() {
        return grid;
    }

    public int getSize() {
        return grid.length;
    }

    // Constructor initializes the grid with a one in the middle
    public Generation(int size) {
        grid = new int[size][size];
        // Initialize the grid, setting a one in the middle
        int mid = size / 2;
        grid[0][mid] = 1;
    }

    // Method to evolve to the next generation based on rules
    public void evolve() {
        int size = grid.length;
        int[][] nextGeneration = new int[size][size];

        // Loop through each cell and evolve it
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isEvenGeneration()) {
                    nextGeneration[i][j] = evolveEvenGeneration(i, j);
                } else {
                    nextGeneration[i][j] = evolveOddGeneration(i, j);
                }
            }
        }

        // Update the grid with the evolved generation
        grid = nextGeneration;
    }

    // Method to check if the current generation is even
    private boolean isEvenGeneration() {
        // Determine if the current generation is even
        // Implement your logic here, for example, by checking the generation number
        // For simplicity, assuming alternating generations for now
        return true;
    }

    // Method to evolve a cell in an even generation
    private int evolveEvenGeneration(int i, int j) {
        // Rules for even generations
        int sum = getOrthogonalSum(i, j);
        return (sum == 1) ? 1 : 0;
    }

    // Method to evolve a cell in an odd generation
    private int evolveOddGeneration(int i, int j) {
        // Rules for odd generations
        int sum = getOrthogonalSum(i, j) + getDiagonalSum(i, j);
        return (sum == 1) ? 1 : 0;
    }

    // Method to calculate the sum of orthogonal squares for a cell
    private int getOrthogonalSum(int i, int j) {
        // Calculate the sum of orthogonal squares
        int sum = 0;
        int size = grid.length;

        sum += (i > 0) ? grid[i - 1][j] : 0;      // above
        sum += (i < size - 1) ? grid[i + 1][j] : 0; // below
        sum += (j > 0) ? grid[i][j - 1] : 0;      // left
        sum += (j < size - 1) ? grid[i][j + 1] : 0; // right

        return sum;
    }

    // Method to calculate the sum of diagonal squares for a cell
    private int getDiagonalSum(int i, int j) {
        // Calculate the sum of diagonal squares
        int sum = 0;
        int size = grid.length;

        sum += (i > 0 && j > 0) ? grid[i - 1][j - 1] : 0;         // top-left
        sum += (i > 0 && j < size - 1) ? grid[i - 1][j + 1] : 0;  // top-right
        sum += (i < size - 1 && j > 0) ? grid[i + 1][j - 1] : 0;  // bottom-left
        sum += (i < size - 1 && j < size - 1) ? grid[i + 1][j + 1] : 0; // bottom-right

        return sum;
    }

    // Method to display the current generation
    public void display() {
        // Display the current generation.
        int size = grid.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
