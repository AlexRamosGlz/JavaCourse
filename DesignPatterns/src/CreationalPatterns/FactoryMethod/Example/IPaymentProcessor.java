package CreationalPatterns.FactoryMethod.Example;

// Common interface for products
public interface IPaymentProcessor {
    public void pay(String orderId);
    public int refund(String orderId);
}
