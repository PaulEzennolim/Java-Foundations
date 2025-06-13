public class CircleProperties {
    public static void main(String[] args) {
        // Declare constant PI with a value of 22/7
        final double PI = 22.0 / 7.0;

        // Declare and initialize the radius with a simple value
        double radius = 5.0; // You can replace this with any desired radius value

        // Calculate the circumference and area
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;

        // Print out the values with descriptive messages
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
