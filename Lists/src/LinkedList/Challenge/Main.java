package LinkedList.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Town> towns = new ArrayList<>();

        towns.add(new Town("Perth", 3923));
        towns.add(new Town("Darwin", 3972));
        towns.add(new Town("Sydeny", 0));
        towns.add(new Town("Brisbane", 917));
        towns.add(new Town("Adelaide",  1374));
        towns.add(new Town("Alice Springs", 2771));
        sortTownsByDistance(towns);
        LinkedList<Town> list = new LinkedList<>();
        list.addAll(towns);

        String menu = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu 
                (Q)uit
                """;

        while (true) {
            System.out.println(menu);
            String option = scanner.nextLine();
                if(option.contains("F")) printSchedule(list, true);
                else if (option.contains("B")) printSchedule(list, false);
                else if (option.contains("L")) printList(list);
                else if (option.contains("Q")) break;
                else System.out.println("Invalid Option");
        }

    }

    public static void printSchedule(LinkedList<Town> list, Boolean direction) {
        if (direction == true) {
            var listIterator = list.listIterator(0);
            while (listIterator.hasNext()) {
                System.out.println(listIterator.next());
            }
        } else {
            var listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                System.out.println(listIterator.previous());
            }
        }
    }

    public static void sortTownsByDistance(ArrayList<Town> towns) {
        for (int i = 0; i < towns.size(); i++) {
            for (int j = 0; j < towns.size() - 1; j++) {
                if(towns.get(j).getDistanceFromSydney() > towns.get(j + 1).getDistanceFromSydney()) {
                    var temp = towns.get(j + 1);
                    towns.set(j + 1, towns.get(j));
                    towns.set(j, temp);
                }
            }
        }
    }

    public static void printList(LinkedList<Town> towns) {

        for (Town town: towns) {
            System.out.println(town.toString());
        }
    }
}
