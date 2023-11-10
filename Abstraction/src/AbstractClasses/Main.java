package AbstractClasses;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog =  new Dog("Wolf", "Big", 10.5);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(new Dog("German Shepard", "Big", 11));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Dog("Pitbull", "Big", 13));

        for(var animal: animals) {
            doAnimalStuff(animal);
        }
    }

    /**
     *  We've said that you can't create an instance of an Animal, because it's abstract.
     *
     *  BUT that doesn't prevent us from using that type in methods, declarations and Lists.
     *
     *  The abstract class told the world that animals move and make noise, so anyone can use an Animal class, and call those
     *  methods on the object that it gets at runtime. And regardless of what that object is, as long as it's an Animal, meaning
     *  it has the Animal class in its hierarchy, this code will continue to work.
     */
    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
