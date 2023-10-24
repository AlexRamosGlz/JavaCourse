package Classes.Static;


public class InstanceAndStaticVariables {

    /**
     * Static variables also known as Static member variables.
     *
     * Every instance of the class shares the same static variable. So if changes are
     * made to that variable, all other instances of the class will see the effect
     * of that change
     */
    static int constantNumber;

    /**
     * Instance variables represent the state, of a specific instance of a class
     *
     */
    int variableNumber;

    public InstanceAndStaticVariables(int variableNumber, int constantNumber) {
        this.variableNumber = variableNumber;

        // It is considered best practice to use th class cname, and not the
        // reference variable access a static variable.
        InstanceAndStaticVariables.constantNumber = constantNumber;
    }

    public void printField() {
        System.out.println(InstanceAndStaticVariables.constantNumber);
        System.out.println(this.variableNumber);
    }

    public void mainMocker() {
        InstanceAndStaticVariables instance = new InstanceAndStaticVariables(23, 100);
        // the static member is updated therefore every instance now has the new value
        InstanceAndStaticVariables newInstance = new InstanceAndStaticVariables(32, 180);

        instance.printField(); // prints { 23, 180 }
        newInstance.printField(); // prints  { 32, 180 }
    }
}

