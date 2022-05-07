package _00_tasks;

import java.util.Scanner;

public class C04_ticketMachine {
    /*
    Passenger is at City A, the distances to 3 different cities are: 500km to City B, 700km to City C, 900 km to City D.
    Price calculation:
    Price per km : 0.10$
    %50 discount if age is below 12
    %10 discount if age is between 12 and 24
    %30 discount if age is above 65
    %20 discount if it's a return ticket
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price;
        int ticket = 0, age = 0;
        boolean isOneWay = false;
        while (true) {
            System.out.print("Please enter your age : ");
            try {
                age = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong Input");
                continue;
            }
            if (age < 0 || age > 200) System.out.println("Wrong Input");
            else break;
        }
        while (true) {
            System.out.print("One Way:0, Return:1\nYour choice : ");
            try {
                ticket = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong Input");
                continue;
            }
            if (ticket > 1 || ticket < 0) System.out.println("Wrong Input");
            else break;
        }

        if (ticket == 1) isOneWay = true;
        loop:
        while (true) {
            System.out.print("You are at city A\nChoose your destination (B,C,D):");
            String city = scan.nextLine().toUpperCase();
            switch (city) {
                case "B":
                    if (isOneWay) {
                        if (age < 12) price = 700 * 0.1 * 0.5;
                        else if (age <= 24) price = 700 * 0.1 * 0.9;
                        else if (age > 65) price = 700 * 0.1 * 0.7;
                        else price = 700 * 0.1;
                    } else {
                        if (age < 12) price = 1400 * 0.1 * 0.5 * 0.8;
                        else if (age <= 24) price = 1400 * 0.1 * 0.9 * 0.8;
                        else if (age > 65) price = 1400 * 0.1 * 0.7 * 0.8;
                        else price = 1400 * 0.1 * 0.8;
                    }
                    break loop;
                case "C":
                    if (isOneWay) {
                        if (age < 12) price = 500 * 0.1 * 0.5;
                        else if (age <= 24) price = 500 * 0.1 * 0.9;
                        else if (age > 65) price = 500 * 0.1 * 0.7;
                        else price = 500 * 0.1;
                    } else {
                        if (age < 12) price = 1000 * 0.1 * 0.5 * 0.8;
                        else if (age <= 24) price = 1000 * 0.1 * 0.9 * 0.8;
                        else if (age > 65) price = 1000 * 0.1 * 0.7 * 0.8;
                        else price = 1000 * 0.1 * 0.8;
                    }
                    break loop;
                case "D":
                    if (isOneWay) {
                        if (age < 12) price = 900 * 0.1 * 0.5;
                        else if (age <= 24) price = 900 * 0.1 * 0.9;
                        else if (age > 65) price = 900 * 0.1 * 0.7;
                        else price = 900 * 0.1;
                    } else {
                        if (age < 12) price = 1800 * 0.1 * 0.5 * 0.8;
                        else if (age <= 24) price = 1800 * 0.1 * 0.9 * 0.8;
                        else if (age > 65) price = 1800 * 0.1 * 0.7 * 0.8;
                        else price = 1800 * 0.1 * 0.8;
                    }
                    break loop;
                default:
                    System.out.println("You can only travel to City B, City C or City D.");
            }
        }
        System.out.println("Total price you need to pay: $" + price);
    }
}
  


