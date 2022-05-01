package _02_javaBank;

import java.util.Scanner;

import static _02_javaBank._03_database.changePassword;
import static _02_javaBank._03_transactions.*;

public class _04_menu {


    public static void mainMenu() {

        System.out.println("Please select a transaction.");
        System.out.println("1-Send Money\n2-Withdraw Money\n3-Deposit Money\n4-Check your account balance\n5-Change password\n6-Exit");
        System.out.print("Your choice : ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception inputMismatchException) {
                System.out.println("Wrong entry");
                System.out.print("Your choice : ");
            }
        }

        if (choice == 1) {
            double sendingAmount;
            System.out.print("Please enter the amount which you want to transfer : ");
            while (true) {
                try {
                    sendingAmount = Double.parseDouble(scan.nextLine());
                    break;
                } catch (Exception inputMismatchException) {
                    System.out.println("Wrong input");
                    System.out.print("Please enter a proper amount : ");
                }
            }
            sendMoney(sendingAmount);

        } else if (choice == 2) {
            double withdrawAmount;
            System.out.print("Please enter the amount which you want to withdraw : ");
            while (true) {
                try {
                    withdrawAmount = Double.parseDouble(scan.nextLine());
                    break;
                } catch (Exception inputMismatchException) {
                    System.out.println("Wrong input");
                    System.out.print("Please enter a proper amount : ");
                }
            }
            withdrawMoney(withdrawAmount);

        } else if (choice == 3) {
            double depositAmount;
            System.out.print("Please enter the amount which you want to deposit : ");
            while (true) {
                try {
                    depositAmount = Double.parseDouble(scan.nextLine());
                    break;
                } catch (Exception inputMismatchException) {
                    System.out.println("Wrong input");
                    System.out.print("Please enter a proper amount : ");
                }
            }
            depositMoney(depositAmount);

        } else if (choice == 4) {
            checkuserAccountBalance();

        } else if (choice == 5) {
            changePassword();

        } else if (choice == 6) {
            System.out.println("Have a good day");
            System.exit(0);

        } else {
            System.out.println("Wrong entry");
            mainMenu();
        }
    }
}