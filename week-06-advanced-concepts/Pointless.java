import java.util.Scanner;

public class Pointless {

    public static void main(String[] args) {

        // Create a Scanner to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input an integer
        System.out.print("Please type in an integer: ");
        int pointless = scanner.nextInt();

        // Declare the variable outside the loop to extend its scope
        String evenMorePointless = "";

        // Loop from 0 up to (but not including) the entered integer
        for (int i = 0; i < pointless; i++) {
            evenMorePointless = "Loop " + i;
            System.out.println(evenMorePointless); // Print the current loop index as a message
        }

        // Print the final values after the loop
        System.out.println(pointless);             // The integer entered by the user
        System.out.println(evenMorePointless);     // The final value assigned inside the loop

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
