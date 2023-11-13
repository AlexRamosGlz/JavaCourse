package Interfaces;

public class Jet implements Trackable, FlightEnabled{
    
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is Taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is Landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying ");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s  coordinates recorded ");
    }
}
