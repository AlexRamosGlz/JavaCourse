package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"Apples", "Bananas", "Milk", "Eggs"};

        /**
         *   the structure to create a list is the following
         *
         *      List<type> nameOfVariable = List.of(...items);
         *
         *   `List.of(...items)` creates an immutable List of the provided type.
         */
        List<String> list = List.of(items);


        /**
         *  `list` is immutable, therefore the add method is not usable here
         *
         *      list.add("yogurt"); -> ERROR: UnsupportedOperationException
         */
        System.out.println(list); // prints -> [Apples, Bananas, Milk, Eggs]


        /**
         *      new ArrayList<>(collection)
         *
         *  Constructs a list containing the elements of the specified collection, in the order
         *  they are returned by the collection's iterator.
         */
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt"); // now the add method is usable

        // this is another way to convert a List to an ArrayList
        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        // concat an entire collection of the same type
        groceries.addAll(nextList);
        System.out.println(groceries);

        // get an element from the provided index
        System.out.println("Third item = " + groceries.get(2));

        // returns a true if contains the provided element
        if(groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }

        // Removes the first occurrence of the specified element from this list, if it is present.
        groceries.remove("Yogurt");
        System.out.println(groceries);

        // Removes from this list all of its elements that are contained in the specified collection.
        groceries.removeAll(List.of("Apples", "Eggs"));
        System.out.println(groceries);

        // Retains only the elements in this list that are contained in the specified collection.
        groceries.retainAll(List.of("Apples", "Milk", "mustard", "cheese"));
        System.out.println(groceries);

        // Removes all the elements from this list.
        groceries.clear();
        System.out.println(groceries);

        /**
         * `Arrays.asList(collection)`
         *
         *  Returns a fixed-size list backed by the specified array.
         *
         *  Note that any change made to the List, IS a change to the array that backs it.
         */
        groceries.addAll(Arrays.asList("Eggs", "pickles", "Mustard", "Ham"));
        System.out.println(groceries);


    }
}
