import java.util.Scanner;

public class ReplaceFourthChar {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to type in a sentence and read it
        System.out.print("Please type a sentence: ");
        String sentence = keyboard.nextLine();  // Read the full line of input

        // Close the scanner to free system resources
        keyboard.close();

        // Check if the sentence has at least 4 characters
        if (sentence.length() >= 4) {
            // Get the 4th character (index 3) from the sentence
            char fourthChar = sentence.charAt(3);

            // Replace every occurrence of the 4th character with an asterisk
            String modifiedSentence = sentence.replace(fourthChar, '*');

            // Print the modified sentence
            System.out.println("Output: " + modifiedSentence);
        } else {
            // Inform the user that the input is too short
            System.out.println("Please enter a sentence with at least 4 characters.");
        }
    }
}
