//Elijah Pele
package pricewatcher;

import java.util.*;

public class ConsoleUi {
    private Item item;

    public ConsoleUi(Item item) {
        this.item = item;
    }

    public void showWelcome() {
        System.out.println("Welcome to Price Watcher!");
    }

    public void showItem() {
        System.out.println();
        System.out.println("Name: " +item.getName());
        System.out.println("URL: " +item.getURL());
        System.out.println("Price: $" +item.getCurrentPrice());
        System.out.println("Change: %" +item.getPriceChange());
        System.out.println("Added: (" +item.getDateAdded() +") $" +item.getStartingPrice());
    }

    public int promptUser() {
        System.out.println("Enter 1 (to check Price), 2 (to view page), -1 or quit?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
        }
}