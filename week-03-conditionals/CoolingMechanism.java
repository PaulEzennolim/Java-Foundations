import java.util.Scanner;

public class CoolingMechanism {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner reader = new Scanner(System.in);

        // Prompt user for temperature input
        System.out.print("Enter the temperature (degrees): ");
        int temperature = reader.nextInt();  // Read the input temperature as an integer

        // Close the scanner to free system resources
        reader.close();

        // Determine the cooling mechanism based on temperature
        String coolingMechanism;
        if (temperature >= 101 && temperature <= 120) {
            coolingMechanism = "Dripping";
        } else if (temperature >= 91 && temperature <= 100) {
            coolingMechanism = "Sweating";
        } else if (temperature >= 81 && temperature <= 90) {
            coolingMechanism = "Perspiring";
        } else if (temperature >= 71 && temperature <= 80) {
            coolingMechanism = "Glowing";
        } else if (temperature >= 40 && temperature <= 70) {
            coolingMechanism = "Gleaming";
        } else {
            // If the temperature doesn't fall within the defined ranges
            coolingMechanism = "Out of range";
        }

        // Display the cooling mechanism
        System.out.println("Cooling Mechanism: " + coolingMechanism);
    }
}
