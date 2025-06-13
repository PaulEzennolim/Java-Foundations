import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Declare and initialize an array of 10 integers
        int[] intArray = new int[10];

        // Read integer values from the user and store them in the array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer value: ");
            intArray[i] = keyboard.nextInt();  // Read each integer and store in the array
        }

        // Close the scanner as it's no longer needed
        keyboard.close();

        // Display the entered values
        System.out.println("Entered values:");
        for (int i = 0; i < 10; i++) {
            System.out.print(intArray[i] + " ");  // Print each value on the same line
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += intArray[i];  // Add each element to the sum
        }

        // Calculate and display the average value
        double average = (double) sum / 10;  // Cast to double to get decimal result
        System.out.println("\nAverage value: " + average);
    }
}
