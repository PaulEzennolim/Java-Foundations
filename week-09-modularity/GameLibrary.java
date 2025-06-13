import java.time.LocalDate;
import java.io.*;
import java.util.Scanner;

// Enum to represent different publishers
enum Publisher {
    MOJANG, ROCKSTAR, ELECTRONIC_ARTS, NINTENDO, KRAFTON, BLIZZARD,
    CD_PROJEKT, RE_LOGIC, CURVE, ACTIVISION, NAMCO, TWOK_GAMES, EA_SPORTS,
    TELLTALE, XBOX, SEGA, SONY
}

// Class representing a game
class Game {
    private String title;
    private int sales;
    private LocalDate release;
    private Publisher publisher;
    private double price;

    // Constructor
    public Game(String title, int sales, LocalDate release, Publisher publisher, double price) {
        this.title = title;
        this.sales = sales;
        this.release = release;
        this.publisher = publisher;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getRelease() {
        return release;
    }

    @Override
    public String toString() {
        return title + " (" + sales + " copies sold), released on " + release + " by " + publisher + ". Price: " + price;
    }
}

// Class representing a game library
public class GameLibrary {
    private Game[] arrayOfGames;

    // Find a game by its title
    public Game find(String nameOfGame) {
        for (Game g : arrayOfGames)
            if (g.getTitle().equals(nameOfGame))
                return g;
        return null;
    }

    // Import games from a text file using Scanner
    public void importFrom(String textFile) {
        final int MAX = 100;
        Game[] bigOne = new Game[MAX];
        int count = 0;

        try (Scanner fileReader = new Scanner(new File(textFile))) {
            while (fileReader.hasNext()) {
                String title = fileReader.next();
                int sales = fileReader.nextInt();
                int year = fileReader.nextInt();
                int month = fileReader.nextInt();
                int day = fileReader.nextInt();
                LocalDate release = LocalDate.of(year, month, day);
                Publisher publisher = Publisher.valueOf(fileReader.next());
                double price = fileReader.nextDouble();

                bigOne[count] = new Game(title, sales, release, publisher, price);
                count++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + textFile);
            e.printStackTrace();
        }

        arrayOfGames = new Game[count];
        System.arraycopy(bigOne, 0, arrayOfGames, 0, count);
    }

    // Sort games by release date (selection sort)
    public void sortByReleaseDate() {
        for (int lastUnsorted = arrayOfGames.length - 1; lastUnsorted > 0; lastUnsorted--) {
            int latest = lastUnsorted;
            for (int i = 0; i < lastUnsorted; i++)
                if (arrayOfGames[i].getRelease().isAfter(arrayOfGames[latest].getRelease()))
                    latest = i;

            if (latest != lastUnsorted) {
                Game temp = arrayOfGames[latest];
                arrayOfGames[latest] = arrayOfGames[lastUnsorted];
                arrayOfGames[lastUnsorted] = temp;
            }
        }
    }

    // Export games to a text file using PrintWriter
    public void exportTo(String fileName) {
        try (PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            for (Game g : arrayOfGames)
                output.println(g);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + fileName);
            e.printStackTrace();
        }
    }

    // Print details of a game by title
    public void printGameDetails(String nameOfGame) {
        Game foundGame = find(nameOfGame);
        if (foundGame != null) {
            System.out.println("Details of the game '" + nameOfGame + "':");
            System.out.println(foundGame);
        } else {
            System.out.println("Game '" + nameOfGame + "' not found in the library.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        GameLibrary library = new GameLibrary();

        library.importFrom("games.txt");
        library.printGameDetails("Red Dead Redemption 2");
        library.sortByReleaseDate();
        library.exportTo("orderedByReleaseDate.txt");
    }
}
