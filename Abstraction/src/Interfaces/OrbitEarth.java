package Interfaces;

/**
 * Interfaces can be extended, similar to classes, using the extends keyword.
 *
 *      this interface requires all classes to implement both the `OrbitEarth` and `FlightEnabled` interface.
 *
 * Unlike a class, an interface can use the `extends` expression with multiple interfaces
 */
public interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();

    /**
     *  JDK 9 gave us private methods, both static and not static.
     *
     *  This enhancement primarily addresses the problem of re-use code, within concrete methods on an interface.
     *
     *  A private static method can be accessed by either a public static method, a default method, or a private non-static method.
     *
     *  A private static non-static method is used to support default methods, and other private methods.
     */
    private static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description) {
        description = stage + ":" + description;
        OrbitEarth.log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning transition to " + nextStage);
        return nextStage;
    }
}
