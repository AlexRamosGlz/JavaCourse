package AbstractClasses.Challenge;

public class Food extends ProductForSale{
    public Food(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("Type: %-15s, Description: %-35s, Price: %.2f", type, description, price);
    }
}
