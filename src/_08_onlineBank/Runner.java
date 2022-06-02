package _08_onlineBank;

import javax.xml.crypto.Data;

import static _08_onlineBank.Login.bankStart;
import static _08_onlineBank.Database.createDatabase;

public class Runner extends Database{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("================================================");
        System.out.println("============Welcome to Online Bank==============");
        System.out.println("================================================");
        createDatabase();
        bankStart();

    }
}