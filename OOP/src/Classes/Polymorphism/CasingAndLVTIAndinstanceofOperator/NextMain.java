package Classes.Polymorphism.CasingAndLVTIAndinstanceofOperator;

import Classes.Polymorphism.Adventure;
import Classes.Polymorphism.Comedy;
import Classes.Polymorphism.Movie;
import Classes.Polymorphism.ScienceFiction;

/**
 *  Casting With Classes
 *
 *
 */
public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("C", "Clone Wars");
        movie.watchMovie();

        /**
         *  What is happening here?
         *
         *  We're trying to save assing jaws to a Movie class.
         *
         *  Now we now that when passsing an `A` as type in the `getMovie()` method
         *  it returns an instance of Adventure, but the IDE is not aware of this, So an
         *  error will be thrown because class Movie is not assignable to Adventure (Even though
         *  Movie is superclass of Adventure), if it was the other way now that is acceptable
         */
        Movie NewJaws = new Adventure("jaws"); // -> No Error whatsoever

        //Adventure jaws = Movie.getMovie("A", "jaws"); // -> Required: Adventure, Provided: Movie

        /**
         *
         * Now casting can help with this, casting Movie into Adventure now will give us a free compile
         * error code
         */
        Adventure jaws = (Adventure) Movie.getMovie("A", "jaws");

        /**
         * BUT what happens when type is not `A` but `C` for comedy,
         * no that will throw a runtime Error
         *
         *   Adventure jumanji = (Adventure) Movie.getMovie("C", "jumanji");
         *
         * class Classes.Polymorphism.Comedy cannot be cast to
         * class Classes.Polymorphism.Adventure (Classes.Polymorphism.Comedy and Classes.Polymorphism.Adventure)
         */

        /**
         * Assigning Movie to an Object is completely valid, Since you can assign any object
         * to a reference that is type Object
         */
        Object comedy = Movie.getMovie("C", "Airplane");

        /**
         * The downside is that the compiler is complaining now, since we assign comedy to Object.
         * Comedy has access to any of Object's methods but there is no `watchMovie()` method inside the
         * Object class
         *
         *  comedy.watchMovie(); // -> Cannot resolve method 'watchMovie' in 'Object'
         *
         * The compiler won't run the code to realize that comedy in fact has a `watchMovie()` method ( not since
         * we assign it to an Object class ) so it relays on Object to predict what methods are available to `comedy`
         *
         * now there's a tool that can help with this king of issues, the Local Variable Type Inference (LVIT)
         */


        /**
         * Local Variable Type Inference
         *
         * One of the benefits is to help with the readability of the code, and to reduce boilerplate code.
         *
         * It's called LVTI because:
         *
         *   - It can't be used in field declaration on a class.
         *   - It can't be used in method signatures, either as a parameter type or a return type.
         *   - It can't be used without an assignment, because the type can't be inferred in that case.
         *   - It can't be assigned a null literal, again because a type can't be inferred in that case.
         *
         * Var, is special contextual keyword in java, that lets our code take advantage of Local
         * Variable Type Inference
         */
        var varMovie = Movie.getMovie("C", "Dick & Jane");
        varMovie.watchMovie();

        var comedyMovie = new Comedy("Comedy");
        comedyMovie.watchMovie();

        /**
         *  Testing the runtime type
         */
        var unkownObject = Movie.getMovie("A", "Adventure Movie");

        if(unkownObject.getClass().getSimpleName() == "Comedy") {
            System.out.println("\n\nInstance of Comedy");
            Comedy c = (Comedy) unkownObject;
            c.watchMovie();
        } else if (unkownObject instanceof Adventure) {
            System.out.println("\n\nInstance of Adventure");
            ((Adventure) unkownObject).watchMovie();

            /**
             *  Pattern Matching for the instanceof Operator
             *
             *  if the JVM can identify that the object matches the type, it can extract data from the object,
             *  without casting.
             *
             *  for this operator, the object can be assigned to a binding variable, which here is called syfy.
             *
             *      unknownObject instanceof ScienceFiction syfy
             *
             *  the variable syfy (if the instanceof method returns true ) is already typed as ScienceFiction
             *  variable.
             */
        } else if(unkownObject instanceof ScienceFiction syfy) {
            System.out.println("\n\nInstance of Science Fiction");
            syfy.watchMovie();
        }
    }
}
