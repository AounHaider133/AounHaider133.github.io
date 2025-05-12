interface Prototype {
    Prototype clone();
}

class Circle implements Prototype {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Prototype clone() {
        // Create a copy of the current object
        return new Circle(this.radius, this.color);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Original circle
        Circle originalCircle = new Circle(10, "Red");

        // Clone the original circle
        Circle clonedCircle = (Circle) originalCircle.clone();
        clonedCircle.setColor("Blue"); // Modify the cloned object

        // Print both circles
        System.out.println("Original Circle: " + originalCircle); // Output: Circle [radius=10, color=Red]
        System.out.println("Cloned Circle: " + clonedCircle);     // Output: Circle [radius=10, color=Blue]
    }
}
