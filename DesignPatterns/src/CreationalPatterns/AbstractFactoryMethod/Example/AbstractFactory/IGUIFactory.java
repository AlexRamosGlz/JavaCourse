package CreationalPatterns.AbstractFactoryMethod.Example.AbstractFactory;

import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.IButton;
import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.ICheckbox;

/**
 *  3 Abstract Factory
 *
 *  The Abstract Factory interface declares a set of methods
 *  for creating each of the abstract products
 *
 *  Abstract factory knows about all (abstract) product types.
 */
public interface IGUIFactory {
    IButton createButton();

    ICheckbox createCheckbox();
}
