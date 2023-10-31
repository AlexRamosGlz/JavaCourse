package ReferenceTypeVSValueTypes;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        /**
         * Reference
         *
         * When you assing an object to a variable, the variable becomes a reference to that
         * object.
         *
         * this is true of arrays, but the array has yet another level of indirection, if it's
         * an array of objects.
         *
         * this means every array element is also a reference.
         */

        // create a new int array object and then we store the reference at myIntArray
        int[] myIntArray = new int[5];

        // anotherArray is initiated and it stores myIntArray (which is the reference to an array)
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // prints -> myIntArray = [0, 0, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // prints -> anotherArray = [0, 0, 0, 0, 0]

        // anotherArray is updated,and becuase anotherArray and myIntArray are
        // references to an int Array myIntArray is updated as well
        anotherArray[0] = 1;

        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray)); // prints -> After change myIntArray = [1, 0, 0, 0, 0]
        System.out.println("After change anotherIntArray = " + Arrays.toString(anotherArray)); // prints -> After change anotherIntArray = [1, 0, 0, 0, 0]

        // ::::::::::::::::::::::::::::::: VarArgs ::::::::::::::::::::::::::::::::::::::::::::::

        printList("hola", "mundo"); // prints -> hola (\n) mundo
        printList("hola"); // prints -> hola

        String[] stringArray = {"Hola", "Mundo", "Nuevamente"};
        printList(stringArray); // prints -> Hola (\n) Mundo (\n) Nuevamente
    }

    /**
     * Variable Arguments (Vararg)
     *
     * this is a special designation for java, that means, Java will take ZERO, ONE, or MANY strings,
     * as arguments to this method, and create an array with which to process them, in the method.
     *
     * there can be ONLY one variable argument in a method. And the variable argument must be the last argument
     *
     *     public void someMethod(int... intArray, String message) {....} -> ERROR Vararg parameter must be the last in the list
     */
    private static void printList(String... list) {
        for(String item : list) {
            System.out.println(item);
        }
    }
}
