package Classes.NestedClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Alex", 2012),
                new Employee(10021, "Tom", 2020),
                new Employee(1002, "Simon", 1998),
                new Employee(32, "Xavier", 1990)
        ));

        employees.sort(new Employee.EmployeeComparator<>("yearstarted").reversed());

        for(var employee: employees) {
            System.out.println(employee.toString());
        }

        System.out.println("\nStore Members\n");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(100, "Meg", 2019, "Walmart"),
                new StoreEmployee(10123, "John", 2020, "Soriana"),
                new StoreEmployee(1234, "Susan", 2011, "Walmart"),
                new StoreEmployee(10321, "Marty", 2018, "Target")
        ));

        /**
         * Instantiating an inner class
         *
         * `.new innerClassName()` is an operator used to create an instance of an inner class
         *
         * to create an instance of an inner class, you first MUST have an instance of the enclosing Class. From that
         * instance you call `.new `, followed by the inner class name and the parentheses, taking any
         * constructor arguments.
         */
        var comparator = new StoreEmployee().new StoreComparator<>();

        storeEmployees.sort(comparator);

        for(var storeEmployee: storeEmployees) {
            System.out.println(storeEmployee.toString());
        }

        System.out.println("With pig Latin Names");
        addPigLatinName(storeEmployees);
    }

    public static void addPigLatinName(List<? extends  StoreEmployee> list) {
        String lastname = "Piggy";

        /**
         * Local Classes
         *
         *  Local classes are inner classes, but declared directly in a code block, usually a method body.
         *
         *  Because of that, they don't have access modifiers, and are only accessible to that method body while it's
         *  executing
         *
         *  Like an inner class, they have access to all fields and methods on the enclosing class.
         *
         *  They can also access local variables and method arguments, that are final or effective
         */
        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee> {
 
            private String pigLatinName;
            private Employee originalInstace;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastname;
                this.originalInstace = originalInstance;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }

            @Override
            public String toString(){
                return originalInstace.toString() + " " + pigLatinName;
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());

        for(var employee: list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }
        newList.sort(null);
        for (var dEmployee: newList) {
            /**
             * Note that we can access `originalInstance` and `pigLating` private field from the local class
             * `DecoratedEmployee`.
             *
             * A method that has a local class, CAN access any of that class's fields, private OR not
             */
            System.out.println(dEmployee.originalInstace.getName() + " " + dEmployee.pigLatinName);
        }
    }
}
