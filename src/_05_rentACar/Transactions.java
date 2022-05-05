package _05_rentACar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transactions extends Car {

    static List<Car> carDemandList = new ArrayList<>();

    static Scanner scan = new Scanner(System.in);

    static int totalDays;

    public static void carDemand() {
        System.out.print("Please enter the city where you demand to receive the car : ");
        String city = scan.nextLine();
        System.out.print("Please enter the day you want to receive the car (DD.MM.YYYY) : ");
        String receivingDay = scan.nextLine();
        System.out.print("Please enter the time you want to receive the car (HH.MM) : ");
        double receivingHour = Double.parseDouble(scan.nextLine());
        System.out.print("Please enter the day you want to deliver the car (DD.MM.YYYY) : ");
        String deliveringDay = scan.nextLine();
        System.out.print("Please enter the time you want to receive the car (HH.MM) : ");
        double deliveringHour = Double.parseDouble(scan.nextLine());

        System.out.println();
        String rDay = receivingDay.substring(0, 2);
        int rDaynum = Integer.parseInt(rDay);
        String rMonth = receivingDay.substring(3, 5);
        int rMonthNum = Integer.parseInt(rMonth);
        String rYear = receivingDay.substring(6);
        int rYearNum = Integer.parseInt(rDay);
        System.out.println("Receiving Date : " + rDaynum + "." + rMonthNum + "." + rYearNum);

        String dDay = receivingDay.substring(0, 2); //12.04
        int dDaynum = Integer.parseInt(dDay);
        String dMonth = receivingDay.substring(3, 5);
        int dMonthNum = Integer.parseInt(dMonth);
        String dYear = receivingDay.substring(6);
        int dYearNum = Integer.parseInt(rDay);
        System.out.println("Delivering Date: " + dDaynum + "." + dMonthNum + "." + dYearNum);

        System.out.println();
        if (rMonthNum > dMonthNum) {
            System.out.println("Receiving date cannot be later than delivering date");
            carDemand();
        } else if (rDaynum > dDaynum) {
            System.out.println("Receiving date cannot be later than delivering date");
            carDemand();
        }
        totalDays = (dMonthNum - rMonthNum) * 30 + (dDaynum - rDaynum);
        System.out.println("Total days : " + totalDays);

    }

    public static void getCar(String brand, String model, String fuelType, String gears, Integer dailyPrice) {
        carDemandList.stream().filter(t -> t.getBrand().equalsIgnoreCase(brand) && t.getModel().equalsIgnoreCase(model) && t.getFuelType().equalsIgnoreCase(fuelType) && t.getGears().equalsIgnoreCase(gears)).forEach(System.out::println);
    }

    public static void wantContinue() throws InterruptedException {
        System.out.println("Press 'Y' to continue.\nPress 'N' to quit.");
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            customerInformation();
        } else if (choice.equalsIgnoreCase("N")) {
            cars();
        }
    }


    public static void cars() throws InterruptedException {

        Car opelDieselAutomatic = new Car("Opel", "Astra", "Diesel", "Automatic", 150);
        Car opelDieselManuel = new Car("Opel", "Astra", "Diesel", "Manuel", 130);
        Car opelGasolineAutomatic = new Car("Opel", "Astra", "Gasoline", "Automatic", 150);
        Car opelGasolineManuel = new Car("Opel", "Astra", "Gasoline", "Manuel", 130);
        Car toyotaDieselAutomatic = new Car("Toyota", "Corolla", "Diesel", "Automatic", 180);
        Car toyotaDieselManuel = new Car("Toyota", "Corolla", "Diesel", "Manuel", 160);
        Car toyotaGasolineAutomatic = new Car("Toyota", "Avensis", "Gasoline", "Automatic", 200);
        Car toyotaGasolineManuel = new Car("Toyota", "Avensis", "Gasoline", "Manuel", 190);
        Car volkswagenDieselAutomatic = new Car("Volkswagen", "Golf", "Diesel", "Automatic", 180);
        Car volkswagenDieselManuel = new Car("Volkswagen", "Golf", "Diesel", "Manuel", 160);
        Car volkswagenGasolineAutomatic = new Car("Volkswagen", "Scirocco", "Gasoline", "Automatic", 200);
        Car volkswagenGasolineManuel = new Car("Volkswagen", "Scirocco", "Gasoline", "Manuel", 190);

        carDemandList.add(opelDieselAutomatic);
        carDemandList.add(opelDieselManuel);
        carDemandList.add(opelGasolineAutomatic);
        carDemandList.add(opelGasolineManuel);
        carDemandList.add(toyotaDieselAutomatic);
        carDemandList.add(toyotaDieselManuel);
        carDemandList.add(toyotaGasolineAutomatic);
        carDemandList.add(toyotaGasolineManuel);
        carDemandList.add(volkswagenDieselAutomatic);
        carDemandList.add(volkswagenDieselManuel);
        carDemandList.add(volkswagenGasolineAutomatic);
        carDemandList.add(volkswagenGasolineManuel);

        System.out.println("\n Please choose the car you want to rent : \n1 : Opel Diesel Automatic " + "\n2 : Opel Diesel Manuel \n3 : Opel Gasoline Automatic \n4 : Opel Gasoline Manuel" + "\n5 : Toyota Diesel Automatic" + "\n6 : Toyota Diesel Manuel\n7 : Toyota Gasoline Automatic" + "\n8 : Toyota Gasoline Manuel\n9 : Volkswagen Diesel Automatic\n10: Volkswagen Diesel Manuel\n11 : Volkswagen Gasoline Automatic" + "\n12 : Volkswagen Gasoline Manuel" + "\n13: Another car request");
        System.out.print("\nYour choice : ");
        int choice = Integer.parseInt(scan.nextLine());
        switch (choice) {
            case 1:
                getCar("Opel", "Astra", "Diesel", "Automatic", 150);
                int totalPrice1 = totalDays * 150;
                System.out.println("Total Price : " + totalPrice1);
                wantContinue();
                break;
            case 2:
                getCar("Opel", "Astra", "Diesel", "Manuel", 130);
                int totalPrice2 = totalDays * 130;
                System.out.println("Total Price : " + totalPrice2);
                wantContinue();
                break;
            case 3:
                getCar("Opel", "Astra", "Gasoline", "Automatic", 150);
                int totalPrice3 = totalDays * 150;
                System.out.println("Total Price : " + totalPrice3);
                wantContinue();
                break;
            case 4:
                getCar("Opel", "Astra", "Gasoline", "Manuel", 130);
                int totalPrice4 = totalDays * 130;
                System.out.println("Total Price : " + totalPrice4);
                wantContinue();
                break;
            case 5:
                getCar("Toyota", "Corolla", "Diesel", "Automatic", 180);
                int totalPrice5 = totalDays * 180;
                System.out.println("Total Price : " + totalPrice5);
                wantContinue();
                break;
            case 6:
                getCar("Toyota", "Corolla", "Diesel", "Manuel", 160);
                int totalPrice6 = totalDays * 160;
                System.out.println("Total Price : " + totalPrice6);
                wantContinue();
                break;
            case 7:
                getCar("Toyota", "Avensis", "Gasoline", "Automatic", 200);
                int totalPrice7 = totalDays * 200;
                System.out.println("Total Price : " + totalPrice7);
                wantContinue();
                break;
            case 8:
                getCar("Toyota", "Avensis", "Gasoline", "Manuel", 190);
                int totalPrice8 = totalDays * 190;
                System.out.println("Total Price : " + totalPrice8);
                wantContinue();
                break;
            case 9:
                getCar("Volkswagen", "Golf", "Diesel", "Automatic", 180);
                int totalPrice9 = totalDays * 180;
                System.out.println("Total Price : " + totalPrice9);
                wantContinue();
                break;
            case 10:
                getCar("Volkswagen", "Golf", "Diesel", "Manuel", 160);
                int totalPrice10 = totalDays * 160;
                System.out.println("Total Price : " + totalPrice10);
                wantContinue();
                break;
            case 11:
                getCar("Volkswagen", "Scirocco", "Gasoline", "Automatic", 200);
                int totalPrice11 = totalDays * 200;
                System.out.println("Total Price : " + totalPrice11);
                wantContinue();
                break;
            case 12:
                getCar("Volkswagen", "Scirocco", "Gasoline", "Manuel", 190);
                int totalPrice12 = totalDays * 190;
                System.out.println("Total Price : " + totalPrice12);
                wantContinue();
                break;
            case 13:
                System.out.print("Please enter a Brand : ");
                String newBrand = scan.nextLine();
                System.out.print("Please enter a Model : ");
                String newModel = scan.nextLine();
                System.out.print("Please enter a Fuel Type : ");
                String newfuelType = scan.nextLine();
                System.out.print("Please enter a Gear Type : ");
                String newGearType = scan.nextLine();
                getCar(newBrand, " " + newModel, " " + newfuelType, " " + newGearType, 250);

                int totalPrice13 = totalDays * 250;
                System.out.println();
                System.out.println("Total Price: " + totalPrice13);
                wantContinue();
                break;
            default:
                System.out.println("Wrong Entry");
        }


    }

    public static void customerInformation() throws InterruptedException {
        System.out.println("Please enter the asked information to register.");
        String name, surname, IDNumber, age, phoneNumber;
        do {
            System.out.print("Name : ");
            name = scan.nextLine();
            String temp = name;
            temp = temp.replaceAll("[a-zA-ZüÜıİÖöğĞşŞçÇ]", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);
        do {
            System.out.print("Surname : ");
            surname = scan.nextLine();
            String temp = surname;
            temp = temp.replaceAll("[a-zA-ZüÜıİÖöğĞşŞçÇ]", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);
        do {
            try {
                System.out.print("Age : ");
                age = scan.nextLine();
                String temp = age;
                temp = temp.replaceAll("\\d", "");
                if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
                else if (Integer.parseInt(age) > 180) {
                    System.out.println("Invalid information. Please try again.");
                } else if (Integer.parseInt(age) < 18) System.out.println("You are too young to rent a car.");
                else break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid information. Please try again.");
            }
        } while (true);
        do {
            try {
                System.out.print("ID number : ");
                IDNumber = scan.nextLine();
                String temp = IDNumber;
                temp = temp.replaceAll("\\d", "");
                if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
                else if (Integer.parseInt(IDNumber) < 0) System.out.println("Invalid information. Please try again.");
                else break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid information. Please try again.");
            }
        } while (true);

        do {
            try {
                System.out.print("Phone Number : ");
                phoneNumber = scan.nextLine();
                String temp = phoneNumber;
                temp = temp.replaceAll("\\d", "");
                if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
                else if (Integer.parseInt(phoneNumber) < 0)
                    System.out.println("Invalid information. Please try again.");
                else break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid information. Please try again.");
            }
        } while (true);

        System.out.println("Name : " + name + "\nSurname : " + surname + "\nAge : " + age + "\nID number : " + IDNumber + "\nPhone number : " + phoneNumber);
        paymentInformation();
        System.out.println();
    }

    public static void paymentInformation() throws InterruptedException {

        String creditCardNumber, CVC2Number, nameSurname;
        do {
            try {
                System.out.print("Please enter your Credit Card Number : ");
                creditCardNumber = scan.nextLine();
                String temp = creditCardNumber;
                temp = temp.replaceAll("\\d", "");
                if (!temp.equals("")) System.out.println("Invalid Card Number. Please try again.");
                else if (Integer.parseInt(creditCardNumber) < 0)
                    System.out.println("Invalid Card Number. Please try again.");
                else if (creditCardNumber.length() != 16) System.out.println("Invalid Card Number. Please try again.");
                else break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Card Number. Please try again.");
            }
        } while (true);
        do {
            try {
                System.out.print("Please enter CVC2 number of your Credit Card Number (3 digits) : ");
                CVC2Number = scan.nextLine();
                String temp = CVC2Number;
                temp = temp.replaceAll("\\d", "");
                if (!temp.equals("")) System.out.println("Invalid CVC2 Number. Please try again.");
                else if (Integer.parseInt(CVC2Number) < 0) System.out.println("Invalid CVC2 Number. Please try again.");
                else if (CVC2Number.length() != 3) System.out.println("Invalid CVC2 Number. Please try again.");
                else break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid CVC2 Number. Please try again.");
            }
        } while (true);
        do {
            System.out.print("Please enter Name and Surname information with one blank between them : ");
            nameSurname = scan.nextLine();
            String temp = nameSurname;
            temp = temp.replaceAll("[a-zA-ZüÜıİÖöğĞşŞçÇ ]", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            if (!nameSurname.contains(" ")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);

        System.out.println("Your payment is being processed. Please wait...");
        Thread.sleep(3000);
        System.out.println("your payment has been successfully received.");
        System.out.println("Have a nice day.");
    }

}


