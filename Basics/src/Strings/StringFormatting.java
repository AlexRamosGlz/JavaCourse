package Strings;

public class StringFormatting {

    public void mainMocker() {
       //Default formatting
        System.out.println("Default formatting"); // Prints Default formatting


        /**
         *  Concatenation Operator (+)
         *
         *  The unicode \u2022 prints a bulledPoint (•)
         *
         *  the \t inserts a tab space
         */
        String bulledIt = "Print a Bulled List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        /**
         * Prints:
         *
         * Print a Bulled List:
         * 	• First Point
         * 		• Sub Point
         */
        System.out.println(bulledIt);


        /**
         *  Text Blocks: is a new way of formatting a string. To declare a
         *    text block three double-quote marks are needed (""")
         *
         *  Now indentation is easier, no need to use unicode characters for
         *  line jumps or tab spaces
         */
        String textBlock = """
                Print a Bulled List:
                    \u2022 Frist Point
                        \u2022 Sub Point
                """;

        /**
         * Prints:
         *  Print a Bulled List:
         *     • Frist Point
         *         • Sub Point
         *
         *  The same `bulledIt` string is printed but without any unicodes used
         */
        System.out.println(textBlock);

        /**
         * ...printf() It’s used to print formatted strings using various format specifiers.
         *
         *  the structure is `...printf(string, variable1, variable2, ...variableN)`
         */
        int age = 35;

        /**
         *  the `%` is a special indicator called format specifier and the character next to
         *  it is a flag that represents the type of value that should have, in this case `d` is for integer.
         *  There's also `f` for doable or float variable type
         */
        System.out.printf("Your age is %d\n", age); // Prints -> Your age is 35

        /**
         * The format specifiers for general, character, and numeric types have the following syntax:
         *    %[argument_index$][flags][width][.precision]conversion
         */
        // no precision
        System.out.printf("Your age is %f\n", (double) age); // Prints Your age is 35.000000

        // with precision
        System.out.printf("Your age is %.2f\n", (double) age); // Prints Your age is 35.00

        /**
         *  String.format()
         *
         *  The java string format() method returns the formatted string by given locale, format and arguments.
         *  The format method of java language is like ...printf() but instead of just printing it returns the
         *  formated string
         */
        String ageInfo = String.format("My age is %d", age);
        System.out.println(ageInfo); // prints -> My age is 35

        /**
         * also you can use the .formatted() to format a string
         */
        ageInfo = "My age is %d".formatted(age);
        System.out.println(ageInfo);

        /**
         * String.indent()
         *
         *  this method add or remoces spaces from the beginning of lines in multi-line text.
         */
    }
}
