package Classes.Encapsulation;

/**
 *  This is an example of an unsecure ( all public ) class.
 *
 *  Problems with non-secured classes:
 *
 *      1 - Allowing direct access to data on an object, can potentially bypass checks, and
 *          additional processing, your class has in place to manage the data.
 *
 *      2 - It encourages an interdependency, or coupling, between the calling code and the class
 *
 */
public class NonSecurePlayer {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;

        if(health <= 0) System.out.println("Player knocked out of game");
    }

    public int healthRemaning() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;

        if(health > 100 ) {
            System.out.println("Player restored to %100");
            health = 100;
        }
    }
}
