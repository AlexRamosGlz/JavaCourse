package Classes.NestedClasses;

import java.util.Comparator;

/**
 * Nested Classes
 *
 * the four different types of nested classes you can use in java are
 *
 *      static nested class:        Declared in a class body. Much like a static field, access to this class is through
 *                                  the Class name identifier
 *
 *      instance or inner class:    Declared in class body. This type of class can only be accessed through an instance
 *                                  of the outer class.
 *
 *      local class:                declared within a method body.
 *
 *      anonymous class:            unnamed class, declared an instantiated in same statement.
 */
public class Employee {

    /**
     *  Static Nested Class
     *
     *  the static nested class is a class enclosed in the structure of another class, declared as static.
     *
     *  This means the class, if accessed externally, requires the outer class name as part of the qualifying name.
     *
     *  This class hast the advantage of being able to ACCESS private attributes on the outer class.
     *
     *  this enclosing class can access any attributes on the static nested class, also including private attributes.
     */
    public static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

        private String sortType;

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {

            if(sortType.equalsIgnoreCase("employeeId"))
                return o1.employeeId - o2.employeeId;

            if(sortType.equalsIgnoreCase("yearStarted"))
                return o1.employeeId - o2.employeeId; // -> and also since this method belongs to
                                                      // a nested static class inside `Employee`, this method can access
                                                      // the outer class (`Employee`) private fields

            return o1.getName().compareTo(o2.getName()); // -> thanks to getName(), `name` is accessible to the function
        }
    }

    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee() {
    }

    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "%d %s %d".formatted(employeeId, name, yearStarted);
    }
}
