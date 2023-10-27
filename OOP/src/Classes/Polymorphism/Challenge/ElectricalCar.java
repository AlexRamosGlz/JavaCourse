package Classes.Polymorphism.Challenge;

public class ElectricalCar extends Car{
    private double avgKmPerCharge;
    private double batterySize = 4;

    public ElectricalCar(String description, double avgKmPerCharge, double batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric Car -> Engine Started");
    }

    @Override
    public void drive() {
        System.out.println("Electric Car Driving, type " + getClass().getSimpleName());
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric Car -> Engine Running");
    }
}
