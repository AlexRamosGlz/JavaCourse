package LinkedList;


import java.util.LinkedList;

/**
 *  LinkedList
 *
 *  the LinkedList is not indexed at all. there is no array storing the addresses in a neat ordered way, as we saw
 *  with the ArrayList.
 *
 *  <p>INSTEAD, each element that's added to a linked list, forms a chain, and the chain has links to
 *  the previous element and the next element</p>
 *
 *  <p>To find an element, we'd need to start at the head or tail, and check if the element matches, or keep
 *  track of the number of elements traversed, if we are matching by an index, because the index isn't
 *  stored as part of the list.</p>
 *
 *      <pre>      For Example, even ig you know, you want to find the 5th element, you'd still have to traverse the chain this way, to get the fifth element.</pre>
 *
 *  <p>this type of retrieval is considered expensive in computer currency, which is processing time and memory
 *  usage.</p>
 *
 *      <pre>       On the other hand, inserting and removing an element,is much simpler for this type of collection.</pre>
 *
 *  <p>So for a LinkedList, inserting and removing elements, is generally considered cheap in computer currency,
 *  compared to doing these functions in an ArrayList</p><p></p>
 *
 *  <h3>When To use LinkedList and ArrayList</h3>
 *
 *  <p>the <strong>ArrayList</strong> is usally the better default choice for a List, spceially if the List is used
 *  predominantly for storing and reading data.</p>
 *
 *  <p>if you know the maximum number of possible items, then it's probably better to use an ArrayList, but set it's
 *  capacity</p>
 *
 *       <pre>       An ArrayList's index is an int type, so an ArrayList's capacity is limited to the maximum
 *  number of elements an int can hold. <i>integer.MAX_VALUE = 2,147,483,647</i></></pre>
 *
 *  <p>You may want to consider using a Linked list if you're adding and processing or manipulating large amount
 *  of elements, adn the maximum elements isn't known, but may be great or if you number may exceed <i>integer.MAX_VALUE</i>
 *  </p>
 *
 *  Declarations
 *
 *  1. var variableName = new LinkedList<type>();
 *
 *  2. LinkedList<type> variableName = new LinkedList<>();
 *
 */
public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();

        // Appends the specified element to the end of this list.
        placesToVisit.add("Sydney");

        // Inserts the specified element at the specified position in this list.
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        //removeElements(placesToVisit);

        Iterator.printItinerary(placesToVisit);
        Iterator.testIterator(placesToVisit);
    }

    public static void addMoreElements(LinkedList<String> list) {

        // Inserts the specified element at the beginning of this list.
        list.addFirst("Darwin");

        // Appends the specified element to the end of this list.
        list.addLast("Hobart");
        System.out.println(list);

        // Queue methods

            // Adds the specified element as the tail (last element) of this list.
            list.offer("Melbourne");

            // Inserts the specified element at the front of this list.
            list.offerFirst("Brisbane");

            // Inserts the specified element at the end of this list.
            list.offerLast("Toowoomba");
            System.out.println(list);

        // Stack methods

            // Pushes an element onto the stack represented by this list.
            list.push("Alice Springs");
            System.out.println(list);
    }

    public static void removeElements(LinkedList<String> list) {

        // Removes the element at the specified position in this list.
        list.remove(4);

        // Removes the first occurrence of the specified element from this list, if it is present.
        list.remove("Brisbane");

        System.out.println(list);
        // Retrieves and removes the head (first element) of this list.
        String s1 =  list.remove();
        System.out.println(s1 + " was removed");

        // Removes and returns the first element from this list.
        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        // Removes and returns the last element from this list.
        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        // Queue/Deque poll methods

            // Retrieves and removes the head (first element) of this list.
            String p1 = list.poll();
            System.out.println(p1 + " was removed");

            // Retrieves and removes the first element of this list, or returns null if this list is empty.
            String p2 = list.pollFirst();
            System.out.println(p2 + " was removed");

            // Retrieves and removes the last element of this list, or returns null if this list is empty.
            String p3 = list.pollLast();
            System.out.println(p3 + " was removed");

            System.out.println(list);

            list.push("Sydney");
            list.push("Brisbane");
            list.push("Canberra");
            System.out.println(list);

            // Pops an element from the stack represented by this list.
            String p4 = list.pop();
            System.out.println(p4 + " was removed");
    }

    public static void gettingElements(LinkedList<String> list) {

        // Returns the element at the specified position in this list.
        System.out.println("Retrieve Element =" + list.get(4));

        // Returns the first element in this list.
        System.out.println("First Element =" + list.getFirst());

        // Returns the last element in this list.
        System.out.println("Last Element =" + list.getLast());

        // Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));

        // Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        // Queue retrieval method

            // Retrieves, but does not remove, the head (first element) of this list.
            System.out.println("Element from element() = " + list.element());

        // Stack retrieval methods

            // Retrieves, but does not remove, the head (first element) of this list.
            System.out.println("Element from peek() = " + list.peek());

            // Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
            System.out.println("Element from peekFirst() = " + list.peekFirst());

            // Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
            System.out.println("Element from peeklast() = " + list.peekLast());
    }

}
