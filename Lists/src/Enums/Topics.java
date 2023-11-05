package Enums;

/**
 *  Enums can also have methods
 *
 *  this to expand the capability of the enum and it's constants
 */
public enum Topics {

    TOMATO, POTATO, SALAMI, HAM;

    public int getPrice() {

        return switch (this) {
            case HAM -> 1;
            case POTATO -> 2;
            case SALAMI -> 3;
            case TOMATO -> 4;
            default -> 5;
        };
    }
}
