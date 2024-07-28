package practice1;

// practice1.Rectangle class implementing practice1.Shape interface
public class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override method to calculate area of the rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}
