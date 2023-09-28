package oop.prac2;
import java.util.Scanner; 
public class StudentTest {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt(); 
		Student student= new Student("Almaz", 123);
		student.setYear(year); 
		System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Year of Study: " + student.getYearOfStudy());
        
        
        student.incrementYearOfStudy();
	}
}
