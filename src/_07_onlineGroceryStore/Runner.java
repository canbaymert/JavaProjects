package _07_onlineGroceryStore;

import static _07_onlineGroceryStore.Transactions.mainMenu;

public class Runner extends Database {
    public static void main(String[] args) throws InterruptedException {
        initializeDatabase();
        mainMenu();
    }
}
