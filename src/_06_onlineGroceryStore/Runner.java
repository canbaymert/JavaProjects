package _06_onlineGroceryStore;

import static _06_onlineGroceryStore.Menu.mainMenu;

public class Runner extends Database {
    public static void main(String[] args) throws InterruptedException {
        initializeDatabase();
        mainMenu();
    }
}
