package Classes.Inheritance.Challenge;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Fer", "11/21/1998", "11/12/2020");
        System.out.println(employee.toString());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println("Joe collect $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check is $" + joe.collectPay());
    }
}
