package _08_onlineBank;

import static _08_onlineBank.Transactions.*;
import static _08_onlineBank.Transactions.scan;

public class Menu {


    public static void mainMenu() {
        System.out.println();
        System.out.println("Please select a transaction.");
        System.out.println("1-Send Money\n2-Withdraw Money\n3-Deposit Money\n4-Check your account balance" +
                "\n5-View customer data\n6-Change password\n7-Exit");
        System.out.println();
        System.out.print("Your choice : ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception inputMismatchException) {
                System.out.println("Wrong entry");
                System.out.println();
                System.out.print("Your choice : ");
            }
        }

        if (choice == 1) sendMoney();

        else if (choice == 2) withdrawMoney();

        else if (choice == 3) depositMoney();

        else if (choice == 4) checkuserAccountBalance();

        else if (choice == 5) viewCustomerData();

        else if (choice == 6) changePassword();

        else if (choice == 7) exit();

        else {
            System.out.println();
            System.out.println("Wrong entry");
            mainMenu();
        }
    }
}
