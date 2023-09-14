package oop;
import java.util.Scanner;
public class third {
	public static void main(String[]Args){ 
        Scanner scanner = new Scanner(System.in);
     
        double gpa= scanner.nextDouble(); 
        if (gpa==3.75) {
            System.out.println("A");
        } else if (gpa==4.00) {
            System.out.println("A+");
        } else if (gpa==3.50) {
            System.out.println("B+");
        } else if (gpa==3.00) {
            System.out.println("B");
        } else if (gpa==2.50) {
            System.out.println("C+");
        } else if (gpa==2.00) {
            System.out.println("C");
        } else if (gpa==1.50) {
            System.out.println("D+");
        } else if (gpa==1.00) {
            System.out.println("D");
        } else if (gpa==0) {
            System.out.println("F");
        } 
                        
        }
}
