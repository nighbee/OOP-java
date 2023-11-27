package lab3;
import oop.prac2.*;
import java.util.Collections; 
import java.util.Vector;
public class TestChoco {
		public static void main(String[] args) {
	        // Sort Chocolates
	        Chocolate[] chocolates = {
	                new Chocolate(100, "Twix"),
	                new Chocolate(50, "KitKat"),
	                new Chocolate(80, "Snickers"),
	                new Chocolate(70, "Milky Way")
	        };

	        System.out.println("Before sorting (Chocolates):");
	        for (Chocolate chocolate : chocolates) {
	            System.out.println(chocolate);
	        }

	        Sort.bubbleSort(chocolates);

	        System.out.println("\nAfter sorting (Chocolates):");
	        for (Chocolate chocolate : chocolates) {
	            System.out.println(chocolate);
	        }

	        // Sort Times
	        Time[] times = {
	                new Time(9, 30, 0),
	                new Time(10, 15, 30),
	                new Time(8, 45, 15),
	                new Time(12, 0, 0)
	        };

	        System.out.println("\nBefore sorting (Times):");
	        for (Time time : times) {
	            System.out.println(time);
	        }

	        Sort.bubbleSort(times);

	        System.out.println("\nAfter sorting (Times):");
	        for (Time time : times) {
	            System.out.println(time);
	        }

	      
//	        System.out.println("\nBefore sorting (Employees):");
//	        for (Employee employee : employees) {
//	            System.out.println(employee);
//	        }
//
//	        Collections.sort(employees);
//
//	        System.out.println("\nAfter sorting (Employees):");
//	        for (Employee employee : employees) {
//	            System.out.println(employee);
//	        }
		}
}
