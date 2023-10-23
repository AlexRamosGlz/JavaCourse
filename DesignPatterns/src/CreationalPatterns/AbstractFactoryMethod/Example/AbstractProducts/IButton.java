package CreationalPatterns.AbstractFactoryMethod.Example.AbstractProducts;

/**
 * 1 Abstract Products
 *
 *  Abstract Products declare interfaces for a set of distinct but related products
 *  which make up a product family.
 *
 * Abstract Factory assumes that you have several families of products, structured into
 * separate class hierarchies (Button/Checkbox). All Products of the same family have the
 * common interface.
 *
 * This is the common interface for Buttons family
 */
public interface IButton {
    public void paint();
}
