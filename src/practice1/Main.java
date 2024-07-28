package practice1;

// practice1.Main class to test the shapes
public class Main {
    public static void main(String[] args) {
        // Create instances of practice1.Rectangle, practice1.Circle, and practice1.Triangle
        Rectangle rectangle = new Rectangle(12, 6);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(5, 4);

        // Print the area of each shape
        System.out.println("Area of practice1.Rectangle: " + rectangle.getArea());
        System.out.println("Area of practice1.Circle: " + circle.getArea());
        System.out.println("Area of practice1.Triangle: " + triangle.getArea());
    }
}
