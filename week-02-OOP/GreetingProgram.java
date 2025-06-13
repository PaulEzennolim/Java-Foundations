import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for their given name and read the input
        System.out.print("What is your given name? ");
        String givenName = keyboard.nextLine();  // Reads the full line for given name

        // Prompt the user for their family name and read the input
        System.out.print("What is your family name? ");
        String familyName = keyboard.nextLine();  // Reads the full line for family name

        // Close the scanner to free system resources
        keyboard.close();

        // Print a greeting using the full name
        System.out.println("Hello " + givenName + " " + familyName);
    }
}
