package CreationalPatterns.FactoryMethod.Example;

public class Openpay implements IPaymentProcessor {

    @Override
    public void pay(String orderId) {
        System.out.println("Order with " + orderId + " Payed by Openpay");
    }

    @Override
    public int refund(String orderId) {
        System.out.println("Order with " + orderId + " Refund by OpenPay");
        return 0;
    }
}
