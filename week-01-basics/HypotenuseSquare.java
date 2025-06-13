import javax.swing.JOptionPane;

public class HypotenuseSquare {
    public static void main(String[] args) {
        // Declare and initialize variables
        int a, b, hypotenuseSquare;

        // Input values for sides 'a' and 'b' using JOptionPane
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of side 'a':"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of side 'b':"));

        // Recalculate the square of the hypotenuse
        hypotenuseSquare = a * a + b * b;

        // Print the result with a descriptive message
        System.out.println("The square of the hypotenuse of a right-angled triangle whose other sides are " +
                a + " and " + b + " is " + hypotenuseSquare);
    }
}

