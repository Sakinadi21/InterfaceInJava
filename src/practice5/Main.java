package practice5;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 150);
        // Create a new Rectangle object with initial width 100 and height 150.

        rectangle.printSize();
        // Print the initial size of the rectangle.

        rectangle.resizeWidth(150);
        // Resize the width of the rectangle to 150.

        rectangle.resizeHeight(200);
        // Resize the height of the rectangle to 200.

        rectangle.printSize();
        // Print the new size of the rectangle after resizing.
    }
}
