package Classes.Composition.Challenge;

public class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo =  false;
        }
    }

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
