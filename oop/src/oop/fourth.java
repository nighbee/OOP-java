package oop;
import java.util.Scanner;
public class fourth {
	public static void main(String[]Args){ 
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(); 
        double b = scanner.nextDouble(); 
        double c = scanner.nextDouble(); 
        double d= b*b - 4*a*c;

        if (d<0){ 
            System.out.println("D is smaller than zero"); 
        }
        else{ 
            double sqrtD = Math.sqrt(d); 
            double root1 = (-b+sqrtD)/(2*a);
            double root2 = (-b-sqrtD)/(2*a);
            System.out.println("root 1: "+root1);
            System.out.println("root 2: "+root2); 
        }
        scanner.close(); 


    }
}
