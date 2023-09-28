package oop.Lab1;
import oop.Lab1.Color; 
public class car {
    private final String brand;
    private final String model;
    private final int year;
    private static int carCount;
  
    public enum Color {
        RED, BLUE, GREEN, YELLOW
    }

    static {
        carCount = 0;
        System.out.println("Initializing the Car class...");
    }

    public car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        carCount++;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static int getCarCount() {
        return carCount;
    }

    public void setColor(Color color) {
        System.out.println("Setting color to: " + color);
    }

    public void setColor(String color) {
        System.out.println("Setting color to: " + color);
    }

    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public void displayCarInfo(String additionalInfo) {
        displayCarInfo();
        System.out.println("Additional Info: " + additionalInfo);
    }
}