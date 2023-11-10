package AbstractClasses;

/**
 *  Generalization
 *
 *      When you start modeling object for your application, you start by identifying what features and behavior your objects
 *      have in common
 *
 *      We generalize when we create a class hierarchy.
 *
 *      A base class is the most general class, the most basic building block, which everything can be said to have in common.
 *
 *  Abstraction
 *
 *      Part of generalizing is using abstraction. You can generalize a set of characteristics and behavior into an abstract type.
 *
 *      Abstraction simplifies the view of a set of items traits and behavior, so we can talk about them as a group,
 *      as well as generalize their functionality
 *
 *  Java supports abstraction in several different ways.
 *
 *      - Java allows us to create a class hierarchy, where the top of the hierarchy, the base class, is usually an abstract concept,
 *        whether it's an abstract class or not.
 *
 *      - Java lets us create abstract classes.
 *
 *      - Java gives us a way to create interfaces
 *
 *  Method Modifiers
 *
 *      `abstract` - When you declare a method abstract, a method body is always omitted. Can only be declared on an abstract class
 *                   or interface.
 *
 *      `static`   - Sometimes called a class method, rather than an instance method, because it's called directly on the
 *                   class instance.
 *
 *      `final` - A method that is final cannot be overridden by subclasses.
 */

/**
 * Abstract Classes
 *
 * declaration:
 *
 *      `abstract class Animal {}`
 *
 *  An abstract class is a class that's incomplete. You CAN'T create an instance of an abstract class.
 *
 *      `Animal animal = new Animal();` -> Compile Error: 'Animal' is abstract; cannot be instantiated
 *
 *  An abstract class can still have a constructor, which will be created by its subclasses, during their construction.
 *
 *  An abstract class's purpose, is to define the behavior it's subclasses are required to have, so it always participate
 *  in inheritance.
 *
 *  A class that extends an abstract class, can also be abstract itself.
 *
 *      `abstract Mammal extends Animal {}`
 *
 *  And finally an abstract class can extend a concrete class.
 *
 *      `abstract class BestOfBreed extends Dog {}`
 */

abstract public class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    /**
     *  Abstract Method
     *
     *  An abstract method is declared with the modifier abstract.
     *
     *     `public abstrcat void move();`
     *
     *  Any code that uses a subtype of Animal, knows it can call the move method, and the subtype will implement this
     *  method with this signature.
     *
     *  the subclasses WON'T compile if it doesn't implement the abstract methods.
     */
    public abstract void move(String speed);

    public abstract void makeNoise();
}
