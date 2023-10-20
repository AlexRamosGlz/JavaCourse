package CreationalPatterns.FactoryMethod.Example;

public class OpenpayPayment extends PaymentProcessorCreator{

    @Override
    public IPaymentProcessor createPaymentProcessor() {
        return new Openpay();
    }
}


