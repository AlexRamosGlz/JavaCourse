package CreationalPatterns.AbstractFactoryMethod.Example.ConcreteProducts;

import CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts.ICheckbox;

public class WindowsCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("You've created a windowsCheckbox");
    }
}
