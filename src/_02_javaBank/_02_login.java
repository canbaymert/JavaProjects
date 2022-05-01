package _02_javaBank;

import java.util.Scanner;

import static _02_javaBank._03_database.*;

public class _02_login {
    static Scanner scan = new Scanner(System.in);
    public static int loginCustomerNumber;

    public static void bankStart() {

        System.out.println("Login with your customer number : 0\nRegister new user : 1");
        System.out.print("Your choice : ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception inputMismatchException) {
                System.out.println("Invalid entry");
                System.out.print("Login with your customer number : 0\nRegister new user : 1");
                System.out.print("Your choice : ");
            }
        }
        if (choice == 0) {
            loginwithCustomerNumber();
        } else if (choice == 1) {
            registeruser();
        } else {
            System.out.println("Invalid entry");
            bankStart();
        }
    }

    private static void loginwithCustomerNumber() {
        System.out.print("Please enter your 8 digits customer number : ");
        while (true) {
            try {
                loginCustomerNumber = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception inputMismatchException) {
                System.out.println("Invalid entry");
                System.out.print("Please enter your 8 digits customer number : ");
            }
        }
        if (loginCustomerNumber > 99999999 || loginCustomerNumber < 10000000) {
            System.out.println("Invalid customer number, please try again.");
            bankStart();
        }

        if (customers.containsKey(loginCustomerNumber)) {
            askPassword();
        } else {
            System.out.println("Invalid customer number, please try again.");
            bankStart();
        }
    }
}






