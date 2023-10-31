package ArrayLists;


import java.util.ArrayList;
import java.util.Arrays;

/**
 *  Java Arrays VS List
 *
 *  Array:
 *      An Array is mutable, and we saw that we could set or change values in the
 *      array, but we could not resize it.
 *
 *  Java gives us several classes that let us add and remove items, and resize a sequence of elements.
 *
 *  These classes are said to implement a List's behavior.
 *
 *  List:
 *      A List is a special type in Java, called an interface, a List interface describes a set of method signatures,
 *      that all List classes are expected to have.
 *
 *      List DOES have the ability to resize among other behaviors.
 *
 *  ArrayList:
 *
 *  The ArrayList is a class, that really maintains an array in memory. It keeps track of the capacity, which is
 *  the actual size of the array in memory.
 *
 *  But it also keeps track of the elements that have benn assigned or set, which is the size of the ArrayList. As elements
 *  are added to an ArrayList, its capacity may need to grow. This all happens automatically, behind the scenes.
 *
 *  This is why the ArrayList IS resizeable
 */
public class ArrayLists {
    public static void main(String[] args) {
        /**
         * We know that Object arrays can store every type in Java
         *
         * this is not a good practice because there is no strict typing
         *
         * this means an Object array can contain different types ( although in some point could
         * be needed) when the Array needs to have only one type.
         */
        Object[] groceryArray = new Object[3];

        // Record `GroceryItem` are the element arrays
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("PS5", "WHISLIST", 1);
        // a String is stored as well, which is not a good practice
        groceryArray[2] = "Eggs";

        System.out.println(Arrays.deepToString(groceryArray)); // prints -> [GroceryItem[name=Milk, type=DAIRY, count=1], GroceryItem[name=PS5, type=WHISLIST, count=1], Eggs]


        /**
         *  ArrayList declaration has the following structure
         *
         *      ArrayList<type> nameOfVariable = new ArraList<type ? ' '>();
         *
         *  NOTE that type is enclosure by `<>` and on the left side of the operator is optional
         *  to type down the ArrayList type. And also there is no initial size specified.
         *
         *
         *  Now this is how we can implement strict typing to an ArrayList
         *
         *  now ObjectList is strictly a `GroceryItem` Array List.
         */
        ArrayList<GroceryItem> objectList =  new ArrayList<>();
        objectList.add(new GroceryItem("Ham", "DAILY", 1));

        /**
         *  Although the item at 0 groceryArray index is an instance of the `GroceryItem` Record,
         *  all groceryArray items are of type Object therefore a compiler error will pop out.
         *
         *      objectList.add(groceryArray[0]); -> Error: Required type: GroceryItem, Provided: Object
         *
         *  Same thin will happen if to a String type
         *
         *      objectList.add("String"); -> Error: Required type: GroceryItem, Provided: String
         */

        objectList.add(new GroceryItem("PS5", "WHISLIST", 1));
    }
}
