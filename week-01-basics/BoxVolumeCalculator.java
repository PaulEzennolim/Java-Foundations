public class BoxVolumeCalculator {
    public static void main(String[] args) {
        // Dimensions of the box
        double width = 20.0;  // in centimeters
        double length = 30.5; // in centimeters
        double depth = 10.5;  // in centimeters

        // Calculate the volume in cubic centimeters (cc)
        double volume = width * length * depth;

        // Print the result
        System.out.println("The volume of the box is: " + volume + " cc");
    }
}
