package _02_javaBank;

import java.util.*;


import static _02_javaBank._03_database.getCustomerData;
import static _02_javaBank._03_database.updateUserData;
import static _02_javaBank._04_menu.*;


public class _03_transactions {

    public static Scanner scan = new Scanner(System.in);
    static double userAccountBalance;
    static int userBirthDate;
    static String userName, userSurname, userCountry, userPassword;


    public static void sendMoney(double sendingAmount) {
        getCustomerData();
        System.out.println("Welcome : " + userName + " " + userSurname + "\nYour current balance = " + userAccountBalance + " €");
        if (sendingAmount <= userAccountBalance) {
            String iban = getIban();
            userAccountBalance -= sendingAmount;
            System.out.println(sendingAmount + " € has been sent to " + iban + " successfully.");
            System.out.println("New balance of your account : " + userAccountBalance);
            updateUserData();
        } else {
            System.out.println("You can't send a bigger amount than your account balance");
            System.out.print("Please enter a proper amount:");
            while (true) {
                try {
                    sendingAmount = Double.parseDouble(scan.nextLine());
                    break;
                } catch (Exception inputMismatchException) {
                    System.out.println("Wrong entry");
                    System.out.print("Please enter a proper amount:");
                }
            }
            sendMoney(sendingAmount);
        }

        char choice;
        do {
            System.out.println("Would you like to proceed any other transcation?\nYes : Y\nNo : N");
            System.out.print("Your choice : ");
            choice = scan.nextLine().toUpperCase(Locale.ROOT).charAt(0);
            if (choice == 'Y') mainMenu();
            else if (choice == 'N') System.out.println("Have good a day");
            else System.out.println("Wrong entry");
        }
        while (choice != 'Y' || choice != 'N');
    }

    public static void withdrawMoney(double withdrawAmount) {
        getCustomerData();
        System.out.println("Welcome : " + userName + " " + userSurname + "\nYour current balance = " + userAccountBalance + " €");
        if (withdrawAmount <= userAccountBalance) {
            userAccountBalance -= withdrawAmount;
            System.out.println(withdrawAmount + " € has been withdrawn successfully.");
            System.out.println("New balance of your account : " + userAccountBalance);
            updateUserData();
        } else {
            System.out.println("You can't send bigger amount than your account balance");
            System.out.print("Please enter a proper amount : ");
            while (true) {
                try {
                    withdrawAmount = Double.parseDouble(scan.nextLine());
                    break;
                } catch (Exception inputMismatchException) {
                    System.out.println("Wrong entry");
                    System.out.print("Please enter a proper amount : ");
                }
            }
            withdrawMoney(withdrawAmount);
        }

        char choice;
        do {
            System.out.println("Would you like to proceed any other transaction?\nYes : Y\nNo : N");
            System.out.print("Your choice : ");
            choice = scan.nextLine().toUpperCase(Locale.ROOT).charAt(0);
            if (choice == 'Y') mainMenu();
            else if (choice == 'N') System.out.println("Have good a day");
            else System.out.println("Wrong entry");
        }
        while (choice != 'Y' || choice != 'N');
    }

    public static void depositMoney(double depositAmount) {
        getCustomerData();
        System.out.println("Welcome : " + userName + " " + userSurname + "\nYour current balance = " + userAccountBalance + " €");
        userAccountBalance += depositAmount;
        System.out.println(depositAmount + " € has been deposited successfully.");
        System.out.println("New balance of your account : " + userAccountBalance);
        updateUserData();

        char choice;
        do {
            System.out.println("Would you like to proceed any other transaction?\nYes : Y\nNo : N");
            System.out.print("Your choice : ");
            choice = scan.nextLine().toUpperCase(Locale.ROOT).charAt(0);
            if (choice == 'Y') mainMenu();
            else if (choice == 'N') System.out.println("Have good a day");
            else System.out.println("Wrong entry");
        }
        while (choice != 'Y' || choice != 'N');
    }

    public static void checkuserAccountBalance() {
        System.out.println("Welcome : " + userName + " " + userSurname + "\nYour current balance = " + userAccountBalance + " €");

        char choice;
        do {
            System.out.println("Would you like to proceed any other transaction?\nYes : Y\nNo : N");
            System.out.print("Your choice : ");
            choice = scan.nextLine().toUpperCase(Locale.ROOT).charAt(0);
            if (choice == 'Y') mainMenu();
            else if (choice == 'N') System.out.println("Have good a day");
            else System.out.println("Wrong entry");
        }
        while (choice != 'Y' || choice != 'N');
    }

    public static String getIban() {
        String input = "";
        System.out.println("Please enter a Turkish IBAN that you wish to transfer (Starts with TR) : ");
        do {
            try {
                input = scan.nextLine();
                String temp = input.substring(2).replaceAll("\\d", "");
                if (input.length() == 26 && input.charAt(0) == 'T' && input.charAt(1) == 'R'&& temp.equals("")) break;
                else throw new Exception();
            } catch (Exception e) {
                System.out.println("Invalid IBAN");
                System.out.print("Please enter a proper IBAN:");
            }
        }
        while (true);
        System.out.println("IBAN accepted.");
        return input;
    }
}


