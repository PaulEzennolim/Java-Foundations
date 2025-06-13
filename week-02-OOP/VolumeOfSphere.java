import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to enter the radius of the sphere
        System.out.print("What is the radius of your sphere? ");
        double radius = keyboard.nextDouble();  // Read the radius as a double

        // Close the scanner to free system resources
        keyboard.close();

        // Print a message indicating the operation being performed
        System.out.print("The volume of a sphere with radius " + radius + " is ");

        // Calculate and print the volume using the formula: (4/3) * π * r³
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println(volume);
    }
}
