package CreationalPatterns.FactoryMethod.Example;

public class Stripe implements IPaymentProcessor {

    @Override
    public void pay(String orderId) {
        System.out.println("Order with " + orderId + " Payed by Stripe");
    }

    @Override
    public int refund(String orderId) {
        System.out.println("Order with " + orderId + " Refund by Stripe");
        return 0;
    }
}
