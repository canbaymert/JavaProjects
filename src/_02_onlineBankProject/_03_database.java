package _02_onlineBankProject;

import java.util.*;

import static _02_onlineBankProject._02_login.bankStart;
import static _02_onlineBankProject._04_menu.mainMenu;


public class _03_database {
    public static Scanner scan = new Scanner(System.in);
    static Map<Integer, String> customers = new HashMap<>();
    private static int userBirthDate,loggedInCustomerNumber,customerNumber = 10000006;
    private static String userName, userSurname, userCountry, userPassword;
    private static double userAccountBalance;


    public static int getLoggedInCustomerNumber() {
        return loggedInCustomerNumber;
    }

    public static void setUserPassword(String userPassword) {
        _03_database.userPassword = userPassword;
    }

    public static void setUserBirthDate(int userBirthDate) {
        _03_database.userBirthDate = userBirthDate;
    }

    public static void setUserName(String userName) {
        _03_database.userName = userName;
    }

    public static void setUserSurname(String userSurname) {
        _03_database.userSurname = userSurname;
    }

    public static void setUserCountry(String userCountry) {
        _03_database.userCountry = userCountry;
    }

    public static void setLoggedInCustomerNumber(int loggedInCustomerNumber) {
        _03_database.loggedInCustomerNumber = loggedInCustomerNumber;
    }

    public static int getCustomerNumber() {
        return customerNumber;
    }

    public static void setUserAccountBalance(double userAccountBalance) {
        _03_database.userAccountBalance = userAccountBalance;
    }

    public static double getUserAccountBalance() {
        return userAccountBalance;
    }

    public static int getUserBirthDate() {
        return userBirthDate;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getUserSurname() {
        return userSurname;
    }

    public static String getUserCountry() {
        return userCountry;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    private static void setCustomerNumber(int customerNumber) {
        _03_database.customerNumber = customerNumber;
    }

    public static void createDatabase() {
        customers.put(10000001, "Brad, Pitt, 1963, USA, 6857523, Brad1963.");
        customers.put(10000002, "Leonardo, DiCaprio, 1974, USA, 6857523, leoO1234!");
        customers.put(10000003, "Scarlett, Johansson, 1984, USA, 94234324, Johansson593!");
        customers.put(10000004, "Anthony, Hopkins, 1937, Wales, 124235320, aHopxx111*");
        customers.put(10000005, "Vincent, Cassel, 1966, France, 5325405, VC1234!.*");
    }

    public static void initializeCustomerData() {
        Set<Map.Entry<Integer, String>> customersSet = customers.entrySet();
        String[] customerData = new String[6];
        for (Map.Entry<Integer, String> each : customersSet) {
            if (getLoggedInCustomerNumber() == each.getKey()) {
                customerData = each.getValue().split(", ");
            }
        }
        setUserName(customerData[0]);;
        setUserSurname(customerData[1]);
        setUserBirthDate(Integer.parseInt(customerData[2]));
        setUserCountry(customerData[3]);
        setUserAccountBalance(Double.parseDouble(customerData[4]));
        setUserPassword(customerData[5]);

    }

    public static void updateUserData() {
        String updatedUserData = getUserName() + ", " + getUserSurname() + ", " + getUserBirthDate() + ", " +
                getUserCountry()+ ", " + getUserAccountBalance() + ", " + getUserPassword();
        customers.compute(getLoggedInCustomerNumber(), (key, value) -> updatedUserData);
    }

    public static void registeruser() {
        System.out.println("Please enter the asked information to register.");
        String name, surname, bYear, country, balance, password;
        do {
            System.out.print("Name : ");
            name = scan.nextLine();
            String temp = name;
            temp = temp.replaceAll("[a-zA-ZüÜıİÖöğĞşŞçÇ]", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);
        do {
            System.out.print("Surname : ");
            surname = scan.nextLine();
            String temp = surname;
            temp = temp.replaceAll("[a-zA-ZüÜıİÖöğĞşŞçÇ]", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);
        do {
            try {
                System.out.print("Birth Year : ");
                bYear = scan.nextLine();
                String temp = bYear;
                temp = temp.replaceAll("\\d", "");
                if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
                else if (Integer.parseInt(bYear) > 2020 || Integer.parseInt(bYear) < 1800) {
                    System.out.println("Invalid information. Please try again.");
                } else break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid information. Please try again.");
            }
        } while (true);
        do {
            System.out.print("Country : ");
            country = scan.nextLine();
            String temp = country;
            temp = temp.replaceAll("[a-zA-ZüÜıİÖöğĞşŞçÇ]", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);

        do {
            try {
                System.out.print("Amount that you wish to deposit (€) : ");
                balance = scan.nextLine();
                String temp = balance;
                temp = temp.replaceAll("\\d", "");
                if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
                else if (Integer.parseInt(balance) < 0) System.out.println("Invalid information. Please try again.");
                else break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid information. Please try again.");
            }
        } while (true);
        password = setPassword();

        name = name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1).toLowerCase(Locale.ROOT);
        surname = surname.substring(0, 1).toUpperCase(Locale.ROOT) + surname.substring(1).toLowerCase(Locale.ROOT);
        String newCustomer = name + ", " + surname + ", " + bYear + ", " + country + ", " + balance + ", " + password;
        customers.put(getCustomerNumber(), newCustomer);
        System.out.println("Registration successful.\nWelcome " + name + " " + surname +
                "\nYour customer number is : " + getCustomerNumber());
        setCustomerNumber(getCustomerNumber()+1);
        bankStart();
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
            if (!password.matches(".*[A-ZİÖÜÇĞŞ].*")) {
                System.out.println("Your password should contain at least 1 uppercase character");
                System.out.print("Create a new password : ");
                continue;
            }
            if (!password.matches(".*[a-zıöüçğş].*")) {
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


    public static void askPassword() {
        System.out.print("Please enter your password : ");
        String password = scan.nextLine();
        Set<Map.Entry<Integer, String>> customersSet = customers.entrySet();
        for (Map.Entry<Integer, String> each : customersSet) {
            if (getLoggedInCustomerNumber() == each.getKey()) {
                String[] eachValue = each.getValue().split(", ");
                if (eachValue[5].equals(password)) {
                    System.out.println("Access Granted.\nWelcome " + eachValue[0] + " " + eachValue[1]);
                    initializeCustomerData();
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
