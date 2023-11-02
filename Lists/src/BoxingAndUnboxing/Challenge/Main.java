package BoxingAndUnboxing.Challenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("BBVA");

        bank.addNewCustomer("Jorge", 123);
        bank.addTransaction("Jorge", -10);
        bank.printBills("Jorge");

        bank.addNewCustomer("Alex", 123);
        bank.addTransaction("Alex", -130);
        bank.printBills("Alex");
    }
}
