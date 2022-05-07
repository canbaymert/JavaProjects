package _06_schoolManagementSystem;

import static _06_schoolManagementSystem.Processes.createDatabase;
import static _06_schoolManagementSystem.Processes.mainMenu;

public class Runner {

    public static void main(String[] args) {
        createDatabase();
        mainMenu();
    }
}

