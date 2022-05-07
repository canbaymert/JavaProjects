package _06_onlineGroceryStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    static Scanner scan = new Scanner(System.in);
    static private final ArrayList<List<String>> products = new ArrayList<>();
    static private final List<String> productNumbers = new ArrayList<>();
    static private final List<String> product = new ArrayList<>();
    static private final List<String> prices = new ArrayList<>();
    static private List<Double> totalPrice = new ArrayList<>();


    public static List<String> getProductNumbers() {
        return productNumbers;
    }

    public static List<String> getProduct() {
        return product;
    }

    public static List<String> getPrices() {
        return prices;
    }

    public static List<Double> getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(List<Double> totalPrice) {
        Database.totalPrice = totalPrice;
    }

    protected static void initializeDatabase() {
        productNumbers.add("0");
        productNumbers.add("1");
        productNumbers.add("2");
        productNumbers.add("3");
        productNumbers.add("4");
        productNumbers.add("5");
        productNumbers.add("6");

        product.add("Tomato");
        product.add("Potato");
        product.add("Pepper");
        product.add("Onion");
        product.add("Carrot");
        product.add("Apple");
        product.add("Strawberry");

        prices.add("€ 1.5 per kg");
        prices.add("€ 2.0 per kg");
        prices.add("€ 2.5 per kg");
        prices.add("€ 0.5 per kg");
        prices.add("€ 3.5 per kg");
        prices.add("€ 1.0 per kg");
        prices.add("€ 4.0 per kg");

        products.add(productNumbers);
        products.add(product);
        products.add(prices);
    }
}