import java.util.Scanner;

public class MusicalNoteConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a musical note name: ");
        String noteName = keyboard.nextLine().toUpperCase(); // Read the input and convert to uppercase

        // Close the scanner to free system resources
        keyboard.close();

        // Convert note name to tonic solfa syllable
        String solfaSyllable;
        switch (noteName) {
            case "C":
                solfaSyllable = "Doh";
                break;
            case "D":
                solfaSyllable = "Ray";
                break;
            case "E":
                solfaSyllable = "Me";
                break;
            case "F":
                solfaSyllable = "Fah";
                break;
            case "G":
                solfaSyllable = "Soh";
                break;
            case "A":
                solfaSyllable = "La";
                break;
            case "B":
                solfaSyllable = "Ti";
                break;
            default:
                // Handle any invalid input
                solfaSyllable = "Invalid note name";
                break;
        }

        // Display the result
        System.out.println("Tonic Solfa Syllable: " + solfaSyllable);
    }
}
