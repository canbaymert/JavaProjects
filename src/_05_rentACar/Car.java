package _05_rentACar;

public class Car {
    protected static String receivingDay;
    protected static double receivingTime;
    protected static String deliveringDay;
    protected static double deliveringTime;

    private String brand;
    private String model;
    private String fuelType;
    private String gears;
    private double dailyPrice;

    public Car() {
    }

    public Car(String receivingDay, double receivingTime, String deliveringDay, double deliveringTime) {
        this.receivingDay = receivingDay;
        this.receivingTime = receivingTime;
        this.deliveringDay = deliveringDay;
        this.deliveringTime = deliveringTime;
    }

    public Car(String brand, String model, String fuelType, String gears, double dailyPrice) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.gears = gears;
        this.dailyPrice = dailyPrice;
    }


    public String getReceivingDay() {
        return receivingDay;
    }


    public double getreceivingTime() {
        return receivingTime;
    }


    public String getDeliveringDay() {
        return deliveringDay;
    }


    public double getdeliveringTime() {
        return deliveringTime;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        this.gears = gears;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    @Override
    public String toString() {
        return "Information{" +
                "receivingDay='" + receivingDay + '\'' +
                ", receivingTime=" + receivingTime +
                ", deliveringDay='" + deliveringDay + '\'' +
                ", deliveringTime=" + deliveringTime +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", gears='" + gears + '\'' +
                ", dailyPrice=" + dailyPrice +
                '}';
    }
}
