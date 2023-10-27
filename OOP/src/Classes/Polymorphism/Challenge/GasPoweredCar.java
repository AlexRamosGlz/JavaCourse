package Classes.Polymorphism.Challenge;

public class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas Power Car -> Engine Started");
    }

    @Override
    public void drive() {
        System.out.println("Gas Power Car Driving, type " + getClass().getSimpleName());
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas Power Car -> Engine Running");
    }
}
