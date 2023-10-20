package CreationalPatterns.FactoryMethod.Structure;

/**
 * 3 The Creator class declares the factory method that returns new IProduct
 * objects.
 * The Creator's subclasses usually provide the implementation of this method
 */
public abstract class BaseCreator {

    /**
     * Note that the BaseCreator may also provide some default implementation
     * of the factory method
     */
    public abstract IAbstractProduct createProduct();

    /**
     * Also note that, despite it's name, the creator's primary responsibility is NOT
     * creating products.
     * Usually, it contains some core business logic that relies on IAbstractProduct objects,
     * returned by the factory method.
     * <p>
     * Subclasses can indirectly change the business logic by overriding the factory
     * method and returning a different type of product from it.
     */
    public String someOperation() {
        IAbstractProduct product = createProduct();

        return "Creator: the same creator's worked with" + product.doStuff();
    }
}
