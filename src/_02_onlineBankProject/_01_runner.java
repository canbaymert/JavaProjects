package _02_onlineBankProject;

import static _02_onlineBankProject._02_login.bankStart;
import static _02_onlineBankProject._03_database.createDatabase;

public class _01_runner {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("============Welcome to OnlineBank===============");
        System.out.println("================================================");
        createDatabase();
        bankStart();
    }
}

