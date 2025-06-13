public class Ninja {

    private String name;
    private Weapon weapon;

    public Ninja(String name, Weapon weapon) {
        this.name = name;
        // Using the copy method to create a new Weapon instance with the same name
        this.weapon = weapon.copy();
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
        return "Ninja called " + name + " with a " + weapon;
    }
}