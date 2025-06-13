import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] arg) throws FileNotFoundException {
        // The exchange rate 
        final double POUNDS_TO_EUROS = 1.17;

        // The layout (DECIMALS and FIELD_WIDTH are not used directly,
        // but the formatting mimics their effect via printf)
        final int DECIMALS = 2;
        final int FIELD_WIDTH = 10;

        // Reading in the values from a file
        Scanner fileInput = new Scanner(new File("data.txt"));  // Open the input file
        double first = fileInput.nextDouble();  // Read first amount
        double second = fileInput.nextDouble(); // Read second amount
        fileInput.close();  // Always close input when done

        // Outputting them to a file
        PrintWriter file = new PrintWriter("out.txt");  // Open the output file
        file.printf("%" + FIELD_WIDTH + "." + DECIMALS + "f%n", first * POUNDS_TO_EUROS);
        file.printf("%" + FIELD_WIDTH + "." + DECIMALS + "f%n", second * POUNDS_TO_EUROS);
        file.printf("%" + FIELD_WIDTH + "." + DECIMALS + "f%n", (first + second) * POUNDS_TO_EUROS);
        file.close();  // Close output file

        // Outputting the sum to the screen
        System.out.print("The sum is ");
        System.out.printf("%." + DECIMALS + "f%n", (first + second) * POUNDS_TO_EUROS);
    }
}
