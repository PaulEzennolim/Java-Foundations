import javax.swing.JOptionPane;

public class LoanAmortization {
    public static void main(String[] args) {
        // Input values for the loan parameters using JOptionPane
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter the principal amount (c):"));
        double p = Double.parseDouble(JOptionPane.showInputDialog("Enter the annual interest rate (p):"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of months (n):"));

        // Calculate the monthly payment using the loan amortization formula
        double m = c * (p / 1200 * Math.pow(1 + p / 1200, n)) / (Math.pow(1 + p / 1200, n) - 1);

        // Round to at most two decimal places
        m = Math.round(m * 100.0) / 100.0;

        // Print the result with a descriptive message
        System.out.println("The monthly payment for the loan is: " + m);
    }
}
