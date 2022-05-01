package _02_javaBank;

import static _02_javaBank._02_login.bankStart;
import static _02_javaBank._03_database.createDatabase;

public class _01_runner {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("=============Welcome to JavaBank================");
        System.out.println("================================================");
        createDatabase();
        bankStart();
    }
}

