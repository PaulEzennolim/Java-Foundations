import java.util.Scanner;

public class CompareLists {

    public static void main(String[] args) {

        final int MAX_ARRAY = 5;  // Size of each list

        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Read in list 1
        int[] list1 = new int[MAX_ARRAY];
        for (int i = 0; i < MAX_ARRAY; i++) {
            System.out.print("Enter array value " + (i + 1) + " of list 1: ");
            list1[i] = keyboard.nextInt();  // Store user input in list1
        }
        System.out.println();

        // Read in list 2
        int[] list2 = new int[MAX_ARRAY];
        for (int i = 0; i < MAX_ARRAY; i++) {
            System.out.print("Enter array value " + (i + 1) + " of list 2: ");
            list2[i] = keyboard.nextInt();  // Store user input in list2
        }
        System.out.println();

        // Close the scanner as it's no longer needed
        keyboard.close();

        int hits = 0;  // Counter for matching elements

        // For each value in list1, check if it appears in list2
        for (int list1value : list1) {
            int list2index = 0;

            // Search for a match in list2
            while (list2index < MAX_ARRAY && list1value != list2[list2index]) {
                list2index++;
            }

            if (list2index < MAX_ARRAY) {
                // Match found, mark it as used to prevent duplicate matching
                list2[list2index] = -1;
                hits++;
            }
        }

        // Compare number of hits to array length to determine equality
        if (hits == MAX_ARRAY) {
            System.out.println("The two lists have the same contents");
        } else {
            System.out.println("The two lists have different contents");
        }
    }
}
