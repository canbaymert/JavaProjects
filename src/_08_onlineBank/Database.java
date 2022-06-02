package _08_onlineBank;

import java.util.*;

public class Database {
    public static Scanner scan = new Scanner(System.in);
    static Map<Integer, String> customers = new HashMap<>();
    private static int userBirthDate,loggedInCustomerNumber,customerNumber = 10000006;
    private static String userName, userSurname, userCountry, userPassword;
    private static double userAccountBalance;


    public static int getLoggedInCustomerNumber() {
        return loggedInCustomerNumber;
    }

    public static void setUserPassword(String userPassword) {
        Database.userPassword = userPassword;
    }

    public static void setUserBirthDate(int userBirthDate) {
        Database.userBirthDate = userBirthDate;
    }

    public static void setUserName(String userName) {
        Database.userName = userName;
    }

    public static void setUserSurname(String userSurname) {
        Database.userSurname = userSurname;
    }

    public static void setUserCountry(String userCountry) {
        Database.userCountry = userCountry;
    }

    public static void setLoggedInCustomerNumber(int loggedInCustomerNumber) {
        Database.loggedInCustomerNumber = loggedInCustomerNumber;
    }

    public static int getCustomerNumber() {
        return customerNumber;
    }

    public static void setUserAccountBalance(double userAccountBalance) {
        Database.userAccountBalance = userAccountBalance;
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

    public static void setCustomerNumber(int customerNumber) {
        Database.customerNumber = customerNumber;
    }

}