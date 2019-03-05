//Elijah Pele
package pricewatcher;

import java.awt.*;
import java.net.URI;

public class Main {
    public void run() {
        Item item = new Item();
        ConsoleUi ui = new ConsoleUi(item);
        ui.showWelcome();
        /*
         * repeat until user ask for quit
         *   print the item
         *   prompt the user
         *   process the request
         */
        int request = -1;
        do {
            ui.showItem();
            request = ui.promptUser();
            System.out.println();
            switch (request) {
                case -1:
                    System.out.println("Exiting program. . . Goodbye!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("The current cost of " + item.getName() + " is $" + item.checkLivePrice());
                    break;
                case 2:try {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI(item.getURL());
                    desktop.browse(oURL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                    break;
                default:
                    System.out.println("You have entered an invalid input. Try again.");
                    break;
            }
        } while (request != -1);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}