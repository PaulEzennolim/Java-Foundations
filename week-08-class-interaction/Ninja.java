import java.time.LocalDate;

public class Ninja {

    private String name;
    private Weapon weapon;
    private LocalDate createdAt;

    public Ninja(String name, Weapon weapon, LocalDate createdAt) {
        this.name = name;
        // Using the copy method to create a new Weapon instance with the same name
        this.weapon = weapon.copy();
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon.copy();
    }

    public String toString() {
        return "Ninja called " + name + " with a " + weapon + ", created at " + createdAt;
    }
}