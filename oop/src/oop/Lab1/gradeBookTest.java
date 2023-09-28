package oop.Lab1;
import java.util.ArrayList; 
import java.util.List;
import oop.prac2.*;
import java.util.Scanner;
public class gradeBookTest {
	public static void main(String[]Args) { 
		Scanner scanner = new Scanner(System.in); 
		 System.out.print("Enter the course name: ");
	        String courseName = scanner.nextLine();

	        System.out.print("Enter the course description: ");
	        String courseDescription = scanner.nextLine();

	        System.out.print("Enter the number of credits: ");
	        int credits = scanner.nextInt();
	        scanner.nextLine();

	        System.out.print("Enter the prerequisite(s): ");
	        String prerequisite = scanner.nextLine();

	        course course = new course(courseName, courseDescription, credits, prerequisite);

	        System.out.print("Enter the number of students: ");
	        int numberOfStudents = scanner.nextInt();
	        scanner.nextLine();

	        List<Student> students = new ArrayList<>();

	        for (int i = 1; i <= numberOfStudents; i++) {
	            System.out.print("Enter the name of student " + i + ": ");
	            String studentName = scanner.nextLine();

	            students.add(new Student(studentName, i));
	        }

	        Gradebook gradeBook = new Gradebook(course, students);

	        System.out.println("Please input grades for students:");

	        for (Student student : students) {
	            System.out.print(student.getName() + ": ");
	            double grade = scanner.nextDouble();
	            gradeBook.addGrade(student, grade);
	        }

	        gradeBook.displayMessage();
	        gradeBook.displayGradeReport();
	    }
	}

