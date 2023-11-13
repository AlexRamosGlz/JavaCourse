package Interfaces;

public class Satellite implements OrbitEarth{

    FlightStages stage = FlightStages.GROUNDED;

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void achieveOrbit() {
        System.out.println("Orbit achieved");
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}


/**
 *  Records and Enums CAN also implement interfaces
 *
 */
enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;


    @Override
    public void track() {

        if(this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}

record DragonFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
