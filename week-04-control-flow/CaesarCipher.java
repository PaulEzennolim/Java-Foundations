import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in); // Scanner for user input

        // Ask for the key and reduce it to range 0–25
        System.out.print("What is your key? ");
        int key = keyboard.nextInt() % 26;

        // Ensure the key is a positive integer
        while (key < 1) {
            System.out.print("That won't work. Please try again. What is your key? ");
            key = keyboard.nextInt() % 26;
        }

        // Close the scanner as it's no longer needed
        keyboard.close();

        // Read in the file and prepare to write to the encrypted output
        Scanner sourceFile = new Scanner(new File("week-04-control-flow/loris.txt")); // Reads from the source file
        sourceFile.useDelimiter(""); // Read one character at a time

        PrintWriter encrypted = new PrintWriter("week-04-control-flow/encrypted.txt"); // Write encrypted output to a file

        // Process each character in the file
        while (sourceFile.hasNext()) {
            // Deal with one character
            char plain = sourceFile.next().charAt(0);

            // Check if the character is a letter
            if (Character.isLetter(plain)) {
                // Determine base ('A' or 'a') to preserve case
                char base = Character.isUpperCase(plain) ? 'A' : 'a';

                // Shift the character and wrap around within alphabet
                char coded = (char) ((plain - base + key) % 26 + base);

                // Write the encrypted letter to the output file
                encrypted.print(coded);
            } else {
                // It's not a letter, so write the original character
                encrypted.print(plain);
            }
        }

        // Close both file readers/writers
        sourceFile.close();
        encrypted.close();
    }
}
