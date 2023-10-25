package Classes.Composition.Challenge;

public class SmartKitchen {
    private CoffeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void addWater() {
        brewMaster.brewCoffe();
    }

    public  void pourMilk() {
        iceBox.orderFood();
    }

    public void loadDishwasher() {
        dishWasher.doDishes();
    }

    public void setKitchenState(boolean coffeMakerState, boolean refrigeratorStatem, boolean dishWasherState) {
        dishWasher.setHasWorkToDo(dishWasherState);
        iceBox.setHasWorkToDo(refrigeratorStatem);
        brewMaster.setHasWorkToDo(coffeMakerState);
    }

    public void doKitchenWork() {
        loadDishwasher();
        pourMilk();
        addWater();
    }
}
