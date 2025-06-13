import java.util.Scanner;
import java.util.Stack;

/**
 * This program checks whether an expression has balanced brackets ((), {}, []).
 */
public class BalancedExpressionChecker {

    public static void main(String[] args) {
        // Create a Scanner object for user input (replaces EasyReader)
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to enter an expression
        System.out.println("Enter an expression to check for balanced parentheses:");
        // Read the entire line from the user
        String expression = keyboard.nextLine();

        // Check if the expression is balanced and print the result
        if (isBalanced(expression)) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }

        // Close the scanner to avoid resource leaks
        keyboard.close();
    }

    /**
     * Method to check if the given expression has balanced parentheses.
     * 
     * @param expression The input string to check
     * @return true if balanced, false otherwise
     */
    private static boolean isBalanced(String expression) {
        // Create a stack to track open parentheses
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the expression
        for (char ch : expression.toCharArray()) {
            // If the character is an open bracket, push it onto the stack
            if (isOpenBracket(ch)) {
                stack.push(ch);
            }
            // If the character is a close bracket
            else if (isCloseBracket(ch)) {
                // If the stack is empty, there is no matching open bracket
                if (stack.isEmpty()) {
                    return false; // Unmatched close bracket
                }

                // Pop a character off the stack
                char openBracket = stack.pop();

                // If the popped character is not a matching open bracket, the expression is not balanced
                if (!isMatchingPair(openBracket, ch)) {
                    return false; // Mismatched open and close brackets
                }
            }
        }

        // If the stack is empty, the expression is balanced
        return stack.isEmpty();
    }

    // Helper method to check if a character is an open bracket
    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    // Helper method to check if a character is a close bracket
    private static boolean isCloseBracket(char ch) {
        return ch == ')' || ch == '}' || ch == ']';
    }

    // Helper method to check if a pair of brackets are matching
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
