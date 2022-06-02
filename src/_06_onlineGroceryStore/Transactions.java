package _06_onlineGroceryStore;

import java.util.ArrayList;
import java.util.List;

import static _06_onlineGroceryStore.Menu.mainMenu;

public class Transactions extends Database {
    static private List<Double> total = new ArrayList<>();


    protected static void transactions(int choice, double amount) throws InterruptedException {

        switch (choice) {
            case 0:
                System.out.println(amount + " kg " + getProduct().get(0) + " costs € " + amount * Double.parseDouble(getPrices().get(0).substring(2, 5)));
                willContinue();
                total.add(amount * Double.parseDouble(getPrices().get(0).substring(2, 5)));
                setTotalPrice(total);
                break;
            case 1:
                System.out.println(amount + " kg " + getProduct().get(1) + " costs € " + amount * Double.parseDouble(getPrices().get(1).substring(2, 5)));
                willContinue();
                total.add(amount * Double.parseDouble(getPrices().get(1).substring(2, 5)));
                setTotalPrice(total);
                break;
            case 2:
                System.out.println(amount + " kg " + getProduct().get(2) + " costs € " + amount * Double.parseDouble(getPrices().get(2).substring(2, 5)));
                willContinue();
                total.add(amount * Double.parseDouble(getPrices().get(2).substring(2, 5)));
                setTotalPrice(total);
                break;
            case 3:
                System.out.println(amount + " kg " + getProduct().get(3) + " costs € " + amount * Double.parseDouble(getPrices().get(3).substring(2, 5)));
                willContinue();
                total.add(amount * Double.parseDouble(getPrices().get(3).substring(2, 5)));
                setTotalPrice(total);
                break;
            case 4:
                System.out.println(amount + " kg " + getProduct().get(4) + " costs € " + amount * Double.parseDouble(getPrices().get(4).substring(2, 5)));
                willContinue();
                total.add(amount * Double.parseDouble(getPrices().get(4).substring(2, 5)));
                setTotalPrice(total);
                break;
            case 5:
                System.out.println(amount + " kg " + getProduct().get(5) + " costs € " + amount * Double.parseDouble(getPrices().get(5).substring(2, 5)));
                willContinue();
                total.add(amount * Double.parseDouble(getPrices().get(5).substring(2, 5)));
                setTotalPrice(total);
                break;
            case 6:
                System.out.println(amount + " kg " + getProduct().get(6) + " costs € " + amount * Double.parseDouble(getPrices().get(6).substring(2, 5)));
                willContinue();
                total.add(amount * Double.parseDouble(getPrices().get(6).substring(2, 5)));
                setTotalPrice(total);
                break;
            case -1:
                finishShopping();
                break;
        }
        mainMenu();
    }
    protected static double getAmount() {
        double amount = 0;
        while (true) {
            try {
                System.out.print("How much you want (kg) : ");
                amount = Double.parseDouble(scan.nextLine());
                if (amount < 0) System.out.println("Amount of a product cannot be lower than 0");
                else if (amount == 0) mainMenu();
                else break;
            } catch (NumberFormatException | InterruptedException e) {
                System.out.println("Wrong entry");
            }
        }
        return amount;
    }

    protected static void willContinue() throws InterruptedException {
        String choice = "";
        while (true) {
            System.out.println("Press 'Y' to confirm 'N' to cancel");
            System.out.print("Your choice : ");
            try {
                choice = scan.nextLine();
                if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {
                    break;
                } else throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Wrong entry");
                willContinue();
            }
        }
        if (choice.equalsIgnoreCase("n")) {
            mainMenu();
        }
    }

    protected static void paymentInformation() throws InterruptedException {
        String creditCardNumber, CVC2Number, nameSurname;
        double totalPrice = 0;
        int counter = 0;
        if (getTotalPrice().size() == 0) mainMenu();
        for (int i = 0; i < getTotalPrice().size(); i++) {
            totalPrice += getTotalPrice().get(i);
        }
        System.out.println("The total price : € " + totalPrice);
        String choice = "";
        while (true) {
            System.out.println("Press 'Y' to confirm 'N' to cancel");
            System.out.print("Your choice : ");
            try {
                choice = scan.nextLine();
                if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {
                    break;
                } else throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Wrong entry");
            }
        }
        if (choice.equalsIgnoreCase("n")) {
            total.clear();
            setTotalPrice(total);
            mainMenu();
        }
        while (true) {
            try {
                System.out.print("Please enter your Credit Card Number : ");
                creditCardNumber = scan.nextLine();
                String temp = creditCardNumber;
                temp = temp.replaceAll("\\d", "");
                if (counter == 2) {
                    System.out.println("Too many invalid trials, please try again later");
                    counter = 0;
                    total.clear();
                    setTotalPrice(total);
                    mainMenu();
                }
                if (!temp.equals("")) {
                    System.out.println("Invalid Card Number. Please try again.");
                    counter++;

                } else if (creditCardNumber.length() != 16) {
                    System.out.println("Invalid Card Number. Please try again.");
                    counter++;
                } else break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Card Number. Please try again.");
                counter++;
            }
        }
        counter = 0;
        while (true) {
            try {
                System.out.print("Please enter CVC2 number of your Credit Card Number (3 digits) : ");
                CVC2Number = scan.nextLine();
                String temp = CVC2Number;
                temp = temp.replaceAll("\\d", "");
                if (counter == 2) {
                    System.out.println("Too many invalid trials, please try again later");
                    counter = 0;
                    total.clear();
                    setTotalPrice(total);
                    mainMenu();
                }
                if (!temp.equals("")) {
                    System.out.println("Invalid CVC2 Number. Please try again.");
                    counter++;
                } else if (Integer.parseInt(CVC2Number) < 0) {
                    System.out.println("Invalid CVC2 Number. Please try again.");
                    counter++;
                } else if (CVC2Number.length() != 3) {
                    System.out.println("Invalid CVC2 Number. Please try again.");
                    counter++;
                } else break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid CVC2 Number. Please try again.");
                counter++;
            }
        }
        counter = 0;
        while (true) {
            System.out.print("Please enter Name and Surname information with one blank between them : ");
            nameSurname = scan.nextLine();
            String temp = nameSurname;
            temp = temp.replaceAll("[a-zA-ZüÜıİÖöğĞşŞçÇ ]", "");
            if (counter == 2) {
                System.out.println("Too many invalid trials, please try again later");
                counter = 0;
                total.clear();
                setTotalPrice(total);
                mainMenu();
            }
            if (!temp.equals("")) {
                System.out.println("Invalid information. Please try again.");
                counter++;
            } else if (!nameSurname.contains(" ")) {
                System.out.println("Invalid information. Please try again.");
                counter++;
            } else break;
        }
        counter = 0;
        System.out.println("Your payment is being processed. Please wait...");
        Thread.sleep(3000);
        System.out.println("Your payment has been successfully received.");
        System.out.println("Have a nice day");
        System.exit(0);
    }

    private static void finishShopping() throws InterruptedException {
        if (getTotalPrice().size() == 0) {
            System.out.println("Have a nice day.");
            System.exit(0);
        } else paymentInformation();
    }
}
