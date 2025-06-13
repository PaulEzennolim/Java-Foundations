import javax.swing.*;
import java.awt.*;

public class DrawRobot extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gfx = (Graphics2D) g;

        // head
        final int HEAD_SIZE = 30;
        gfx.setColor(new Color(150, 0, 150));  // Purple
        gfx.fillRect(80, 140, HEAD_SIZE, HEAD_SIZE);

        // neck
        final int NECK_SIZE = 10;
        gfx.setColor(new Color(200, 200, 0));  // Yellow
        gfx.fillRect(90, 130, NECK_SIZE, NECK_SIZE);

        // body
        gfx.setColor(new Color(0, 200, 0));  // Green
        gfx.fillRect(70, 70, 50, 60);

        // legs
        final int LEG_WIDTH = 20;
        final int LEG_HEIGHT = 40;
        final int ANKLE_HEIGHT = 30;
        final int LEFT = 70;
        final int RIGHT = 100;
        gfx.setColor(new Color(0, 200, 200));  // Cyan
        gfx.fillRect(LEFT, ANKLE_HEIGHT, LEG_WIDTH, LEG_HEIGHT);
        gfx.fillRect(RIGHT, ANKLE_HEIGHT, LEG_WIDTH, LEG_HEIGHT);

        // feet
        gfx.setColor(Color.BLACK);  // Black
        final int FOOT_HEIGHT = 10;
        final int FLOOR = 20;
        gfx.fillRect(LEFT, FLOOR, LEG_WIDTH, FOOT_HEIGHT);
        gfx.fillRect(RIGHT, FLOOR, LEG_WIDTH, FOOT_HEIGHT);

        // arms
        final int ARM_WIDTH = 10;
        final int ARM_LENGTH = 40;
        final int WRIST_LEVEL = 90;
        gfx.setColor(new Color(0, 200, 200));  // Cyan
        gfx.fillRect(60, WRIST_LEVEL, ARM_WIDTH, ARM_LENGTH);
        gfx.fillRect(120, WRIST_LEVEL, ARM_WIDTH, ARM_LENGTH);

        // hands
        final int HAND_LENGTH = 10;
        gfx.setColor(new Color(220, 200, 200));  // Light Gray
        gfx.fillRect(60, WRIST_LEVEL - HAND_LENGTH, ARM_WIDTH, HAND_LENGTH);
        gfx.fillRect(120, WRIST_LEVEL - HAND_LENGTH, ARM_WIDTH, HAND_LENGTH);
    }

    public static void main(String[] args) {
        // Create and configure a window (JFrame) to display the robot
        JFrame frame = new JFrame("Robot Drawing");
        DrawRobot panel = new DrawRobot();
        frame.setSize(200, 200);               // Set canvas size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);                      // Add custom drawing panel
        frame.setVisible(true);                // Show the window
    }
}
