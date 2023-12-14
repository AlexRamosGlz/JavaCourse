package Classes.NestedClasses;

import java.util.Comparator;

public class StoreEmployee extends Employee{
    private String store;

    public StoreEmployee(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted);
        this.store = store;
    }

    public StoreEmployee() {
    }

    /**
     * Inner Classes
     *
     *  Inner Classes are non-static classes, declared on an enclosing class, at the member level.
     *
     *  Inner classes can have any of the four valid access modifiers.
     *
     *  An inner class has access to instance members, including private members, of the enclosing class.
     *
     *  instantiating an inner class from external code, is a bit tricky.
     */
    public class StoreComparator<T extends  StoreEmployee> implements Comparator<StoreEmployee> {
        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            int result = o1.store.compareTo(o2.store);

            if(result == 0)
                return new Employee.EmployeeComparator<>("yearStarted").compare(o1, o2);

            return result;
        }
    }

    @Override
    public String toString() {
        return  "%-8s%s".formatted(store, super.toString());
    }
}
