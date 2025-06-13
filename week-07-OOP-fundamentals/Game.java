// Game.java
public class Game {
    // Static constants, variables, and methods
    private static final double DEFAULT_PRICE = 35;
    private static final double MINIMUM_PRICE = 1;

    private static int counter = 0;

    // getCount method
    public static int getCount() {
        return counter;
    }

    // The instance variables
    private String title;
    private int sales;
    private String release;
    private Publisher publisher;
    private double price;

    // The private methods

    // Checks if the price is valid
    private boolean isValidPrice(double p) {
        return p >= MINIMUM_PRICE;
    }

    // Constructors

    // Default constructor
    public Game() {
        this("UNKNOWN", 0, "UNKNOWN", null, DEFAULT_PRICE);
    }

    // Constructor with parameters
    public Game(String t, int s, String r, Publisher pub, double p) {
        title = t;
        sales = s;
        release = r;
        publisher = pub;
        if (isValidPrice(p))
            price = p;
        else
            price = DEFAULT_PRICE;

        counter++; // Increment the counter when a new Game object is created
    }

    // Accessors and mutators

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int s) {
        sales = s;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String r) {
        release = r;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher p) {
        publisher = p;
    }

    public double getPrice() {
        return price;
    }

    // Setter method for price with minimum value enforcement
    public void setPrice(double p) {
        if (isValidPrice(p))
            price = p;
        else
            price = DEFAULT_PRICE;
    }

    // The toString method
    public String toString() {
        if (publisher == null)
            return title + " (" + sales + " copies sold), released on " +
                    release + " by an unknown publisher. Price : " + price;
        else
            return title + " (" + sales + " copies sold), released on " +
                    release + " by " + publisher.toString() + ". Price : " + price;
    }

    // The main method
    public static void main(String args[]) {
        // Example of using the constructor with parameters
        Game redDead = new Game("Red Dead Redemption 2", 55000000,
                "October 26, 2018", Publisher.ROCKSTAR, 37.5);
        System.out.println(redDead);

        // Example of using the default constructor
        Game dummy = new Game();
        System.out.println(dummy);

        System.out.println(Game.getCount() + " Games have been created");
    }
}
