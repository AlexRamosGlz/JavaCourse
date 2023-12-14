package Classes.NestedClasses.Burger;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private double price =5.0;
    private Burger burger;
    private Item drink;
    private Item side;
    private double convertionRate;

    public Meal() {
        this(1);
    }

    public Meal(double convertionRate) {
        this.convertionRate = convertionRate;
        burger = new Burger("regular");
        drink =  new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal() {
        double total = drink.price + burger.getPrice() + side.price;
        return Item.getPrice(total, convertionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side, "Total Due: ", getTotal());
    }

    public void addToppings(String... selectedToppings) {
        burger.addTopping(selectedToppings);
    }

    public class Item {
        private String type;
        private String name;
        private double price;

        public Item(String type, String name) {
            this(type, name, type.equals("burger") ? Meal.this.price : 0);
        }

        public Item(String name, String type, double price) {
            this.type = type;
            this.name = name;
            this.price = price;
        }

        public static double getPrice(double price, double rate) {
            return  price * rate;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name, getPrice(price, convertionRate));
        }
    }

    public class Burger extends Item{
        private List<Item> toppings = new ArrayList<>();
        enum Extra {AVOCADO, BACON, CHEESE, KETCHUP, MAYO, MUSTARD, PICKLES;

            private double getPrice(){
                return switch (this) {
                    case AVOCADO -> 1.0;
                    case BACON -> 2.0;
                    default -> 0;
                };
            }
        }

        public Burger(String name) {
            super(name, "burger", 0.5);
        }

        public void addTopping(String... selectedToppings)  {
            for(String selectedTopping: selectedToppings) {
                try {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "TOPPING", topping.getPrice()));
                } catch (IllegalArgumentException ie) {
                    System.out.println("No topping found for" + selectedTopping);
                }
            }
        }

        public double getPrice() {
            double total = super.price;
            for(Item topping : toppings) {
                total += topping.price;
            }
            return total;
        }

        @Override
        public String toString() {
            StringBuilder itemized = new StringBuilder(super.toString());
            for(Item topping: toppings) {
                itemized.append("\n");
                itemized.append(topping);
            }
            return itemized.toString();
        }
    }
}
