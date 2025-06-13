public class Weapon {

    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Copy method to create a new Weapon instance with the same name
    public Weapon copy() {
        return new Weapon(this.name);
    }

    public String toString() {
        return name;
    }
}