package _06_onlineBank;

import static _06_onlineBank.Login.bankStart;
import static _06_onlineBank.Database.createDatabase;

public class Runner {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("================================================");
        System.out.println("============Welcome to Online Bank==============");
        System.out.println("================================================");
        createDatabase();
        bankStart();
    }
}