package pl.kfrak.Car;

/**
 * Created by RENT on 2017-04-28.
 */
public class Car {
    private String brand;
    private String model;
    private String manufactureYear;
    private String power;

    public Car(String opel, String vectra, String s, String s1) {
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

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufactureYear='" + manufactureYear + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
