package BoxingAndUnboxing.Challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> custumers = new ArrayList<>(500);

    public Bank(String name) {
        this.name = name;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {

        if(getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, 123.43);
            custumers.add(customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);

        if(customer != null) {
            customer.addTransaction(transactionAmount);
        }
    }

    public void printBills(String customerName) {
        Customer customer = getCustomer(customerName);
        if(customer != null ) {
            System.out.println(customer.toString());
        }
    }

    private Customer getCustomer(String customerName) {

        for(var customer : custumers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }

        return null;
    }

}
