package Classes.Polymorphism;

public class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Bad Aliens do Bad stuff", "Space guys chase ", "Something bad happens");
    }
}

