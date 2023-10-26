package Classes.Encapsulation;

/**
 * Encapsulation protects the members of the class, and some methods, from external access.
 *
 * This prevents calling code from bypassing the rules and constraints, we've
 * built into the class.
 */
public class SecurePlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public SecurePlayer(String name) {
        this(name, 100, "Sword");
    }

    /**
     *  When we create a new instance, it's initialized with valid data
     *
     *  We're also making sure that there's no direct access to the fields.
     */

    public SecurePlayer(String name, int healthPercentage, String weapon) {
        this.fullName = name;
        this.weapon = weapon;

        if(healthPercentage <= 0) {
            this.healthPercentage = 1;
        }else if(healthPercentage > 100) {
            this.healthPercentage = 100;
        } else this.healthPercentage = healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;

        if(healthPercentage <= 0) System.out.println("Player knocked out of game");
    }

    public int healthRemaning() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;

        if(healthPercentage > 100 ) {
            System.out.println("Player restored to %100");
            healthPercentage = 100;
        }
    }
}
