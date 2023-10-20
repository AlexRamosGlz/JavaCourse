package CreationalPatterns.FactoryMethod.Structure;

/**
 * 1 the Product declares the interface, which is common to all objects that can
 * be
 * produced by the creator and its subclasses
 *
 * the IAbstractProduct interface declares all the operations that all concrete products
 * must implement
 */
public interface IAbstractProduct {
    public String doStuff();
}
