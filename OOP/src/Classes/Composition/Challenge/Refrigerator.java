package Classes.Composition.Challenge;

public class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo =  false;
        }
    }

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
