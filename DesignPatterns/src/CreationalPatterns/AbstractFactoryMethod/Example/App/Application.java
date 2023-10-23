package CreationalPatterns.AbstractFactoryMethod.Example.App;

import CreationalPatterns.AbstractFactoryMethod.Example.AbstractFactory.IGUIFactory;
import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.IButton;
import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.ICheckbox;

/**
 * Although concrete factories instantiate concrete products, signatures of their creation methods must return corresponding abstract products.
 * This way the client code that uses a factory does not get coupled to the specific variant of the product it gets from a factory.
 * The Client can work with any concrete factory/product variant, as long as it communicates with their objects via abstract interfaces.
 *
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private IButton button;
    private ICheckbox checkbox;

    public Application(IGUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}
