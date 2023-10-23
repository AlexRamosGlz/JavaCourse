package CreationalPatterns.AbstractFactoryMethod.Example.ConcreteProducts;

import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.IButton;

/**
 *  All products families have the same varieties (macOS/Windows).
 *
 *  This is another variant of a button.
 */
public class WindowsButton implements IButton {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
