package Interfaces;

/**
 *  Interfaces let us take objects, that may have almost nothing in common, and write reusable code, so we can process
 *  the all in a like manner.
 *
 *      `Bird` and `Jet` class are very different entities.
 *
 *      But because they implement `FlightEnabled`, we can treat them all as the same type, as something that
 *      flies, adn ignore the differences in the classes.
 *
 *  Interfaces allow us to type our objects differently, BY BEHAVIOUR ONLY.
 */
public class Bird extends Animal implements FlightEnabled, Trackable{
    @Override
    public void move() {
        System.out.println("Flaps swing");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is Taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is Landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying ");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s  coordinates recorded ");
    }
}
