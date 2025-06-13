import java.util.Scanner;

public class PhoneNumberExtractor {
    public static void main(String[] args) {
        // Create an instance of Scanner for reading input
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to enter a telephone number in the specified format
        System.out.print("Enter a telephone number (e.g., (0114) 239 3124): ");
        String phoneNumber = keyboard.nextLine();

        // Remove leading and trailing whitespaces
        phoneNumber = phoneNumber.trim();

        // Extract the area code between brackets
        int startIndex = phoneNumber.indexOf("(") + 1;
        int endIndex = phoneNumber.indexOf(")");
        String areaCode = phoneNumber.substring(startIndex, endIndex);

        // Extract the number after the closing bracket
        int numberStartIndex = phoneNumber.indexOf(")") + 1;
        String number = phoneNumber.substring(numberStartIndex).trim();

        // Print the extracted area code and number
        System.out.println("The area code is: " + areaCode);
        System.out.println("The telephone number is: " + number);

        // Close the scanner to avoid resource leak warning
        keyboard.close();
    }
}
