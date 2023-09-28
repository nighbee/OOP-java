package oop.Lab1; 
public class carTest {
    public static void main(String[] args) {
        car car1 = new car("Toyota", "Camry", 2022);
        car1.displayCarInfo();
        System.out.println("Car Count: " + car.getCarCount());

        car car2 = new car("Honda", "Civic", 2021);
        car2.setColor(car.Color.BLUE);
        car2.displayCarInfo("Additional information");
        System.out.println("Car Count: " + car.getCarCount());
    }
}