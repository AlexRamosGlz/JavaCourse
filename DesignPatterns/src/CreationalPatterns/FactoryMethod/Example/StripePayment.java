package CreationalPatterns.FactoryMethod.Example;

public class StripePayment extends PaymentProcessorCreator {
    @Override
    public IPaymentProcessor createPaymentProcessor() {
        return new Stripe();
    }
}
