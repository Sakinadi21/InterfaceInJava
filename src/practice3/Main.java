package practice3;

public class Main {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};
        // Create an array of Flyable objects named flyingObjects containing new instances of Spacecraft, Airplane, and Helicopter.

        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
        // Loop through each Flyable object in the flyingObjects array and call its fly_obj() method.
    }
}
