import java.util.Scanner;

public class CardSuitColour {
    // Enum representing card suits
    enum Suit {
        HEARTS, CLUBS, DIAMONDS, SPADES
    }

    public static void main(String[] args) {
        // Scanner for user input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to type in the name of the suit
        System.out.print("Enter the name of the suit: ");
        String input = keyboard.nextLine().toUpperCase(); // Convert input to uppercase for enum matching

        // Close the scanner as we no longer need input
        keyboard.close();

        try {
            // Convert user input to the enum type
            Suit userSuit = Suit.valueOf(input);

            // Determine and display if the suit is red or black
            if (userSuit == Suit.HEARTS || userSuit == Suit.DIAMONDS) {
                System.out.println(userSuit + " is a red suit.");
            } else {
                System.out.println(userSuit + " is a black suit.");
            }

        } catch (IllegalArgumentException e) {
            // Handle the case where the input does not match any Suit
            System.out.println("Invalid suit entered. Please enter one of: HEARTS, CLUBS, DIAMONDS, SPADES.");
        }
    }
}
