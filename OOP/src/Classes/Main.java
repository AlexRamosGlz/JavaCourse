package Classes;

public class Main {
    public static void main(String[] args) {
        StaticMethods staticMethods = new StaticMethods(1, 2);

        Record record = new Record(123, "some string", true);
        int number = record.field1(); // returns 123
        System.out.println(number);
    }
}
