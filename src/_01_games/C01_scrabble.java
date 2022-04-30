package _01_games;

import java.util.Scanner;

public class C01_scrabble {

    static int player = 1;
    static int pointp1 = 0;
    static int pointp2 = 0;
    static String word = "";
    static String addition = "";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Player " + player + " please enter a word : ");
        word = scan.next();
        changePlayer();
        confirmation();
    }

    public static void confirmation() {
        System.out.println("Word of the opponent : " + word);
        System.out.println("Player " + player + " do you confirm this word ? \n1: Yes \n0: No");
        int choice = 0;
        while (true){
            try {
                choice = scan.nextInt();
                break;
            } catch (Exception inputMismatchException) {
                System.out.println("Wrong input");
                scan.next();
                System.out.println("Player " + player + " do you confirm this word ? \n1: Yes \n0: No");
            }
        }

            if (choice == 1) {
                if (player == 1) {
                    pointp2 += word.length();
                } else pointp1 += word.length();
                willContinue();

            } else finishGame();
    }

    private static void willContinue() {
        System.out.println("Do you want to continue ? " + "\n1: Yes \n0: No");

        int choice = 0;
        while (true){
            try {
                choice = scan.nextInt();
                break;
            } catch (Exception inputMismatchException) {
                System.out.println("Wrong input");
                scan.next();
                System.out.println("Do you want to continue ? " + "\n1: Yes \n0: No");
            }
        }

        if (choice == 1) {
            addWord();
        } else {
            System.out.println("Game Over");
            System.out.println("Point of player 1 : " + pointp1);
            System.out.println("Point of player 2 : " + pointp2);
            if (pointp1 > pointp2) {
                System.out.println("Player 1 wins...");
            } else if (pointp2 > pointp1) {
                System.out.println("Player 2 wins...");
            } else System.out.println("Game is a draw...");
        }
    }

    public static void addWord() {
        System.out.print("Write a letter or a word to add to the old word :");
        addition = scan.next();
        System.out.println("Would you like to add your word to the beginning or to the end of the opponent's word? "
                + "\n1:To the beginning \n0:To the end");
        int choice=0;
        while (true){
            try {
                choice = scan.nextInt();
                break;
            } catch (Exception inputMismatchException) {
                System.out.println("Wrong input");
                scan.next();
                System.out.println("Would you like to add your word to the beginning or to the end of the opponent's word? "
                        + "\n1:To the beginning \n0:To the end");
            }
        }
        if (choice == 1) {
            word = addition + word;
        } else word = word + addition;
        changePlayer();
        confirmation();
    }

    private static void finishGame() {
        System.out.print("Player " + player + " Wins... Opponent wrote an inaccurate word.");
    }

    public static void changePlayer() {
        if (player == 1)
            player = 2;
        else
            player = 1;
    }
}



