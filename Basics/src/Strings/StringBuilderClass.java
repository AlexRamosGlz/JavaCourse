package Strings;

public class StringBuilderClass {

    public void mainMocker() {

        /**
         *  String is an immutable class, this means that each of its methods call returns an
         *  instance of a string
         *
         *  As an Alternative, Java provides a mutable class that let us change its text value.
         *
         *  There are four ways to create a new StringBuilder object, using the new keyword:
         *
         *      Pass a String.
         *      Pass no arguments at all.
         *      Pass an integer value.
         *      Pass some other type of character sequence (like StringBuilder).
         */
        StringBuilder stringBuilder1 = new StringBuilder("Some String"); // <- Constructs a string builder initialized to the contents of the specified string.
        StringBuilder stringBuilder2 =  new StringBuilder(); //<- Constructs a string builder with no characters in it and an initial capacity of 16 characters.
        StringBuilder stringBuilder3 =  new StringBuilder(21); // <- Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
        StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3); // <- Constructs a string builder that contains the same characters as the specified CharSequence.

        StringBuilder[] builder = {stringBuilder1, stringBuilder2, stringBuilder3, stringBuilder4};
        for(StringBuilder string: builder) {
            printStringBuilder(string);
        }
    }

    static void printStringBuilder(StringBuilder builder) {
        System.out.println("String's length is " + builder.length());
        System.out.println("string builder has capacity of " + builder.capacity());
        System.out.println("String is " + builder);
        System.out.println();
    }

}
