package _03_schoolManagementSystem;

import static _03_schoolManagementSystem.Processes.createDatabase;
import static _03_schoolManagementSystem.Processes.mainMenu;

public class Runner {

    public static void main(String[] args) {
        createDatabase();
        mainMenu();
    }
}

