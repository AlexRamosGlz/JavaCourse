package CreationalPatterns.AbstractFactoryMethod.Example.ConcreteFactories;

import CreationalPatterns.AbstractFactoryMethod.Example.AbstractFactory.IGUIFactory;
import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.IButton;
import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.ICheckbox;
import CreationalPatterns.AbstractFactoryMethod.Example.ConcreteProducts.WindowsButton;
import CreationalPatterns.AbstractFactoryMethod.Example.ConcreteProducts.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating products
 * of a single variety.
 */
public class WindowsFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
