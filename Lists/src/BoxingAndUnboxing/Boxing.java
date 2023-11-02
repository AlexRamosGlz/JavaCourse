package BoxingAndUnboxing;


/**
 * Boxing
 *
 * Some OO languages, don't support any primitive types at all, meaning everything is an object.
 *
 * We know we can create objects, with primitive data types as field types, for example,
 * and we can also return primitive types from methods.
 *
 * But when we look at classes like the ArrayList, or the LinkedList, these classes don't support
 * primitive data types, as the collection type.
 *
 *      LinkedList<int> myIntegers = new LinkedList<>(); -> we can't do this, ERROR: Type argument cannot be of primitive type
 *
 * this means, we can't use all the great functions List provide, with primitive values.
 *
 * BUT java, gives us wrapper, which is called boxing,or a wrapper to a primitive, which is called unboxing.
 *
 * What is Boxing?
 *
 * A primitive is boxed, or wrapped, in a containing class, whose main data is the primitive.
 *
 * Each primitive data type has a wrapper class. Each wrapper type boxes a specific primitive value.
 */
public class Boxing {

    /**
     *  How to Box ?
     *
     *  Manually Boxing
     *
     *  Each wrapper has a static overloaded factory method, `valueOf()`, which takes a primitive,
     *  and returns an instance of the wrapper class.
     */
     Integer boxedInt = Integer.valueOf(15); // warning -> Unnecessary boxing

    /**
     *  Autoboxing
     *
     *  Underneat the covers, Java is doing the boxing. In other words, an instance of the Integer
     *  is created, and it's value is set to 15
     */
    Integer newBoxedInt = 15;


    /**
     * Unboxing
     *
     * Every wrapper class supports a method to return the primitive value it contains. this is called
     * unboxing.
     */
    int unboxedInt = newBoxedInt.intValue(); // Manually unboxing

    int autoUnboxing = newBoxedInt; // Auto unboxing
}
