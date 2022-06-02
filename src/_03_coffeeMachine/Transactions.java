package _03_coffeeMachine;

import java.util.*;


public class Transactions extends Coffee{
    static Map<Integer, String> menu = new HashMap<>();
    static Scanner scan = new Scanner(System.in);


    public void Menu() throws InterruptedException {
        Coffee coffee1 = new Coffee();
        coffee1.setCoffeeName("Espresso");
        coffee1.setCoffeeNo(1);
        Coffee coffee2 = new Coffee();
        coffee2.setCoffeeName("Americano");
        coffee2.setCoffeeNo(2);
        Coffee coffee3 = new Coffee();
        coffee3.setCoffeeName("Mocha");
        coffee3.setCoffeeNo(3);
        Coffee coffee4 = new Coffee();
        coffee4.setCoffeeName("Filter Coffee");
        coffee4.setCoffeeNo(4);
        Coffee coffee5 = new Coffee();
        coffee5.setCoffeeName("Turkish Coffee");
        coffee5.setCoffeeNo(5);
        menu.put(coffee1.getCoffeeNo(), coffee1.getCoffeeName());
        menu.put(coffee2.getCoffeeNo(), coffee2.getCoffeeName());
        menu.put(coffee3.getCoffeeNo(), coffee3.getCoffeeName());
        menu.put(coffee4.getCoffeeNo(), coffee4.getCoffeeName());
        menu.put(coffee5.getCoffeeNo(), coffee5.getCoffeeName());

        chooseCoffee();
    }

    private void chooseCoffee() throws InterruptedException {
        for (Map.Entry<Integer, String> each : menu.entrySet()) {
            System.out.println(each.getKey() + " : " + each.getValue());
        }
        System.out.print("Please choose a drink from the menu : ");

        int choice = 0;
        try {
            choice = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Wrong entry");
            chooseCoffee();
        }

        switch (choice) {
            case 1:
                setCoffeeName(menu.get(1));
                setCoffeeNo(1);
                break;
            case 2:
                setCoffeeName(menu.get(2));
                setCoffeeNo(2);
                break;
            case 3:
                setCoffeeName(menu.get(3));
                setCoffeeNo(3);
                break;
            case 4:
                setCoffeeName(menu.get(4));
                setCoffeeNo(4);
                break;
            case 5:
                setCoffeeName(menu.get(5));
                setCoffeeNo(5);
                break;
            default:
                System.out.println("Wrong Entry");
                chooseCoffee();
        }
        System.out.println("Your choice is " + getCoffeeName());
        chooseSize();
    }

    private void chooseSize() throws InterruptedException {
        System.out.print("1 : Small\n2 : Medium\n3 : Large\nChoose a size : ");
        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                setCoffeeSize("Small");
                break;
            case "2":
                setCoffeeSize("Medium");
                break;
            case "3":
                setCoffeeSize("Large");
                break;
            default:
                System.out.println("Wrong Entry");
                chooseSize();
        }
        System.out.println("Your choice is : " + getCoffeeSize());
        chooseSugar();
    }


    private void chooseSugar() throws InterruptedException {
        System.out.print("1 : No Sugar\n2 : With a little Sugar\n3 : With Sugar\nChoose the sugar amount : ");
        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                setSugar("No Sugar");
                break;
            case "2":
                setSugar("With a little Sugar");
                break;
            case "3":
                setSugar("With Sugar");
                break;
            default:
                System.out.println("Wrong Entry");
                chooseSugar();
        }
        System.out.println("Your choice is : " + getSugar());
        chooseMilk();
    }

    private void chooseMilk() throws InterruptedException {
        System.out.print("1 : Black\n2 : Dark\n3 : White\nChoose the milk amount : ");
        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                setMilk("Black");
                break;
            case "2":
                setMilk("Dark");
                break;
            case "3":
                setMilk("White");
                break;
            default:
                System.out.println("Wrong Entry");
                chooseMilk();
        }
        System.out.println("Your choice is : " + getMilk());
        prepareCoffee();
    }

    private void prepareCoffee() throws InterruptedException {

        System.out.println("Your choice is : "+getCoffeeNo()+" "+getCoffeeName()+" "+getCoffeeSize()+
                " " +getMilk()+" "+getSugar());
        System.out.print("1 : Continue\n2 : Choose another coffee\n3 : Exit\nYour choice : ");
        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Please wait while your coffee is being prepared.");
                Thread.sleep(3000);
                System.out.println("You can take your coffee now. Have a nice day.");
                exit();
                break;
            case "2":
                chooseCoffee();
                break;
            case "3":
                System.out.println("Have a nice day.");
                exit();
                break;
            default:
                System.out.println("Wrong Entry");
                prepareCoffee();
        }
    }

    private void exit() {
        System.exit(0);
    }
}



