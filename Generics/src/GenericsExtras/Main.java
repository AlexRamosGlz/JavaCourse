package GenericsExtras;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        printList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }

        /**
         *      printList(lpaStudents) // ERROR -> Required type: List<Student>
         *                                         Provided:  List<LPAStudent>
         *
         * We know LPAStudent inherits from Student, and we can pass an instance of LPA Student to any method, or
         * assign it to any reference type, declared with the type Student.
         *
         * We also know that ArrayList implements List, and we can pass an ArrayList to a method or assign it to
         * a reference of the List type.
         *
         * Why can't we pass an ArrayList of LPAStudent, to the method parameter that's declared as a List of Student?
         *
         *      When used as reference types, a container of one type has no relationship to the same container of
         *      another type,even if the contained types do have a relationship
         *
         *      in other Words...
         *
         *              List<Student> IS NOT equal to List<LPAStudent> even though LPAStudent is a Student
         *
         *      When we specify `Student` as a type argument to a generic class or container, ONLY `Student` and NOT
         *      one of its subtypes, is valid for this container.
         */
        //printList(lpaStudents);
        printMoreLists(lpaStudents);

        erasureTest(new ArrayList<Integer>(List.of(1, 2, 3)));
        erasureTest(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
    }


    /**
     *  Generic Method
     *
     *  For a method, type parameters are placed after any modifiers and before the method's return type
     *
     *      public <T> String myMethod(T input) {...};
     *
     *   a GENERIC METHOD CAN BE USED FOR COLLECTIONS WITH type arguments, as we just saw, to allow for
     *   variability of the elements in the collection, without using a raw version of the collection.
     *
     *   A generic method can be used for static methods on a generic class, because static methods can't use class type parameters.
     *
     *   The generic method type parameter is separate from a generic class type parameter.
     *
     *   In fact, if you've used T for both, the T declared on the method means a different type, than the T for the class.
     */
    public static <T extends Student> void printList(List<T> studentList) {
        for (var student: studentList) {
            System.out.println(student.getYearStarted() + ":" + student);
        }
        System.out.println();
    }

    /***
     *  Wildcard
     *
     *  Wildcard is represented by a question mark. Meanst that the type is unkown, gor this reason, a wildcard limits
     *  what you can do, when you specify a type this way.
     *
     *  A wildcard can only be used in a type argument, not in the type parameter declaration
     *
     *        List<?> unkownList; // DON'T DO
     *
     *  A wildcard CAN'T be used in an instantiation of a generic class.
     *
     *      var myList =  new ArrayList<?>(); // Error -> Wildcard type '?' cannot be instantiated directly
     *
     *  Bounds
     *
     *  Argument        Example                         Description
     *
     *  Unbounded       List<?>                         A List of any type can be passed or assigned to a List using this
     *                                                  wildcard.
     *
     *  Upper bound     List<? extends Student>         A List Containing any type that IS a `Student` or a SUB TYPE of
     *                                                  `Student` can be assigned or passed to an argument specifying
     *                                                  this wildcard.
     *
     *  Lower bound     List<? super LPAStudent>        A list containing any type that is an `LPAStudent` or a SUPER TYPE
     *                                                  of `LPAStudent`, so in our case, that would be `Student` and
     *                                                  `Object`.
     */
    public static void printMoreLists(List<? extends Student> students) {
        for (var student: students) {
            System.out.println(student.getYearStarted() + ":" + student);
        }
        System.out.println();

    }

    /**
     *  Type Erasure
     *
     *  Generics exist to enforce tighter type checks, at compile time.
     *
     *  The compiler transforms a generic class into a typed class, meaning the byte code, or class file,
     *  contains no type parameters.
     *
     *  Everywhere a type parameter is used in a class, it gets replaced with either the type Object, if no upper bound
     *  was specified, or the upper bound type itself.
     *
     *      this transformation process is called type erasure, because the T parameter ( or S,U,V), is erased, or replaced
     *      with a true type.
     *
     *  Understanding how type erasure works for overloaded methods, may be important.
     *
     *  Say we have a method with an Integer type parameter then we overloaded with a String type parameter.
     *
     *
     *          public void erasureTest(List<Integer> list) {...}; // 'erasureTest(List<Integer>)' clashes with
     *                                                              'erasureTest(List<String>)'; both methods
     *                                                              have same erasure
     *
     *          public void erasureTest(List<String> list) {...};
     *
     *  Note that the compiler throws an error beacuse the two methods list will transform into an Object
     *
     */

    // now this is a workaround to solve the previous problem
    public static void erasureTest(List<?> list) {
        for(var element:  list) {
            if(element instanceof String string) {
                System.out.println("String: " + string.toUpperCase());
            } else if (element instanceof Integer integer) {
                System.out.println("Integer: " + integer.floatValue());
            }
        }
    };

}
