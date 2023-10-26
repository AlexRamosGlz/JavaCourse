package Classes.Encapsulation.Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        validateTonerLevelInput(tonerLevel);
    }

    private void validateTonerLevelInput(int tonerLevel) {
        if(tonerLevel > 100) {
            this.tonerLevel = 100;
        }
        else if(tonerLevel < 0) {
            this.tonerLevel = 0;
        }else this.tonerLevel += tonerLevel;
    }

    public int addToner(int tonerAmount) {

        validateTonerLevelInput(tonerAmount);

        if(tonerAmount + tonerLevel > 100 ) return -1;

        return tonerLevel;
    }

    public int printPages(int pages) {
        this.pagesPrinted += pages;

         if(!duplex) {
             return this.pagesPrinted;
         }

        System.out.println("Printer is duplex!");
         return  this.pagesPrinted * 2;
    }

}
