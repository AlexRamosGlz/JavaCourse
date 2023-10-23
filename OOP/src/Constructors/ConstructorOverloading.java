package Constructors;
import java.util.ArrayList;
/**
 *  Constructor overloading is declaring multiple constructors,
 *  with different parameters
 */
public class ConstructorOverloading {
    public int field1;
    public int field2;
    public int field3;

    /**
     *  The number of parameters can be different between constructors. Or if
     *  the number of parameters is the same, the types or order of types must differ.
     */
    public ConstructorOverloading() {
        /**
         *  Constructor Chaining
         *
         *  Constructor Chaining is when one constructor explicitly calls
         *  another overloaded constructor.
         *
         *  You can call a constructor ONLY from another constructor.
         *  Ypu must use the special statement `this();` to execute another constructor
         *  passing it arguments if required
         */
        this(123, 123, 123); // `this()` must be the first executable statement if it's used from another constructor
        System.out.println("Chaining Constructor");
    }

    /**
     * The default constructor calls the Major Constructor ( the one that has more parameters than the others ) through
     *  the `this()` call
     *
     */
    public ConstructorOverloading(int field1, int field2, int field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public int getFields() {
       return field1;
    }
}
