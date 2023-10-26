package Classes.Polymorphism;

/**
 * Polymorphism
 *
 * Polymorphism lets us write code to call a method, but at runtime, this method's behavior
 * can be different, for different objects
 *
 * this means the behavior that occurs, while the program is executing, depends on the
 * runtime type of the object. And the runtime type might be DIFFERENT from the declared
 * type in the code
 *
 * Polymorphism enables you to write generic code, based on the base class, or a parent class. And
 * this code, in the main method, is extendable, meaning it doesn't have to change, as new subclasses
 * become available
 */
public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    /**
     * `watchMovie()` is declared inside the superclass `Movie` so all
     *  of its subclasses (Comedy, Adventure, ScienceFiction, ...) can inherit and
     *  use this method ( and even maybe change the behavior )
     */
    public void watchMovie() {
        String instanceType =  this.getClass().getSimpleName();
        System.out.println(title + "is a " + instanceType + " film");
    }

    /**
     * Factory Method
     *
     * This is special method that return different products based on the current Configuration
     *
     * Factory methods give us a way to get an object, without having to know the details of how
     * to create a new one, or specify the exact class we want.
     *
     * `getMovie` creates different instances of Movie based on the inputs
     *  the method receives.
     */
    public static Movie getMovie( String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            default -> new Movie(title);
            case 'S' -> new ScienceFiction(title);
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
        };
    }
}
