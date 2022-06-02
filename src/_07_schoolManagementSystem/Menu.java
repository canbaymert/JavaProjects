package _07_schoolManagementSystem;

import java.util.Scanner;

import static _07_schoolManagementSystem.Processes.exit;
import static _07_schoolManagementSystem.Processes.transactions;


public class Menu {
    static String memberType;
    static Scanner scan = new Scanner(System.in);
    protected static void mainMenu() {
        System.out.println();
        System.out.println("Please select a transaction.");
        System.out.println("1-Student transactions\n2-Teacher transactions\nQ-Exit");
        System.out.println();
        System.out.print("Your choice : ");
        String choice = scan.nextLine().toUpperCase();
        switch (choice) {
            case "1":
                memberType = "Student";
                transactions();
                break;
            case "2":
                memberType = "Teacher";
                transactions();
                break;
            case "Q":
                exit();
                break;
            default:
                System.out.println("Wrong entry");
                mainMenu();
                break;
        }
    }
}
