import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSort {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a Scanner to read from the input file
        Scanner fileReader = new Scanner(new File("beenews.txt"));

        // Use a StringBuilder to accumulate all the text
        StringBuilder textBuilder = new StringBuilder();

        // Read paragraphs and concatenate into a single string
        while (fileReader.hasNext()) {
            String paragraph = fileReader.next();  // Read one word/token at a time
            textBuilder.append(paragraph).append(" ");  // Append it with a space
        }

        // Close the file to free resources
        fileReader.close();

        // Convert the StringBuilder into a plain string
        String text = textBuilder.toString();

        // Remove punctuation using regex
        text = text.replaceAll("[.,:;!?\\(\\)'\"]", "");

        // Split the text into words based on whitespace
        String[] words = text.split("\\s+");

        // Display each word on a new line
        for (String word : words) {
            System.out.println(word);
        }
    }
}
