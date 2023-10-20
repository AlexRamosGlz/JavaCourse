package CreationalPatterns.FactoryMethod.Structure;


public class ConcreteCreator2 extends BaseCreator{

    @Override
    public IAbstractProduct createProduct() {
        return new ConcreteProduct2();
    }
}
