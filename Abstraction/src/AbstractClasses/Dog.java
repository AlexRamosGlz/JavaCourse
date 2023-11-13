package AbstractClasses;

/**
 * The abstract class can make subclasses follow its rules.
 *
 * Truthfully any parent can, but an abstract class never gets instantiated, so you have more freedom in building the rules
 * on this kind of class. And Well-behaved classes are a good idea.
 */
public class Dog extends Mammal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "slow") {
            System.out.println(getExplicitType() + " Walking");
        } else  {
            System.out.println(getExplicitType() + " Running!");
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

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds hair all the time!");
    }
}
