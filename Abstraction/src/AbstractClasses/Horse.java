package AbstractClasses;

/**
 * Horse has to implements both Mammal abstract methods and Animal (Mammal's superclass) abstract methods
 * in order to compile
 */
public class Horse extends Mammal{
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        super.move(speed);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in spring.");
    }

    @Override
    public void makeNoise() {
        System.out.println(getExplicitType() + " goes ");
    }
}
