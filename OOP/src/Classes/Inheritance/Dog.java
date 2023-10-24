package Classes.Inheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(String type, String size, double weight, String earShape, String tailShape) {

        /**
         *  Super is a special keyword that calls the superclass constructor
         *
         *  if your super class doesn't have a default constructor, then you must explicitly call super()
         *  in all of your constructors, passing the right arguments to that constructor
         *
         *
         *  `Super()` is a lot like `this()`. Like `this()`, it has to be the first statement of the constructor.
         *  Because of that rule, `this()` and `super()` CAN NEVER be called from the same constructor
         */
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void bark() {

    }

    public void run() {

    }

    public void walk() {

    }

    public void wagTail() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
