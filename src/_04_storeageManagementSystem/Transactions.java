package _04_storeageManagementSystem;

import java.util.*;

public class Transactions {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    static HashMap<Integer, Product> products = new HashMap<>();
    static int counter=0;

    public static void mainMenu() {

        System.out.println(Y + "======================= TRANSACTIONS =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   |1-DEFINE A PRODUCT|              |  2-LIST PRODUCTS |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   |3-INCREASE AMOUNT |              |  4-PUT TO STOCK  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   |5-DECREASE AMOUNT |              |      6-EXIT      |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  ");


        try {
            System.out.print(B + "Please choose a transaction : ");
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    defineProduct();
                    System.out.println();
                    listProducts();
                    System.out.println();
                    mainMenu();
                    break;
                case 2:
                    listProducts();
                    System.out.println();
                    mainMenu();
                    break;
                case 3:
                    increaseAmount();
                    System.out.println();
                    listProducts();
                    System.out.println();
                    mainMenu();
                    break;
                case 4:
                    showInStock();
                    System.out.println();
                    listProducts();
                    System.out.println();
                    mainMenu();
                    break;
                case 5:
                    decreaseAmount();
                    System.out.println();
                    listProducts();
                    System.out.println();
                    mainMenu();
                    break;
                case 6:
                    exit();
                    break;
                default:
                    System.out.println(R + "Please enter a number between 1 and 6");
                    System.out.println();
                    mainMenu();
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println(R + "Please enter a number between 1 and 6 ");
            System.out.println();
            mainMenu();
        }
    }


    private static void defineProduct() {
        counter++;
        System.out.println();
        System.out.println(B + "Please enter the asked product information");
        System.out.println();
        System.out.print(B + "Product Name : ");
        String productName = scan.nextLine();
        System.out.println();
        System.out.print(B + "Producer : ");
        String producer = scan.nextLine();
        System.out.println();
        Product pr1 = new Product(productName,producer);
        products.put(Product.getProductID(), pr1);
        Product.setProductID(Product.getProductID()+1);
    }

    public static void listProducts() {
        System.out.println();
        Set<Map.Entry<Integer, Product>> productsSeti = products.entrySet();
        System.out.printf(Y + "%-20s %-20s %-20s %-20s %-20s %-20s\n", "Product ID", "Product Name", "Producer", "Amount", "Department", "Show Available in Stock");
        System.out.println("================================================================================================================================");
        for (Map.Entry<Integer, Product> each : productsSeti) {
            Integer productsKey = each.getKey();
            System.out.printf(G + "%-20s %-20s %-20s %-20s %-20s %-20s", productsKey, each.getValue().getProductName(),
                    each.getValue().getProducer(), each.getValue().getAmount(), each.getValue().getDepartment(),
                    each.getValue().getInStock());
            System.out.println("");
        }
    }

    public static void increaseAmount() {
        if (counter==0){
            System.out.println();
            System.out.println(R+"There isn't any defined products.");
            System.out.println();
            mainMenu();
        }
        int productID = 0, addition = 0;
        while (true) {
            try {
                System.out.println();
                System.out.print(B + "Enter the Product ID : ");
                productID = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println(R + "Wrong entry");
            }
        }
        if (products.containsKey(productID)) {

            while (true) {
                try {
                    System.out.println();
                    System.out.print(B + "Enter the amount of the product that you want to increase : ");
                    addition = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println();
                    System.out.println(R + "Wrong entry");
                }
            }
            products.get(productID).setAmount(addition + products.get(productID).getAmount());

        } else {
            System.out.println();
            System.out.println(R + "The product cannot be found in the system.");
        }

    }

    private static void showInStock() {
        int productID = 0;
        if (counter==0){
            System.out.println();
            System.out.println(R+"There isn't any defined products.");
            System.out.println();
            mainMenu();
        }
        while (true) {
            try {
                System.out.println();
                System.out.print(B + "Enter the Product ID : ");
                productID = Integer.parseInt(scan.nextLine());
                if (products.get(productID).getAmount() == 0) {
                    System.out.println();
                    System.out.println(R + "You don't have enough amount of products to put it to the stock");
                    System.out.println();
                    mainMenu();
                } else break;
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println(R + "Wrong entry");
            }
        }
        if (products.containsKey(productID)) {
            System.out.println();
            System.out.print(B + "Enter the Department : ");
            String department = scan.nextLine();
            products.get(productID).setDepartment(department);
            System.out.println();
           while(true) {
               System.out.println(B + "Do you want the product to be shown available to customers ? (Y or N) : ");
               String availability = scan.nextLine().toLowerCase(Locale.ROOT);
               System.out.println();
               if (availability.charAt(0) != 'y' || availability.charAt(0) != 'n') {
                   System.out.println(R + "Wrong Entry");
                   System.out.println();
               } else if (availability.charAt(0) == 'y'){
                   products.get(productID).setInStock(true);
                   break;
               }
               else {
                   products.get(productID).setInStock(false);
                   break;
               }
           }
        } else {
            System.out.println();
            System.out.println(R + "The product cannot be found in the system.");
        }
    }

    private static void decreaseAmount() {
        if (counter==0){
            System.out.println();
            System.out.println(R+"There isn't any defined products.");
            System.out.println();
            mainMenu();
        }
        int productID = 0, removal = 0;
        while (true) {
            try {
                System.out.println();
                System.out.print(B + "Enter the Product ID : ");
                productID = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println(R + "Wrong entry");
            }
        }
        if (products.containsKey(productID)) {
            while (true) {
                try {
                    System.out.println();
                    System.out.print(B + "Enter the amount of the product that you want to decrease : ");
                    removal = Integer.parseInt(scan.nextLine());
                    if (removal > products.get(productID).getAmount()){
                        System.out.println();
                        System.out.println(R + "Not enough amount.");
                    }
                    else break;
                } catch (NumberFormatException e) {
                    System.out.println();
                    System.out.println(R + "Wrong entry");
                }
            }
            products.get(productID).setAmount(products.get(productID).getAmount() - removal);
            if(products.get(productID).getAmount()==0) {
                products.get(productID).setDepartment("Not Assigned");
                products.get(productID).setInStock(false);
            }
        } else {
            System.out.println();
            System.out.println(R + "The product cannot be found in the system.");
        }
    }
    public static void exit() {
        System.out.println(B + "Have a nice day.");
        System.exit(0);
    }
}
