import java.util.Scanner;

public class DistanceConverter {
    // Constants
    static final int YARDS_IN_A_MILE = 1760;
    static final double MILES_TO_KILOMETERS = 1.60934;

    public static void main(String[] args) {
        // Create an instance of Scanner for reading input
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to enter the distance in miles and yards
        System.out.println("Enter a distance in miles and yards");
        System.out.print("How many miles? : ");
        int miles = keyboard.nextInt();  // Read miles input
        System.out.print("How many yards? : ");
        int yards = keyboard.nextInt();  // Read yards input

        // Calculate the equivalent distance in kilometers
        double totalMiles = miles + (double) yards / YARDS_IN_A_MILE;
        double kilometers = totalMiles * MILES_TO_KILOMETERS;

        // Round the result to an integer
        int roundedKilometers = (int) Math.round(kilometers);

        // Print the result directly to the console
        System.out.println(miles + " miles and " + yards + " yards is equivalent to " + roundedKilometers + " km");

        // Close the scanner to prevent resource leak warnings
        keyboard.close();
    }
}
