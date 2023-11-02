package BoxingAndUnboxing.Challenge;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name, double initialDeposit) {
        this.name = name;
        transactions = new ArrayList<>(500);
        transactions.add(initialDeposit);
    }

    public void addTransaction(Double amount) {
        transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name + "\n" + transactions.toString();
    }
}
