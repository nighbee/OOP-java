package oop.Lab1;

import java.util.Scanner;

public class tempTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the temperature value: ");
//        double temperature = scanner.nextDouble();
//
//        System.out.print("Enter the temperature scale (C or F): ");
//        char scale = scanner.next().charAt(0);

        temp temp = new temp();

        System.out.println("Temperature in Celsius: " + temp.getTempInCelcius());
        System.out.println("Temperature in Fahrenheit: " + temp.getTempInFarh());

//        System.out.print("Enter the new temperature value: ");
//        temperature = scanner.nextDouble();
//
//        System.out.print("Enter the new temperature scale (C or F): ");
//        scale = scanner.next().charAt(0);
//
//        temp.setTemp(temperature);
//        temp.setScale(scale);

        System.out.println("Temperature in Celsius: " + temp.getTempInCelcius());
        System.out.println("Temperature in Fahrenheit: " + temp.getTempInFarh());

//        scanner.close();
    }
}