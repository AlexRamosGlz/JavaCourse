package Classes.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog("Dog", "Medium", 60, "Pointy", "Pointy");

        /**
         * We can pass a subclass instance to any method that takes a
         * superclass instance
         *
         * Since Dog is a subclass of Animal, Dog is allowed as paremeter in doAnimalStuff()
         * function
         */
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
