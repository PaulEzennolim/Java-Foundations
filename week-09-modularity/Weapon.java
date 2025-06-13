// Define a class named Weapon
public class Weapon {

    // Private instance variable to store the weapon's name
    private String name;

    // Constructor to initialize the Weapon object with a name
    public Weapon(String name) {
        this.name = name;
    }

    // Getter method to retrieve the weapon's name
    public String getName() {
        return name;
    }

    // Setter method to set the weapon's name
    public void setName(String name) {
        this.name = name;
    }

    // Override the toString method to provide a custom string representation of the Weapon object
    public String toString() {
        return name;
    }

    // Method to create a copy of the Weapon object
    public Weapon copy() {
        // Create a new Weapon object with the same name
        return new Weapon(name);
    }

}
