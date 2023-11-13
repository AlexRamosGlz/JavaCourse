package Interfaces;


/**
 * Interface
 *
 * An interface is similar to an abstract class, although it isn't a class at all.
 *
 * it's a special type, that's more like a contract between the class and the client code, that the
 * compiler enforces.
 *
 * The class whose implementing the interface MUST implements all of its methods.
 *
 * An interface lets classes that might have little else in common, be recognized as special reference
 * type.
 *
 * An interface is usually named, according to the set of behaviors it describes.
 *
 *      Many interfaces will en in 'able', like `Comparable`, and `Iterable`, again meaning something
 *      is capable, or can do, a given set of behaviors.
 */
public interface FlightEnabled {

    /**
     *  Fields in Interfaces
     *
     *  a field declared in an interface is always public, static and final
     *
     *  Note that an interface never get instantiated so this fields are NOT instance fields
     */
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = .6213;

    /**
     * public and abstract modifiers are redundant inside interfaces
     */
    public abstract void takeOff();
    abstract void land();
    void fly();

    /**
     *  The Extension Method (default method)
     *
     *  Adding a default method doesn't break any classes currently implementing the interface
     *
     *  It's a lot like a method on a superclass, because we can override it.
     *
     *  it commonly used when there's new methods to add to the interface, and you don't want to break all the classes
     *  that are currently implementing the interface
     *
     *  Overriding a default method
     *
     *  So like overrifing a method on a class, you have three choices.
     *
     *          - You can choose not to override it at all.
     *          - You can override the method and write code for it, so that the interface method isn't executed.
     *          - Or you can write your own code, and invoke the method on the interface, as part of your implementation.
     */
    default FlightStages transition(FlightStages stage) {
        System.out.println("Transition no implementend on " + getClass().getName());
        return null;
    }


}
