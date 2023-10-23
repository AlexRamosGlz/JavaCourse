package Classes;

public class StaticMethods {
    private int nonStaticMember;


    StaticMethods(int firstNumber, int secondNumber) {
        printSum(firstNumber, secondNumber);
    }

    /**
     * Static methods CAN'T access instance methods and instance members
     */
    public static void printSum(int firstNumber, int secondNumber ) {


        // StaticMethods.nonStaticMember -> Non-static field 'nonStaticMember' cannot be referenced from a static context

        /**
         *  Inside static method we CAN'T USE the `this` keyword
         */
        // this.nonStaticMethod(); -> Error: 'Classes.StaticMethods.this' cannot be referenced from a static context
        System.out.println("sum= " + (firstNumber + secondNumber));
    }

    public void nonStaticMethod() {
        // Some logic
    }
}
