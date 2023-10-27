package Classes.Polymorphism.Challenge;

public class Car {
    private String description;

    Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> Start Engine");
    }

    public void drive() {
        System.out.println("Car Driving, type " + getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

}
