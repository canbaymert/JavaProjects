package _05_rentACar;

public class Car {
    private String receivingCity;
    private String receivingDay;
    private double receivingHour;
    private String deliveringDay;
    private double deliveringHour;

    private String brand;
    private String model;
    private String fuelType;
    private String gears;
    private double dailyPrice;

    public Car() {
    }

    public Car(String receivingCity, String receivingDay, double receivingHour, String deliveringDay, double deliveringHour) {
        this.receivingCity = receivingCity;
        this.receivingDay = receivingDay;
        this.receivingHour = receivingHour;
        this.deliveringDay = deliveringDay;
        this.deliveringHour = deliveringHour;
    }

    public Car(String brand, String model, String fuelType, String gears, double dailyPrice) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.gears = gears;
        this.dailyPrice = dailyPrice;
    }

    public String getReceivingCity() {
        return receivingCity;
    }

    public void setReceivingCity(String receivingCity) {
        this.receivingCity = receivingCity;
    }

    public String getReceivingDay() {
        return receivingDay;
    }

    public void setReceivingDay(String receivingDay) {
        this.receivingDay = receivingDay;
    }

    public double getReceivingHour() {
        return receivingHour;
    }

    public void setReceivingHour(double receivingHour) {
        this.receivingHour = receivingHour;
    }

    public String getDeliveringDay() {
        return deliveringDay;
    }

    public void setDeliveringDay(String deliveringDay) {
        this.deliveringDay = deliveringDay;
    }

    public double getDeliveringHour() {
        return deliveringHour;
    }

    public void setDeliveringHour(double deliveringHour) {
        this.deliveringHour = deliveringHour;
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
        return "Car{" +
                "receivingCity='" + receivingCity + '\'' +
                ", receivingDay='" + receivingDay + '\'' +
                ", receivingHour=" + receivingHour +
                ", deliveringDay='" + deliveringDay + '\'' +
                ", deliveringHour=" + deliveringHour +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", gears='" + gears + '\'' +
                ", dailyPrice=" + dailyPrice +
                '}';
    }
}
