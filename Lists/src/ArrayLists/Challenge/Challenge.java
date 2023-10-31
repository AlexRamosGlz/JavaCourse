package ArrayLists.Challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String menu = """
                    Avaialbe actions: 
                        
                        0 - to Shutdown 
                        1 - to add  item(s) to list (comma delimited list) 
                        2 - to remove any items (comma delimited list) 
                        3 - List all items
                    
                    """;

        while(true) {

            System.out.println(menu);
            System.out.println("Enter a number for which action you want to do:");
            int selectedOption = Integer.parseInt(scanner.nextLine());

            if(selectedOption == 0) {
                System.out.println("Shutting down...");
                break;
            } else if (selectedOption == 1) {
                System.out.println("Enter the name of the item to add");
                String item = scanner.nextLine();

                if(groceryList.contains(item)) {
                    System.out.println("Item already exists in List");
                } else {
                    groceryList.add(item);
                }
            } else if (selectedOption == 2) {
                System.out.println("Enter the name of the item to remove");
                String item = scanner.nextLine();
                groceryList.remove(item);
            } else if (selectedOption == 3) {
                System.out.println("Available items: ");
                groceryList.sort(Comparator.naturalOrder());
                System.out.println("\n" + groceryList);
            }

            System.out.println("Continue? (y/n)");
            if(scanner.nextLine() == "y") {
                break;
            }
        }
    }
}
