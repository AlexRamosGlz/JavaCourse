package Interfaces;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();

        /**
         * A bird (since it implements both interfaces and extends the Animal class) can be
         * referred to, by this 3 different types.
         */
        Animal animal = bird;
        Trackable tracked = bird;
        FlightEnabled flier = bird;

//        animal.move();
//
//        flier.fly();
//        flier.land();
//        flier.takeOff();
//
//        tracked.track();
        inFlight(flier);
        inFlight(new Jet());

        double kmsTraveled = 100;
        double milesTraveleled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("Truck traveled %.2f kms or %.2f miles", kmsTraveled, milesTraveleled);
    }

    public static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();

        if(flier instanceof Trackable tracker) {
            tracker.track();
        }

        flier.land();
    }
}

