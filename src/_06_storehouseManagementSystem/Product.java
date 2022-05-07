package _06_storehouseManagementSystem;

public class Product {
    private static int productID=1000;
    private String productName;
    private String producer;
    private int amount;
    private String department = "Not Assigned";
    private boolean inStock;

    public Product() {
    }

    public Product(String productName, String producer) {
        this.productName = productName;
        this.producer = producer;
    }

    public static int getProductID() {
        return productID;
    }

    public static void setProductID(int productID) {
        Product.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProducer() {
        return producer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean getInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", producer='" + producer + '\'' +
                ", amount=" + amount +
                ", department='" + department + '\'' +
                ", inStock='" + inStock + '\'' +
                '}';
    }
}
