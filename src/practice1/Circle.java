package practice1;

// practice1.Circle class implementing practice1.Shape interface
public class Circle implements Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override method to calculate area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
