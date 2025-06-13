public class NinjaTest {
  public static void main(String[] args) {
      // Creating a Weapon instance with the name "sword"
      Weapon weapon = new Weapon("sword");

      // Creating a Ninja named "hideki" with the initial weapon "sword"
      Ninja hideki = new Ninja("hideki", weapon);

      // Printing the initial state of the Ninja
      System.out.println(hideki);

      // Changing the weapon to "shuriken"
      weapon.setName("shuriken");

      // Printing the updated state of the Ninja
      System.out.println(hideki);
  }
}