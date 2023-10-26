package Classes.Encapsulation.Challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer =  new Printer(60, true);
        printer.addToner(300);
        printer.printPages(105);
    }
}
