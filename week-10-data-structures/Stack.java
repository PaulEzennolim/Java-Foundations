import java.util.Scanner;

/**
 * A minimal implementation of a Stack.
 */
public class Stack {
    // Constant - the maximum size of the Stack
    private static final int MAX_ITEM = 20;

    // Instance variables
    private int numElements;
    private Object[] items;

    /**
     * Constructor - creates a new empty stack
     */
    public Stack() {
        numElements = 0;
        items = new Object[MAX_ITEM];
    }

    /**
     * Determines whether the Stack is full
     * @return true if the Stack is full
     */
    public boolean isFull() {
        return numElements == MAX_ITEM;
    }

    /**
     * Determines whether the Stack is empty
     * @return true if the Stack is empty
     */
    public boolean isEmpty() {
        return numElements == 0;
    }

    /**
     * Removes the element from the top and returns it.
     * The method stops with an error if the stack is empty.
     * @return the element on the top of the Stack
     */
    public Object pop() {
        if (isEmpty()) {
            System.err.println("Error: Cannot pop from empty stack.");
            System.exit(1);
        }
        numElements -= 1;
        return items[numElements];
    }

    /**
     * Puts an element on the top of the Stack.
     * The method stops with an error if the stack is full.
     * @param obj The thing to be added to the stack
     */
    public void push(Object obj) {
        if (isFull()) {
            System.err.println("Error: Cannot push to full stack.");
            System.exit(1);
        }
        items[numElements] = obj;
        numElements += 1;
    }

    /**
     * Returns a reference to the item on the top of the stack.
     * The contents of the Stack are not changed.
     * @return the item on the top of the Stack
     */
    public Object retrieve() {
        if (isEmpty()) {
            System.err.println("Error: Cannot retrieve from empty stack.");
            System.exit(1);
        }
        return items[numElements - 1];
    }

    /**
     * A test harness
     * @param args Not used
     */
    public static void main(String[] args) {
        // The stack
        Stack myStack = new Stack();

        // Create Scanner for user input (replacing EasyReader)
        Scanner keyboard = new Scanner(System.in);

        // Read five integers and push each onto the stack
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = keyboard.nextInt();
            myStack.push(num);
        }

        // Close the scanner after input
        keyboard.close();

        // Check the use of isEmpty and pop
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
