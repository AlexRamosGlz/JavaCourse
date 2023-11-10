package AbstractClasses;

/**
 * An abstract class that extends another abstract class has some flexibility.
 *
 *  - it can implement all the parent's abstract methods
 *  - it can implement some of them
 *  - Or it can implement none of them
 *  - it can also include additional abstract methods, which will force subclasses to implement
 *    both Animal's abstract methods and Mammal's
 *
 */
abstract public class Mammal extends Animal {
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType());
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}
