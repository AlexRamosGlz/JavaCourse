package CreationalPatterns.AbstractFactoryMethod.Example.ConcreteFactories;

import CreationalPatterns.AbstractFactoryMethod.Example.AbstractFactory.IGUIFactory;
import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.IButton;
import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.ICheckbox;
import CreationalPatterns.AbstractFactoryMethod.Example.ConcreteProducts.MacOSButton;
import CreationalPatterns.AbstractFactoryMethod.Example.ConcreteProducts.MacOSCheckbox;

/**
 * 4 Concrete Factories
 *
 * Concrete Factories implement creation methods of the abstract factory. Each concrete
 * factory corresponds to a specific variant of products and creates only
 * those product variants. (in this case only masOS Buttons/Checkbox)
 *
 * Each concrete factory extends basic factory and responsible for creating products
 * of a single variety.
 */
public class MacOSFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
