package oop.prac2; 
import java.util.Scanner;

public class Triangle {
    private int width;

    public Triangle(int width) {
        this.width = width;
    }

    public String toString() {
        StringBuilder triangle = new StringBuilder();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                triangle.append("[*]");
            }
            triangle.append("\n");
        }

        return triangle.toString();
    }

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();

        Triangle small = new Triangle(width);
        System.out.println(small.toString());
    }
}