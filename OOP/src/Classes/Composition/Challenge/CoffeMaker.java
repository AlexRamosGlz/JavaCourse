package Classes.Composition.Challenge;

public class CoffeMaker {

    private boolean hasWorkToDo;

    public void brewCoffe() {
        if(hasWorkToDo) {
            System.out.println("Brewing Coffe");
            hasWorkToDo =  false;
        }
    }
    public CoffeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
