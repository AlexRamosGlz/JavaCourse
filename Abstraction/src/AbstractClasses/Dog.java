package AbstractClasses;

/**
 * The abstract class can make subclasses follow its rules.
 *
 * Truthfully any parent can, but an abstract class never gets instantiated, so you have more freedom in building the rules
 * on this kind of class. And Well-behaved classes are a good idea.
 */
public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "slow") {
            System.out.println(type + " Walking");
        } else  {
            System.out.println(type + " Running!");
        }
    }

    @Override
    public void makeNoise() {
        if(type == "Wolf") {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof!");
        }
    }
}
