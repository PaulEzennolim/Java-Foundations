/**
 * The List class represents a simple list with additional functionality.
 */
public class List {

    // Constant - the initial capacity of the list
    private static final int INITIAL_CAPACITY = 10;

    // Instance variables
    private Object[] elements;  // Internal array to store list elements
    private int size;           // Number of elements currently in the list

    /**
     * Constructor: Creates an empty list with the initial capacity.
     */
    public List() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    /**
     * Adds an object to the end of the list.
     *
     * @param obj The object to be added to the list.
     */
    public void add(Object obj) {
        if (size == elements.length) {
            // Resize the array if it's full
            resize();
        }
        elements[size] = obj;
        size++;
    }

    /**
     * Determines whether the list is empty.
     *
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of elements in the list.
     *
     * @return The number of elements in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Clears all elements from the list.
     */
    public void clear() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    /**
     * Checks if the list contains a specified object.
     *
     * @param obj The object to check for in the list.
     * @return true if the object is in the list, false otherwise.
     */
    public boolean contains(Object obj) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds the index of a specified object in the list.
     *
     * @param obj The object to find in the list.
     * @return The index of the object or -1 if not found.
     */
    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Gets the element at the specified index in the list.
     *
     * @param index The index of the element to retrieve.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return elements[index];
    }

    /**
     * Removes the element at the specified position in the list.
     *
     * @param index The position of the element to be removed.
     * @return The removed element.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        Object removedElement = elements[index];

        // Shift elements to the left to fill the gap
        removeElementAtIndex(index);

        return removedElement;
    }

    /**
     * Removes the first occurrence of the specified object from the list.
     *
     * @param obj The object to be removed from the list.
     * @return true if the object was removed, false if the object was not found.
     */
    public boolean remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(obj)) {
                // Shift elements to the left to fill the gap
                removeElementAtIndex(i);
                return true; // Object removed
            }
        }
        return false; // Object not found
    }

    /**
     * Removes the element at the specified index, shifting subsequent elements to the left.
     *
     * @param index The index of the element to be removed.
     */
    private void removeElementAtIndex(int index) {
        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        // Set the last element to null to avoid memory leak
        elements[size - 1] = null;

        size--;
    }

    /**
     * Resizes the array to accommodate more elements.
     */
    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    /**
     * Returns a string representation of the list.
     *
     * @return A string representing the elements of the list.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    /**
     * The main method serves as a test harness for the List class.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Test the List class
        List myList = new List();

        // Add elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Print the initial list
        System.out.println("Initial List: " + myList);

        // Test additional methods
        System.out.println("Is the list empty? " + myList.isEmpty());
        System.out.println("Size of the list: " + myList.size());

        // Test clear method
        myList.clear();
        System.out.println("List after clearing: " + myList);

        // Test contains method
        System.out.println("Does the list contain 'Apple'? " + myList.contains("Apple"));

        // Add elements again
        myList.add("Carrot");
        myList.add("Broccoli");
        myList.add("Tomato");

        // Print the modified list
        System.out.println("Modified List: " + myList);

        // Test indexOf method
        System.out.println("Index of 'Broccoli': " + myList.indexOf("Broccoli"));

        // Test get method
        System.out.println("Element at index 1: " + myList.get(1));

        // Test remove methods
        System.out.println("Remove 'Carrot': " + myList.remove("Carrot"));
        System.out.println("List after removal: " + myList);

        System.out.println("Remove element at index 1: " + myList.remove(1));
        System.out.println("List after removal: " + myList);
    }
}
