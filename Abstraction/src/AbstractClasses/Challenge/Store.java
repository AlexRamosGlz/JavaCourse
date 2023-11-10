package AbstractClasses.Challenge;

import java.util.ArrayList;

public class Store {
    private ArrayList<ProductForSale> products = new ArrayList<>();
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Food("Cheese", 1.99, "Delicious Yellow Cheese"));
        store.addProduct(new Food("Ham", 2.99, "Delicious Ham"));

        store.listItems();

        var order1 = new ArrayList<OrderItem>();
        store.addItemOrder(order1, 1, 3);
        store.addItemOrder(order1, 0, 9);
        store.printOrder(order1);
    }

    public void addProduct(ProductForSale product) {
        products.add(product);
    }

    public void listItems() {
        for(var product : products) {
            product.showDetails();
            System.out.println();
        }
    }

    public void addItemOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, products.get(orderIndex)));
    }

    public void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item: order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
