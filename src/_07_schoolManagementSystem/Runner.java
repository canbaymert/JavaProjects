package _07_schoolManagementSystem;

import static _07_schoolManagementSystem.Processes.createDatabase;
import static _07_schoolManagementSystem.Processes.mainMenu;

public class Runner {

    public static void main(String[] args) {
        createDatabase();
        mainMenu();
    }
}

