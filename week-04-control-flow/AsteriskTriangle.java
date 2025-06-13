import java.util.Scanner;

public class AsteriskTriangle {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for an odd number
        int height;
        do {
            System.out.print("Enter an odd number for the triangle height: ");
            height = keyboard.nextInt();  // Read an integer input
        } while (height % 2 == 0);  // Keep prompting until an odd number is entered

        // Close the scanner to free system resources
        keyboard.close();

        // Draw the asterisk triangle
        for (int i = 1; i <= height; i += 2) {
            // Print spaces before asterisks to center-align each row
            for (int j = 0; j < (height - i) / 2; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
