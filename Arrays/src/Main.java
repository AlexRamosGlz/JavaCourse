import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /**
         * An Array is NOT resizeable
         *
         * the size of an array, once created, is fixed. in this case, integerArray will have 10 elements.
         *
         * You CAN'T add or delete elements, we can only assign values to one of the ten elements in
         * this array, in this example.
         */
         int[] integerArray =  new int[10];

        // integerArray[10] = 1; // -> Error: Index 10 out of bounds for length 10

        for(int i = 0; i < integerArray.length; i++) {
            integerArray[i] = integerArray.length - i;
        }

        /**
         * The Enhanced For Loop, the For Each loop
         *
         * it processes one element at a time, from the first element to the last.
         */
        for(int element : integerArray) {
            System.out.print(element + " "); // prints -> 10 9 8 7 6 5 4 3 2 1
        }

        /**
         * now Array is just a special Java class but `integerArray`
         * only uses `Object` methods, it doesn't override them.
         *
         *      System.out.println(integerArray); prints -> [I@3d075dc0
         *
         * We would have expected that it prints [10, 9, ..., 1], since we know
         * that `integerArray` calls the `toString()` method from the base class `Object`
         * but as we said before, `integerArray` does NOT override it.
         *
         * However, Java does provide a helper class.
         */

        /**
         * Java.util.Arrays
         *
         * Is a helper class that provides common functionality you'd want for many array operations.
         *
         * These are static method on Arrays, so ARE class methods, NOT instance methods.
         */
        System.out.println(Arrays.toString(integerArray)); // prints -> [10, 9, 8, 7, 6, 5, 4, 3, 2, 1], how would've expected

        /**
         *  Arrays ARE Objects
         *
         *  One thing, you should know, is that you can assign any arry to an
         *  Object variable
         */
        Object objectVariable = integerArray;


        if(objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array!"); // prints -> objectVariable is really an int array!
        }

        // You can even create an array of Objects that supports any kind of type.
        Object[] objectArray = new Object[4];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("Hello world");
        objectArray[2] = 1;
        //Nested Array
        objectArray[3] = integerArray;

        testingJavaUtilArray();
    }

    public static void testingJavaUtilArray() {
        /**
         * Arrays helper class has a lot of useful methods, and we are
         * going to put to test some of them.
         */
        int[] firstArray = generateRandomArray(10);
        System.out.println(Arrays.toString(firstArray) + " Unsorted");
        // Sort the provided array into ascending numerical order
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray) + " Sorted");

        int[] secondArray = generateRandomArray(10);
        System.out.println(Arrays.toString(secondArray));
        // Assigns the specified int value to each element of the specified array of ints.
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        //Challenge
        int[] ascendingSort = bubbleSort(generateRandomArray(5), "asceing");
        System.out.println(Arrays.toString(ascendingSort));

        int[] descendingSort = bubbleSort(generateRandomArray(5), "descenden");
        System.out.println(Arrays.toString(descendingSort));
    }

    public static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for(int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    public static int[] bubbleSort(int[] array, String order) {

        for (int i = 0; i < array.length - 1; i ++) {
            for (int j = i; j < array.length - i - 1; j++) {
                if(order.toLowerCase().startsWith("as")) {
                    if(array[j] > array[j + 1]) {
                        int temp = array[j+1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }

                if(order.toLowerCase().startsWith("des")) {
                    if(array[j] < array[j + 1]) {
                        int temp = array[j+1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        return array;
    }
}