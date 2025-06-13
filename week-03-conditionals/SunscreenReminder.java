import java.util.Scanner;

public class SunscreenReminder {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Ask if it is sunny
        System.out.print("Is it sunny? (true/false): ");
        boolean isSunny = keyboard.nextBoolean();  // Read boolean input

        if (isSunny) {
            // Ask for the month number
            System.out.print("Enter the month number (1-12): ");
            int month = keyboard.nextInt();  // Read the month as an integer

            // Check if the month is between May (5) and September (9)
            boolean isSummerMonth = (month >= 5 && month <= 9);

            // Check if sunscreen is needed
            if (isSummerMonth) {
                System.out.println("Remember to use sunscreen.");
            } else {
                System.out.println("You don't need sunscreen unless you burn very easily.");
            }
        } else {
            // If it's not sunny, sunscreen is likely not needed
            System.out.println("You don't need sunscreen unless you burn very easily.");
        }

        // Close the scanner to free system resources
        keyboard.close();
    }
}
