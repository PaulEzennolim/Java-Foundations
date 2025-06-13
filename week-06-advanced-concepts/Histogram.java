import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* 
Draws a histogram based on values read from "onethousandnumbers.txt"
*/
public class Histogram extends JPanel {

    // Constants for the program
    private static final int NUM_VALUES = 1000;  // Total number of values in the file
    private static final int NUM_BARS = 20;      // Number of bars in the histogram
    private static final int BAR_WIDTH = 20;     // Width of each bar in pixels
    private static final int HEIGHT = 150;       // Height of the panel in pixels

    // Array to store the frequency of each value
    private int[] hist = new int[NUM_BARS];

    public Histogram() {
        // Read values from the file and fill histogram
        try (Scanner file = new Scanner(new File("onethousandnumbers.txt"))) {
            for (int i = 0; i < NUM_VALUES; i++) {
                int n = file.nextInt();
                if (n >= 1 && n <= NUM_BARS) {
                    hist[n - 1]++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: onethousandnumbers.txt");
            System.exit(1);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw histogram bars
        for (int i = 0; i < NUM_BARS; i++) {
            int x = i * BAR_WIDTH;
            int barHeight = hist[i];

            // Set color for filled rectangle
            g.setColor(new Color(100, 100, 255));  // Light blue
            g.fillRect(x, HEIGHT - barHeight, BAR_WIDTH, barHeight);

            // Set color for outline
            g.setColor(Color.BLACK);
            g.drawRect(x, HEIGHT - barHeight, BAR_WIDTH, barHeight);
        }
    }

    public static void main(String[] args) {
        // Create a window to display the histogram
        JFrame frame = new JFrame("Histogram");
        Histogram panel = new Histogram();
        panel.setSize(NUM_BARS * BAR_WIDTH, HEIGHT);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(NUM_BARS * BAR_WIDTH, HEIGHT + 40);
        frame.add(panel);
        frame.setVisible(true);
    }
}
