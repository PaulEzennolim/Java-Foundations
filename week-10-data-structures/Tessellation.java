import javax.swing.*;
import java.awt.*;

/**
 * The Tessellation class simulates cellular automata generations
 * and displays the final generation as a pattern.
 */
public class Tessellation extends JPanel {

    private static final int MSIZE = 300;   // Size of the grid and window
    private Generation generation;

    public Tessellation(Generation generation) {
        this.generation = generation;
        setPreferredSize(new Dimension(MSIZE, MSIZE));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int size = generation.getSize();
        int[][] grid = generation.getGrid();

        // Paint each cell in the grid
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (grid[r][c] == 1) {
                    // Plot filled pixel for live cell
                    g.fillRect(r, c, 1, 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide the maximum number of generations as a command line argument.");
            System.exit(1);
        }

        // Parse maximum generation count from command line argument
        final int MAX_GENERATION = Integer.parseInt(args[0]);

        // Create an instance of the Generation class
        Generation generation = new Generation(MSIZE);

        // g counts the generations
        for (int g = 1; g < MAX_GENERATION; g++) {
            // Evolve the generation
            generation.evolve();
        }

        // Create and set up the window
        JFrame frame = new JFrame("Tessellation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the drawing panel with the final generation
        Tessellation panel = new Tessellation(generation);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
