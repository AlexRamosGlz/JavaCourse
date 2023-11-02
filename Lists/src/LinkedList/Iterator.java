package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Iterator And ListIterator
 *
 * So far, we've mainly used for loops to traverse, or step through elements, in an array
 * or list.
 *
 * We can use the traditional for loop and index, to index into a list.
 *
 * We can use the enhanced for loop and a collection, to step through the elements, one at a time.
 *
 * But Java provides another means to traverse lists. Two alternatives are the iterator, and the ListIterator.
 *
 * Declaration:
 *
 *  1 ListIterator<Type> listName = listName.listIterator();
 *
 *  2 var listName = listName.listIterator();
 *
 *  this is the same to Iterator
 */
public class Iterator {

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip start at " + list.getFirst());

        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);

        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void testIterator(LinkedList<String> list) {

        /**
         * Iterator
         *
         * When ou get an instance of an iterator, you can call the next method, to get the next element in
         * the list.
         *
         * You can use the hasNext method, to check if any elements remain to be processed.
         */
        var iterator = list.iterator();

        // while `hasNext()` is true keep looping
        while(iterator.hasNext()) {

            // You can use some operators inside the loop with the instanced of the iterator
            if(iterator.next().equals("brisbane")) {

                // Also you can use `remove()` to remove an element in the list
                iterator.remove();

                list.remove();
            }
        }

        /**
         * ListIterator
         *
         * ListIterator has the same method `remove()`, but also add and set methods are at your disposal. And
         * all those methods are available while looping
         *
         *  Note that if these methods are called by the list itself, a runtime error will occur.
         *
         *  list.add(Object); -> Error: ConcurrentModificationException
         *
         *  this because ListIterator provides a safe way to remove, add, set elements, while still iterating
         *  through the list. so it's important, to make sure you're calling the method on the iterator object
         *
         *  the main difference between ListIterator and Iterator is the ability to travel forward and backward,
         *  where the Iterator does NOT have the ability to do this.
         *
         */
        ListIterator<String> listIterator = list.listIterator(1);

        // while hasNext() keep looping
        while (listIterator.hasNext()) {

            //operations are available as well
            if(listIterator.next().equals("Sydney")) {

                // remove() is available
                listIterator.remove();
            }

            // Add method is available too (where on iterator  is not)
            listIterator.add("London");
        }

        /**
         * NOTE this code block does not run because there is no next element remaining
         *
         * you can't loop an iterator once the iteration is over, a new iterator is needed
         *
         * or use an ListIterator an go backwards with the `hasPrevious()` method
         */
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Going backwards
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
