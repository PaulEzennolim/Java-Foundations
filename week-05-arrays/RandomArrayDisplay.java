import java.util.Scanner;

public class RandomArrayDisplay {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner keyboard = new Scanner(System.in);

        // Declare and initialize an array of 10 double values
        double[] randomArray = new double[10];
        for (int i = 0; i < 10; i++) {
            randomArray[i] = Math.random();  // Generate random values between 0.0 and 1.0
        }

        // Display array elements with their indices
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : " + randomArray[i]);
        }

        // Ask the user for an array index and display the corresponding value
        while (true) {
            System.out.print("\nEnter an array index: ");
            int index = keyboard.nextInt();  // Read the user's index input

            // Check if the index is within the valid range
            if (index >= 0 && index < 10) {
                System.out.println("The value at index " + index + " is " + randomArray[index]);
            } else {
                System.out.println("Invalid index. Program terminated.");
                break;  // Exit the loop if index is out of bounds
            }
        }

        // Close the scanner to release system resources
        keyboard.close();
    }
}
