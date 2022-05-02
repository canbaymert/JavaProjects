package _02_onlineBankProject;

import java.util.*;


import static _02_onlineBankProject._02_login.bankStart;
import static _02_onlineBankProject._02_login.loginCustomerNumber;
import static _02_onlineBankProject._03_database.*;
import static _02_onlineBankProject._04_menu.*;


public class _03_transactions {

    public static Scanner scan = new Scanner(System.in);

    public static void sendMoney(double sendingAmount) {
        getCustomerData();
        System.out.println("Welcome : " + getUserName() + " " + getUserSurname() + "\nYour current balance = " + getUserAccountBalance() + " €");
        if (sendingAmount <= getUserAccountBalance()) {
            String iban = getIban();
            setUserAccountBalance(getUserAccountBalance()-sendingAmount);
            System.out.println(sendingAmount + " € has been sent to " + iban + " successfully.");
            System.out.println("New balance of your account : " + getUserAccountBalance());
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
            else if (choice == 'N') {
                System.out.println("Have good a day");
                break;
            }
            else System.out.println("Wrong entry");
        }
        while (true);
    }

    public static void withdrawMoney(double withdrawAmount) {
        getCustomerData();
        System.out.println("Welcome : " + getUserName() + " " + getUserSurname() + "\nYour current balance = " + getUserAccountBalance() + " €");
        if (withdrawAmount <= getUserAccountBalance()) {
            setUserAccountBalance(getUserAccountBalance()-withdrawAmount);
            System.out.println(withdrawAmount + " € has been withdrawn successfully.");
            System.out.println("New balance of your account : " + getUserAccountBalance());
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
            else if (choice == 'N') {
                System.out.println("Have good a day");
                break;
            }
            else System.out.println("Wrong entry");
        }
        while (true);
    }

    public static void depositMoney(double depositAmount) {
        getCustomerData();
        System.out.println("Welcome : " + getUserName() + " " + getUserSurname() + "\nYour current balance = " + getUserAccountBalance() + " €");
        setUserAccountBalance(getUserAccountBalance()-depositAmount);
        System.out.println(depositAmount + " € has been deposited successfully.");
        System.out.println("New balance of your account : " + getUserAccountBalance());
        updateUserData();

        char choice;
        do {
            System.out.println("Would you like to proceed any other transaction?\nYes : Y\nNo : N");
            System.out.print("Your choice : ");
            choice = scan.nextLine().toUpperCase(Locale.ROOT).charAt(0);
            if (choice == 'Y') mainMenu();
            else if (choice == 'N'){
                System.out.println("Have good a day");
                break;
            }
            else System.out.println("Wrong entry");
        }
        while (true);
    }

    public static void checkuserAccountBalance() {
        System.out.println("Welcome : " + getUserName() + " " + getUserSurname() + "\nYour current balance = " + getUserAccountBalance() + " €");

        char choice;
        do {
            System.out.println("Would you like to proceed any other transaction?\nYes : Y\nNo : N");
            System.out.print("Your choice : ");
            choice = scan.nextLine().toUpperCase(Locale.ROOT).charAt(0);
            if (choice == 'Y') mainMenu();
            else if (choice == 'N') {
                System.out.println("Have good a day");
                break;
            }
            else System.out.println("Wrong entry");
        }
        while (true);
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

    public static void changePassword() {
        System.out.print("Please enter your current password : ");
        String password = scan.nextLine();
        Set<Map.Entry<Integer, String>> customersSet = customers.entrySet();
        for (Map.Entry<Integer, String> each : customersSet) {
            if (loginCustomerNumber == each.getKey()) {
                String[] eachValue = each.getValue().split(", ");
                if (eachValue[5].equals(password)) {
                    setPassword();
                    updateUserData();
                    System.out.println("Password has been changed successfully.");
                    mainMenu();
                } else {
                    System.out.println("Wrong password.\nTry again : 0\nReturn to main menu : 1");
                    System.out.print("Your choice : ");
                    int choice;
                    while (true) {
                        try {
                            choice = Integer.parseInt(scan.nextLine());
                            if (choice == 0 || choice == 1) break;
                            else {
                                System.out.println("Invalid entry\nTry again : 0\nReturn to main menu : 1");
                                System.out.print("Your choice : ");
                            }
                        } catch (Exception inputMismatchException) {
                            System.out.println("Invalid entry\nTry again : 0\nReturn to main menu : 1");
                            System.out.print("Your choice : ");
                        }
                    }
                    if (choice == 0) {
                        changePassword();
                    } else {
                        bankStart();
                    }
                }
            }
        }
    }
}



