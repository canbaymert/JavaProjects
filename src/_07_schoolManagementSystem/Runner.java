package _07_schoolManagementSystem;

import static _07_schoolManagementSystem.Menu.mainMenu;
import static _07_schoolManagementSystem.Processes.createDatabase;

public class Runner {

    public static void main(String[] args) {
        createDatabase();
        mainMenu();
    }
}

