import java.time.LocalDate;

// Define a class named Ninja
public class Ninja {

    // Private instance variables to store ninja's name, weapon, and date of birth
    private String name;
    private Weapon weapon;
    private LocalDate dob;

    /**
     * Constructor to initialize the Ninja object with a name, weapon, and date of birth
     * @param name the name of the ninja
     * @param weapon the weapon the ninja uses
     * @param dob the date of birth of the ninja
     */
    public Ninja(String name, Weapon weapon, LocalDate dob) {
        this.name = name;
        this.weapon = weapon;
        this.dob = dob;
    }

    /**
     * Getter method to retrieve the ninja's name
     * @return the name of the ninja
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method to retrieve the ninja's weapon
     * @return the weapon of the ninja
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Getter method to retrieve the ninja's date of birth
     * @return the date of birth of the ninja
     */
    public LocalDate getDob() {
        return dob;
    }

    /**
     * Setter method to set the ninja's name
     * @param name the new name of the ninja
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter method to set the ninja's weapon
     * @param weapon the new weapon of the ninja
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Setter method to set the ninja's date of birth
     * @param dob the new date of birth of the ninja
     */
    public void setDob(LocalDate dob)  {
        this.dob = dob;
    }

    /**
     * Override the toString method to provide a custom string representation of the Ninja object
     * @return a string describing the ninja
     */
    @Override
    public String toString() {
        return "Ninja called " + name + " with a " + weapon + " who was born on " + dob;
    }

}
