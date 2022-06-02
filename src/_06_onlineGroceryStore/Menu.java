package _06_onlineGroceryStore;

import static _06_onlineGroceryStore.Database.*;
import static _06_onlineGroceryStore.Transactions.getAmount;
import static _06_onlineGroceryStore.Transactions.transactions;

public class Menu {
    protected static void mainMenu() throws InterruptedException {
        System.out.printf("%-15s %-15s %-15s\n", "Product No", "Product", "Price");
        System.out.println("============================================");
        System.out.printf("%-15s %-15s %-15s\n", getProductNumbers().get(0), getProduct().get(0), getPrices().get(0));
        System.out.printf("%-15s %-15s %-15s\n", getProductNumbers().get(1), getProduct().get(1), getPrices().get(1));
        System.out.printf("%-15s %-15s %-15s\n", getProductNumbers().get(2), getProduct().get(2), getPrices().get(2));
        System.out.printf("%-15s %-15s %-15s\n", getProductNumbers().get(3), getProduct().get(3), getPrices().get(3));
        System.out.printf("%-15s %-15s %-15s\n", getProductNumbers().get(4), getProduct().get(4), getPrices().get(4));
        System.out.printf("%-15s %-15s %-15s\n", getProductNumbers().get(5), getProduct().get(5), getPrices().get(5));
        System.out.printf("%-15s %-15s %-15s\n", getProductNumbers().get(6), getProduct().get(6), getPrices().get(6));
        System.out.println("============================================");
        int choice;
        double amount = 0;

        while (true) {
            try {
                System.out.print("Enter the product code (-1 to finish shopping) : ");
                choice = Integer.parseInt(scan.nextLine());
                if (choice < -1 || choice > 6) System.out.println("Choice should be between 0 and 6");
                else break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong entry. ");
            }
        }
        if (choice != -1) {
            amount = getAmount();
            transactions(choice, amount);
        } else transactions(choice, amount);
    }
}
