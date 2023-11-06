package AbstractClasses;

/**
 * The abstract class can make subclasses follow its rules.
 *
 * Truthfully any parent can, but an abstract class never gets instantiated, so you have more freedom in building the rules
 * on this kind of class. And Well-behaved classes are a good idea.
 */
public class Dog extends Animal {

    public Dog(String type, String size, String weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {

    }
}
