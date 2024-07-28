package practice5;
// Define the package name practice5.

interface Resizeable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
// Define an interface named Resizeable with two abstract methods resizeWidth(int width) and resizeHeight(int height).

class Rectangle implements Resizeable {
    private int width;
    private int height;

    // Constructor to initialize width and height
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    // Initialize the Rectangle class to implement the Resizeable interface.
    // Add a constructor to initialize the width and height of the rectangle.

    public void resizeWidth(int width) {
        this.width = width;
    }
    // Implement the resizeWidth method to set the width of the rectangle.

    public void resizeHeight(int height) {
        this.height = height;
    }
    // Implement the resizeHeight method to set the height of the rectangle.

    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
    // Add a method printSize to print the current width and height of the rectangle.
}

// Define the Main class with a main method that serves as the entry point for the program.
