package CreationalPatterns.FactoryMethod.Example;

abstract public class PaymentProcessorCreator {

    public abstract IPaymentProcessor createPaymentProcessor();

    public void pay(String orderId) {
        IPaymentProcessor paymentProcessor = createPaymentProcessor();

        paymentProcessor.pay(orderId);
    }

    public void refund(String orderId) {
        IPaymentProcessor paymentProcessor = createPaymentProcessor();

        paymentProcessor.refund(orderId);
    }
}
