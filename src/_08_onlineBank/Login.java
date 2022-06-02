package _08_onlineBank;

import java.util.Scanner;

import static _08_onlineBank.DatabaseTransactions.askCustomerNumber;
import static _08_onlineBank.DatabaseTransactions.registerUser;

public class Login {
    static Scanner scan = new Scanner(System.in);

    public static void login() {
        System.out.println();
        System.out.println("Login with your customer number : 0\nRegister new user : 1");
        System.out.println();
        System.out.print("Your choice : ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception inputMismatchException) {
                System.out.println("Invalid entry");
                System.out.print("Login with your customer number : 0\nRegister new user : 1");
                System.out.println();
                System.out.print("Your choice : ");
            }
        }
        if (choice == 0) {
            askCustomerNumber();
        } else if (choice == 1) {
            registerUser();
        } else {
            System.out.println("Invalid entry");
            login();
        }
    }
}