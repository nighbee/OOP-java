package oop;
import java.util.Scanner;

public class second {
	public static void main(String[]Args){ 
        Scanner scanner = new Scanner(System.in); 
        double a= scanner.nextDouble(); 
        scanner.close();
        double Area= a*a; 
        double Peri=a*4; 
        double Diag= a*1.4; 
        System.out.println("area:" +Area );
        System.out.println("peri: "+ Peri);
        System.out.println("diagonal: "+Diag);
    }
}
