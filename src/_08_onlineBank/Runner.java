package _08_onlineBank;

import static _08_onlineBank.DatabaseTransactions.createDatabase;
import static _08_onlineBank.Login.login;

public class Runner extends Database{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("================================================");
        System.out.println("============Welcome to Online Bank==============");
        System.out.println("================================================");
        createDatabase();
        login();
    }
}