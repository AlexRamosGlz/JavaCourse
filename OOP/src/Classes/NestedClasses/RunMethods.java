package Classes.NestedClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {
    public static void main(String[] args) {
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(100, "Meg", 2019, "Walmart"),
                new StoreEmployee(10123, "John", 2020, "Soriana"),
                new StoreEmployee(1234, "Susan", 2011, "Walmart"),
                new StoreEmployee(10321, "Marty", 2018, "Target")
        ));

        var c0 = new Employee.EmployeeComparator<StoreEmployee>("name");
        var c1 = new StoreEmployee().new StoreComparator<StoreEmployee>();

        sortIt(storeEmployees, c0);
        sortIt(storeEmployees, c1);

        // Using local class
        class NameSort<T> implements Comparator<StoreEmployee> {
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

        var c3 = new NameSort<StoreEmployee>();

        //Using anonymous class
        var c4 = new Comparator<StoreEmployee>() {
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        sortIt(storeEmployees, c3);
        sortIt(storeEmployees, c4);
        sortIt(storeEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator) {
        System.out.println("Sorting with comparator: " + comparator.toString());

        list.sort(comparator);
        for (var employee: list) {
            System.out.println(employee);
        }
    }
}
