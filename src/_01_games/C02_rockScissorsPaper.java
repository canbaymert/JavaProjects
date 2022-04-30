package _01_games;

import java.util.Scanner;

public class C02_rockScissorsPaper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userPoint = 0;
        int cpuPoint = 0;
        String willContinue = "yes";
        int choice = 0;
        int count = 1;

        while (willContinue.equalsIgnoreCase("yes")) {
            if (count == 1) {
                System.out.println("\t\t    _______\r\n"
                        + "\t\t---'   ____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (_____)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)\r\n"
                        + "\t\t\r\n"
                        + "    _______\r\n"
                        + "---'   ____)____\r\n"
                        + "          ______)\r\n"
                        + "          _______)\r\n"
                        + "         _______)\r\n"
                        + "---.__________)\r\n"
                        + "\r\n"
                        + "\t\t    _______\r\n"
                        + "\t\t---'   ____)____\r\n"
                        + "\t\t          ______)\r\n"
                        + "\t\t       __________)\r\n"
                        + "\t\t      (____)\r\n"
                        + "\t\t---.__(___)");

                System.out.println("================================================");
                System.out.println("Welcome to Rock-Scissors-Paper Game ");
                System.out.println("================================================");
                System.out.println("1-Rock 2-Paper 3-Scissors");
                System.out.println("=====================");
            }
            System.out.print("Your Choice : ");
            count = 0;
            while (true){
                try {
                    choice = scan.nextInt();
                    break;
                } catch (Exception inputMismatchException) {
                    System.out.println("Wrong input");
                    scan.next();
                    System.out.print("Your Choice : ");
                }
            }
            int cpuChoice = (int) (Math.random() * 3);
            if (choice == 1) {
                if (cpuChoice == 1) {
                    System.out.println("CPU Choice : Rock ===> Result : Draw");
                    System.out.println("Your point : " + userPoint + " CPU Point : " + cpuPoint);
                } else if (cpuChoice == 2) {
                    System.out.println("CPU Choice : Paper ===> Result : You lost !");
                    cpuPoint++;
                    System.out.println("Your point : " + userPoint + " CPU Point : " + cpuPoint);
                } else {
                    System.out.println("CPU Choice : Scissors ===> Result : You won !");
                    userPoint++;
                    System.out.println("Your point : " + userPoint + " CPU Point : " + cpuPoint);
                }
            } else if (choice == 2) {
                if (cpuChoice == 1) {
                    System.out.println("CPU Choice : Rock ===> Result : You won !");
                    userPoint++;
                    System.out.println("Your point : " + userPoint + " CPU Point : " + cpuPoint);
                } else if (cpuChoice == 2) {
                    System.out.println("CPU Choice : Paper ===> Result : Draw");
                    System.out.println("Your point : " + userPoint + " CPU Point : " + cpuPoint);
                } else {
                    System.out.println("CPU Choice : Scissors ===> Result : You lost !");
                    cpuPoint++;
                    System.out.println("Your point : " + userPoint + " CPU Point : " + cpuPoint);
                }
            } else if (choice == 3) {
                if (cpuChoice == 1) {
                    System.out.println("CPU Choice : Rock ===> Result : You lost !");
                    cpuPoint++;
                    System.out.println("Your point : " + userPoint + " CPU Point : " + cpuPoint);
                } else if (cpuChoice == 2) {
                    System.out.println("CPU Choice : Paper ===> Result : You won !");
                    userPoint++;
                    System.out.println("Your point : " + userPoint + " CPU Point : " + cpuPoint);
                } else {
                    System.out.println("CPU Choice : Scissors ===> Result : Draw");
                    System.out.println("Your point : " + userPoint + " CPU Point : " + cpuPoint);
                }
            } else {
                System.out.println("Wrong input, Please try again.");
                continue;
            }

            if (userPoint == 3) {
                System.out.println("You won !");
                System.out.println("=================================================================");
                System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████\r\n"
                        + "░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███\r\n"
                        + "░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███\r\n"
                        + "░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███\r\n"
                        + "░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\r\n"
                        + "░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\r\n"
                        + "██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\r\n"
                        + "█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\r\n"
                        + "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\r\n"
                        + "░░████████████░░░█████████████████");

                do{
                    System.out.println("==============================================================");
                    System.out.println("Game over. Do you want to continue ? : (yes / no)");
                    System.out.println("==============================================================");
                    willContinue = scan.next();
                    if(willContinue.equalsIgnoreCase("yes")||willContinue.equalsIgnoreCase("no")){
                        break;
                    }
                }
                while(true);

                if (willContinue.equalsIgnoreCase("yes")) {
                    userPoint = 0;
                    cpuPoint = 0;
                    count = 1;
                }

            } else if (cpuPoint == 3) {
                System.out.println("You lost !");
                System.out.println("==================================================================");
                System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\r\n"
                        + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\r\n"
                        + "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\r\n"
                        + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\r\n"
                        + "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\r\n"
                        + "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "\r\n"
                        + "");

                do{
                    System.out.println("==============================================================");
                    System.out.println("Game over. Do you want to continue ? : (yes / no)");
                    System.out.println("==============================================================");
                    willContinue = scan.next();
                    if(willContinue.equalsIgnoreCase("yes")||willContinue.equalsIgnoreCase("no")){
                        break;
                    }
                }
                while(true);

                if (willContinue.equalsIgnoreCase("yes")) {
                    userPoint = 0;
                    cpuPoint = 0;
                    count = 1;
                }
            }
        }
    }
}


