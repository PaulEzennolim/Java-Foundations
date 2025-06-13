import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 * This program displays randomly generated circles on a canvas
 * using standard Java Swing and AWT classes.
 */
public class RandomCircles extends JPanel {

    private static final int CANVAS_WIDTH = 300;
    private static final int CANVAS_HEIGHT = 300;
    private static final int NUM_CIRCLES = 50;

    // Store generated circles for use in paintComponent
    private Circle[] circles;

    public RandomCircles() {
        // Generate an array of randomly configured circles
        circles = new Circle[NUM_CIRCLES];

        for (int i = 0; i < NUM_CIRCLES; i++) {
            int radius = (int) (Math.random() * 50) + 10;
            int centerX = (int) (Math.random() * (CANVAS_WIDTH - 2 * radius)) + radius;
            int centerY = (int) (Math.random() * (CANVAS_HEIGHT - 2 * radius)) + radius;
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);

            circles[i] = new Circle(centerX, centerY, radius, new Color(red, green, blue));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw all circles
        for (Circle c : circles) {
            g.setColor(c.color);
            g.fillOval(c.x - c.radius, c.y - c.radius, 2 * c.radius, 2 * c.radius);
        }
    }

    public static void main(String[] args) {
        // Set up the window
        JFrame frame = new JFrame("Random Circles");
        RandomCircles panel = new RandomCircles();

        frame.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }

    // Helper class to store circle attributes
    private static class Circle {
        int x, y, radius;
        Color color;

        public Circle(int x, int y, int radius, Color color) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.color = color;
        }
    }
}
