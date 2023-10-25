package Classes.Composition;

import Classes.Composition.Challenge.CoffeMaker;
import Classes.Composition.Challenge.DishWasher;
import Classes.Composition.Challenge.Refrigerator;
import Classes.Composition.Challenge.SmartKitchen;

public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208", "Dell", "240");
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer personalComputer = new PersonalComputer("2208", "Dell", computerCase, monitor, motherBoard);
        personalComputer.powerUp();

        SmartKitchen smartKitchen = new SmartKitchen(new CoffeMaker(false ), new DishWasher(false), new Refrigerator(false));
        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();

    }
}