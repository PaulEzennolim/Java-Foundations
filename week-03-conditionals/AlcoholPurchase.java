import java.util.Scanner;

public class AlcoholPurchase {
    // Constants for age limits
    private static final int LEGAL_DRINKING_AGE = 18;
    private static final int AGE_FOR_ID_PROOF = 25;

    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = keyboard.nextInt();  // Read the age as an integer

        // Close the scanner to free system resources
        keyboard.close();

        // Check if the person can buy alcohol
        if (age >= LEGAL_DRINKING_AGE) {
            System.out.println("You can buy alcohol.");

            // Check if the person needs proof of age
            if (age < AGE_FOR_ID_PROOF) {
                System.out.println("You may need proof of age.");
            } else {
                System.out.println("You usually don't need proof of age.");
            }
        } else {
            // Person is under the legal drinking age
            System.out.println("You cannot buy alcohol.");
        }
    }
}
