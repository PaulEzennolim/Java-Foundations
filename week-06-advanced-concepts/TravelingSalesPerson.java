import javax.swing.JOptionPane;

public class TravelingSalesPerson {

    public static void main(String[] args) {
        // Input coordinates of four cities
        double[][] cities = new double[4][2];
        for (int i = 0; i < 4; i++) {
            cities[i][0] = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter x-coordinate for city " + (i + 1) + ": "));
            cities[i][1] = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter y-coordinate for city " + (i + 1) + ": "));
        }

        // Calculate total distance and direct distance
        double totalDistance = 0.0;
        for (int i = 0; i < 3; i++) {
            double distance = Math.hypot(cities[i + 1][0] - cities[i][0], cities[i + 1][1] - cities[i][1]);
            totalDistance += distance;
        }

        double directDistance = Math.hypot(cities[3][0] - cities[0][0], cities[3][1] - cities[0][1]);

        // Output results to two decimal places
        System.out.print("Total distance traveled: ");
        System.out.printf("%.2f\n", totalDistance);

        System.out.print("Direct distance between the first and last cities: ");
        System.out.printf("%.2f\n", directDistance);
    }
}
