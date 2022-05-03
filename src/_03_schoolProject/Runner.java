package _03_schoolProject;

import static _03_schoolProject.Processes.createDatabase;
import static _03_schoolProject.Processes.mainMenu;

public class Runner {

    public static void main(String[] args) {
        createDatabase();
        mainMenu();
    }
}

