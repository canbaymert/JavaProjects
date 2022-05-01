package _02_javaBank;

import java.util.*;

import static _02_javaBank._02_login.bankStart;
import static _02_javaBank._02_login.loginCustomerNumber;
import static _02_javaBank._04_menu.mainMenu;
import static _02_javaBank._03_transactions.*;


public class _03_database {
    public static Scanner scan = new Scanner(System.in);
    static Map<Integer, String> customers = new HashMap<>();
    public static int customerNumber = 10000006;


    public static void createDatabase() {
        customers.put(10000001, "Brad, Pitt, 1963, USA, 6857523, Brad1963.");
        customers.put(10000002, "Leonardo, DiCaprio, 1974, USA, 6857523, leoO1234!");
        customers.put(10000003, "Scarlett, Johansson, 1984, USA, 94234324, Johansson593!");
        customers.put(10000004, "Anthony, Hopkins, 1937, Wales, 124235320, aHopxx111*");
        customers.put(10000005, "Vincent, Cassel, 1966, France, 5325405, VC1234!.*");
    }

    public static void getCustomerData() {
        Set<Map.Entry<Integer, String>> customersSet = customers.entrySet();
        String[] customerData = new String[6];
        for (Map.Entry<Integer, String> each : customersSet) {
            if (loginCustomerNumber == each.getKey()) {
                customerData = each.getValue().split(", ");
            }
        }
        userName = customerData[0];
        userSurname = customerData[1];
        userBirthDate = Integer.parseInt(customerData[2]);
        userCountry = customerData[3];
        userAccountBalance = Double.parseDouble(customerData[4]);
        userPassword = customerData[5];
    }

    public static void updateUserData() {
        String updatedUserData = userName + ", " + userSurname + ", " + userBirthDate + ", " + userCountry + ", " + userAccountBalance + ", " + userPassword;
        customers.compute(loginCustomerNumber, (key, value) -> updatedUserData);
    }

    public static void registeruser() {
        System.out.println("Please enter the asked information to register.");
        String name, surname, bYear, country, balance, password;
        do {
            System.out.print("Name : ");
            name = scan.nextLine();
            String temp = name;
            temp = temp.replaceAll("[a-zA-Z]", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);
        do {
            System.out.print("Surname : ");
            surname = scan.nextLine();
            String temp = surname;
            temp = temp.replaceAll("[a-zA-Z]", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);
        do {
            System.out.print("Birth Year : ");
            bYear = scan.nextLine();
            String temp = bYear;
            temp = temp.replaceAll("\\d", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else if (Integer.parseInt(bYear) > 2020 || Integer.parseInt(bYear) < 1800) {
                System.out.println("Invalid information. Please try again.");
            } else break;
        } while (true);
        do {
            System.out.print("Country : ");
            country = scan.nextLine();
            String temp = country;
            temp = temp.replaceAll("[a-zA-Z]", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);

        do {
            System.out.print("Amount that you wish to deposit (€) : ");
            balance = scan.nextLine();
            String temp = balance;
            temp = temp.replaceAll("\\d", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else if (Integer.parseInt(balance) < 0) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);
        password = setPassword();

        name = name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1).toLowerCase(Locale.ROOT);
        surname = surname.substring(0, 1).toUpperCase(Locale.ROOT) + surname.substring(1).toLowerCase(Locale.ROOT);
        String newCustomer = name + ", " + surname + ", " + bYear + ", " + country + ", " + balance + ", " + password;
        customers.put(customerNumber, newCustomer);
        System.out.println("Registration successful.\nWelcome " + name + " " + surname + "\nYour customer number is : " + customerNumber);
        bankStart();
        customerNumber++;
    }

    public static String setPassword() {
        String password;
        System.out.print("Create a new password : ");
        while (true) {
            password = scan.nextLine();
            if (password.length() < 8) {
                System.out.println("Your password should contain at least 8 characters");
                System.out.print("Create a new password : ");
                continue;
            }
            if (!password.matches(".*[A-Z].*")) {
                System.out.println("Your password should contain at least 1 uppercase character");
                System.out.print("Create a new password : ");
                continue;
            }
            if (!password.matches(".*[a-z].*")) {
                System.out.println("Your password should contain at least 1 lowercase character");
                System.out.print("Create a new password : ");
                continue;
            }
            if (!password.matches(".*\\d+.*")) {
                System.out.println("Your password should contain at least 1 number");
                System.out.print("Create a new password : ");
                continue;
            }
            if (password.matches("[a-zA-Z0-9üÜıİÖöğĞşŞçÇ]*")) {
                System.out.println("Your password should contain at least 1 special character");
                System.out.print("Create a new password : ");
                continue;
            }
            break;
        }
        return password;
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

    public static void askPassword() {
        System.out.print("Please enter your password : ");
        String password = scan.nextLine();
        Set<Map.Entry<Integer, String>> customersSet = customers.entrySet();
        for (Map.Entry<Integer, String> each : customersSet) {
            if (loginCustomerNumber == each.getKey()) {
                String[] eachValue = each.getValue().split(", ");
                if (eachValue[5].equals(password)) {
                    System.out.println("Access Granted.\nWelcome " + eachValue[0] + " " + eachValue[1]);
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
                        askPassword();
                    } else {
                        bankStart();
                    }
                }
            }
        }
    }
}
