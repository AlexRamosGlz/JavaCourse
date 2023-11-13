package Interfaces;

public class Test {
    public static void main(String[] args) {
    orbit(new Satellite());
    }

    private static void orbit(OrbitEarth flier) {
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
