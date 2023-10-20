package CreationalPatterns.FactoryMethod.Structure;

public class ClientCode {
    public static BaseCreator creator;
    public int concreteCreatorOption;

    public ClientCode(int concreteCreatorOption) {
        this.concreteCreatorOption = concreteCreatorOption;
        this.runBusinessLogic();
    }

    public void runBusinessLogic() {
        if(this.concreteCreatorOption == 1) {
            System.out.println("App's launched with the concrete creator 1");
            creator = new ConcreteCreator1();
            System.out.println(creator.someOperation());
        }
        if(this.concreteCreatorOption == 2) {
            System.out.println("App's launched with the concrete creator 2");
            creator = new ConcreteCreator2();
            System.out.println(creator.someOperation());
        }
    }
}
