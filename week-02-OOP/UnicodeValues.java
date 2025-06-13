public class UnicodeValues {
    public static void main(String[] args) {
        // Find the Unicode value of the first letter of the lowercase alphabet
        char firstLowerCase = 'a';
        int unicodeFirstLowerCase = (int) firstLowerCase;

        // Find the Unicode values of the characters '0' and '9'
        char zero = '0';
        char nine = '9';
        int unicodeZero = (int) zero;
        int unicodeNine = (int) nine;

        // Calculate the difference between the Unicode values of '0' and '9'
        int difference = unicodeNine - unicodeZero;

        // Print the results
        System.out.println("Unicode value of the first letter of the lowercase alphabet: " + unicodeFirstLowerCase);
        System.out.println("Unicode value of the character '0': " + unicodeZero);
        System.out.println("Unicode value of the character '9': " + unicodeNine);
        System.out.println("Difference between '0' and '9': " + difference);
    }
}
