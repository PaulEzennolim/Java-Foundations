import java.util.Scanner;

public class HailstoneSequence {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        int n;
        do {
            System.out.print("Enter the value of n: ");
            n = keyboard.nextInt();  // Read an integer from the user
        } while (n < 1);  // Keep prompting until a positive integer is entered

        // Close the scanner as it's no longer needed
        keyboard.close();

        // Display the Hailstone sequence for the entered number
        System.out.println("Hailstone sequence:");
        do {
            System.out.print(n + " ");  // Print the current value of n

            if (n % 2 == 0) {
                // If n is even, divide it by 2
                n /= 2;
            } else {
                // If n is odd, multiply it by 3 and add 1
                n = 3 * n + 1;
            }
        } while (n != 1);

        // Print the last element (1) in the sequence
        System.out.print(n);  // This prints the final '1' without a trailing space
    }
}
