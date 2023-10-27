package Classes.Polymorphism.Challenge;

public class Main {
    public static void main(String[] args) {
        Car genericCar = new Car("Brown Car");
        raceCar(genericCar);

        ElectricalCar tesla = new ElectricalCar("Red Tesla", 103, 7);
        raceCar(tesla);
    }

    public static void raceCar(Car car) {
        car.runEngine();
        car.drive();
        car.startEngine();
    }
}
