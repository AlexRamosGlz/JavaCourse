import CreationalPatterns.FactoryMethod.Example.Cart;
import CreationalPatterns.FactoryMethod.Example.OpenpayPayment;
import CreationalPatterns.FactoryMethod.Example.StripePayment;
import CreationalPatterns.FactoryMethod.Structure.ClientCode;

public class Main {
    public static void main(String[] args) {
        ClientCode clientCode = new ClientCode(1);

        Cart cart = new Cart(new OpenpayPayment(), "55946ce7-8fa2-41f4-b4bc-ff349fedd0f0");
        cart.pay();
        cart.refund();

        Cart cart1 = new Cart(new StripePayment(), "55946ce7-8fa2-41f4-b4bc-ff349fedd0f0");
        cart1.pay();
        cart1.refund();
    }
}