package Classes.Encapsulation;

public class Main {
    public static void main(String[] args) {
        NonSecurePlayer nonSecurePlayer = new NonSecurePlayer();
        /**
         *  Anyone can access `nonSecurePlayer` methods and fields,
         *  this could lead to errors.
         */
        nonSecurePlayer.health = 20;
        nonSecurePlayer.name = "Alex";
        nonSecurePlayer.weapon = "Sword";

        int damage = 10;
        nonSecurePlayer.loseHealth(damage);
        System.out.println("Remaining health = " + nonSecurePlayer.healthRemaning());

        /**
         * this lines bypasses the method `restoredHealth` that says that no player
         * can have more than 100 health.
         */
        nonSecurePlayer.health = 200;

        nonSecurePlayer.loseHealth(11);
        System.out.println("Remaining health = " + nonSecurePlayer.healthRemaning());

        // ::::::::::::::::::::::::::::::: Secure Player ::::::::::::::::::::::::::::::
        SecurePlayer player =  new SecurePlayer("Alex");
        System.out.println("Initial health is " + player.healthRemaning());

    }
}
