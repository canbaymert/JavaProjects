package _02_geometricalCalculator;

import java.util.Scanner;

import static _02_geometricalCalculator.Transactions.transactions;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    protected static void mainMenu() {
        System.out.println();
        System.out.println("Choose a geometrical shape : \n1 : Circle\n2 : Square\n3 : Triangle\n4 : Rectangle" +
                "\n5 : Exit");
        System.out.println();
        System.out.print("Your choice : ");
        int choice = 0;
        try {
            choice = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Wrong entry");
            mainMenu();
        }
        transactions(choice);
    }
}
