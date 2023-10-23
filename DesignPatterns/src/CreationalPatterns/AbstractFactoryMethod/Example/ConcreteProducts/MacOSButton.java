package CreationalPatterns.AbstractFactoryMethod.Example.ConcreteProducts;

import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.IButton;

/**
 *  2 Concrete Product
 *
 *  Concrete Products are various implementation of Abstract Products,
 *  grouped by variants. Each Abstract product (IButton/ ICheckbox) must be implemented
 *  in all given variants (MacOSButton / WindowsButton )
 *
 *  All products families have the same varieties (macOS/Windows).
 *
 *  this is macOS variant of a button.
 */
public class MacOSButton implements IButton {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
