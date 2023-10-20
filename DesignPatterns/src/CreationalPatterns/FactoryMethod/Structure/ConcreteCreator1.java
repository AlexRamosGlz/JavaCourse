package CreationalPatterns.FactoryMethod.Structure;

/**
 * 4
 *
 * Concrete Creator override the base factory method (createProduct()) so it
 * returns a different type of product.
 *
 * Note that the factory method doesn't have to create a new instance all the time.
 * It can also return existing objects from cache, and object pool ir another source
 */
public class ConcreteCreator1 extends BaseCreator{

    /**
     * Note that the signature of the method still uses the abstract product type,
     * even though the concrete product is actually return from the method. this way
     * the creator can stay independent of concrete product classes.
     */
    @Override
    public IAbstractProduct createProduct() {
        return new ConcreteProduct1();
    }
}
