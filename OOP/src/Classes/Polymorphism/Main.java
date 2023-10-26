package Classes.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("h", "Star wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("Enter Type (A for Adeventure, C for Comedy, S for SienceFiction, Q to quit)");
            String type = s.nextLine();

            if("Qq".contains(type)) break;

            System.out.println("Enter the title");
            String title = s.nextLine();

            Movie.getMovie(type, title).watchMovie();
        }


    }
}
