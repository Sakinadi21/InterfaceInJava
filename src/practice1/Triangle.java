package practice1;

// practice1.Triangle class implementing practice1.Shape interface
public class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override method to calculate area of the triangle
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
