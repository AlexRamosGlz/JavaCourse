package Classes.Composition;


/**
 *  Composition
 *
 *  Java DOES NOT allow multiple inheritance, so only one class can inherit from another class.
 *
 *  When inheriting takes place there is an IS relationship (a Personal Computer IS a Product), but
 *  composition makes a HAS relationship (a Personal Computer HAS a Monitor, Motherboard, Computer Case)
 *
 *  NOTE THAT:
 *
 *      - In Composition, both entities are dependent on each other.
 *      - When there's a Composition between two entities, the composed object cannot exist without
 *          the other entity.
 *      - Favour Composition over inheritance
 *
 *
 *  Why is composition preferred over inheritance in many designs?
 *
 *      - Composition is more flexible. You can add parts in, or remove them, and these
 *        changes are less likely to have a downstream effect.
 *
 *      - Composition provides functional reuse outside the class hierarchy, meaning classes
 *        can share attributes & behavior, by having similar components, instead of inheriting
 *        functionality from a parent base class.
 *
 *      - Java's inheritance breaks encapsulation, because subclasses may need direct access to
 *        a parent's state or behavior.
 */
public class PersonalComputer extends Product{


    /**
     * The Composition is achieved by using an instance variable that refers to other objects.
     */
    private ComputerCase computerCase; // <- instance variable of ComputerCase class
    private Monitor monitor;// <- instance variable of Monitor class
    private MotherBoard motherBoard;// <- instance variable of MotherBoard class

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "Yellow");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }
}
