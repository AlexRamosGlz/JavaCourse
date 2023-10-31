package TwoDimensionalArrays;

import java.util.Arrays;

public class NestedArray {
    public static void main(String[] args) {
        /**
         *  Nested Arrays
         *
         *  An Array element can actually be an array. it's known as a nested array,
         *  or an array assigned to an outer array's element.
         */

        // Initialization of an 3 x 3 array with a 0 as the default value of all elements
        int[][] intArray = new int[3][3];

        /**
         *  `Arrays.deepToString()` is used instead of just calling `Arrays.toString`
         *
         *      System.out.println(Arrays.toString(intArray)); -> [[I@65ab7765, [I@1b28cdfa, [I@eed1f14]
         *
         *  `Arrays.toString()` does NOT unfold the nested array, that's what `deepToString()` is for.
         */
        System.out.println(Arrays.deepToString(intArray)); // prints -> [[0, 0, 0], [0, 0, 0], [0, 0, 0]]


        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                intArray[i][j] = i * 10 + (j + 1);
            }
        }

        System.out.println(Arrays.deepToString(intArray)); // prints -> [[1, 2, 3], [11, 12, 13], [21, 22, 23]]

        /**
         *  this is another way to initialize a nestedArray
         *
         *  NOTE that a 2-dimensional array doesn't have to be a uniform matrix.
         *
         *  this means the nested array can be different sizes, as we show with this next initialization
         *  statement.
         */
        int[][] newArray = {{1,2,3}, {1,3}, {1}};

        System.out.println(Arrays.deepToString(newArray)); // prints -> [[1, 2, 3], [1, 3], [1]]
    }
}
