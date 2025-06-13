// Define the LemonSeller class
public class LemonSeller {

    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Define the price of each lemon in pounds
        double priceOfLemons = 0.43;

        // Define the profit percentage on each lemon
        double profit = 0.21;

        // Define the total profit made in pounds
        double priceOfAllLemons = 14.00;

        // Output a message indicating that we are about to display the number of lemons sold
        System.out.print("The number of lemons sold is ");

        // Calculate the number of lemons sold and round it to the nearest integer
        int numberOfLemonsSold = (int) Math.round(priceOfAllLemons / (priceOfLemons * profit));

        // Display the calculated number of lemons sold
        System.out.println(numberOfLemonsSold);
    }
}
