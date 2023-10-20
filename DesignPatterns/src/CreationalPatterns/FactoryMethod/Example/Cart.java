package CreationalPatterns.FactoryMethod.Example;

public class Cart {
    private PaymentProcessorCreator paymentProcessor;
    private String orderId;

    public Cart(PaymentProcessorCreator paymentProcessor, String orderId) {
        this.paymentProcessor = paymentProcessor;
        this.orderId = orderId;
    }

    public void pay() {
        this.paymentProcessor.pay(orderId);
    }

    public void refund() {
        this.paymentProcessor.refund(orderId);
    }
}
