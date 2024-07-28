package practice3;
// Define the package name practice3.

interface Flyable {
    void fly_obj();
}
// Define an interface named Flyable with an abstract method fly_obj() that doesn't take any parameters and returns nothing.

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is flying");
    }
}
// Define a class Spacecraft that implements the Flyable interface.
// Provide the implementation of the fly_obj() method to print "Spacecraft is flying".

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flying");
    }
}
// Define a class Airplane that implements the Flyable interface.
// Provide the implementation of the fly_obj() method to print "Airplane is flying".

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter is flying");
    }
}
// Define a class Helicopter that implements the Flyable interface.
// Provide the implementation of the fly_obj() method to print "Helicopter is flying".

// Define the Main class with a main method that serves as the entry point for the program.
