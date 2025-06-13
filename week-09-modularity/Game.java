import java.time.LocalDate;

public class Game {
    private static final double DEFAULT_PRICE = 35;
    private static final double MINIMUM_PRICE = 1;

    private static int counter = 0;

    public static int getCount() {
        return counter;
    }

    private String title;
    private int sales;
    private LocalDate release;  // Change release to LocalDate
    private Publisher publisher;
    private double price;

    private boolean isValidPrice(double p) {
        return p >= MINIMUM_PRICE;
    }

    public Game() {
        this("UNKNOWN", 0, LocalDate.now(), null, DEFAULT_PRICE);
    }

    // Update constructor to accept LocalDate for release
    public Game(String t, int s, LocalDate r, Publisher pub, double p) {
        title = t;
        sales = s;
        release = r;
        publisher = pub;
        if (isValidPrice(p))
            price = p;
        else
            price = DEFAULT_PRICE;

        counter++;
    }

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

    public LocalDate getRelease() {
        return release;
    }

    // Update setRelease to accept LocalDate
    public void setRelease(LocalDate r) {
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

    public void setPrice(double p) {
        if (isValidPrice(p))
            price = p;
        else
            price = DEFAULT_PRICE;
    }

    // Update toString to format LocalDate
    public String toString() {
        if (publisher == null)
            return title + " (" + sales + " copies sold), released on " +
                    release + " by an unknown publisher. Price : " + price;
        else
            return title + " (" + sales + " copies sold), released on " +
                    release + " by " + publisher + ". Price : " + price;
    }

    public static void main(String args[]) {
        Game redDead = new Game("Red Dead Redemption 2", 55000000,
                LocalDate.of(2018, 10, 26), Publisher.ROCKSTAR, 37.5);
        System.out.println(redDead);

        Game dummy = new Game();
        System.out.println(dummy);

        System.out.println(Game.getCount() + " Games have been created");
    }
}
