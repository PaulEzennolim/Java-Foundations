import java.time.LocalDate;

// Driver class to test the Ninja and Weapon classes
public class NinjaTest {

    // Main method, the entry point for the program
    public static void main(String[] args) {

        // Create a Weapon object named "sword"
        Weapon weapon = new Weapon("sword");

        // Create a Ninja named "hideki" with the initial weapon "sword" and birthdate on 28th November 2002
        Ninja hideki = new Ninja("hideki", weapon.copy(), LocalDate.of(2002, 11, 28));

        // Print the initial state of the Ninja using the overridden toString method
        System.out.println(hideki);

        // Change the name of the weapon to "shuriken"
        weapon.setName("shuriken");

        // Print the updated state of the Ninja after changing the weapon name
        System.out.println(hideki);
    }
}
