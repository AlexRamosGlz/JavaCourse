package CreationalPatterns.AbstractFactoryMethod.Example.ConcreteProducts;

import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.ICheckbox;

public class MacOSCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("You've created a macOSCheckbox");
    }
}

