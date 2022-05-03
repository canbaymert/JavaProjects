package _04_schoolManagementSystem;

import static _04_schoolManagementSystem.Processes.createDatabase;
import static _04_schoolManagementSystem.Processes.mainMenu;

public class Runner {

    public static void main(String[] args) {
        createDatabase();
        mainMenu();
    }
}

