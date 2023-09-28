package oop.Lab1;
import oop.prac2.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gradebook {
    private course course;
    private List<Student> students;
    private Map<String, Integer> gradeCount;
    private Map<Student, Double> grades; 
    
    public Gradebook(course course, List<Student> students) {
        this.course = course;
        this.students = students;
        this.gradeCount = new HashMap<>();
        this.grades = new HashMap<>();
    }
    
    public void addGrade(Student student, double grade) {
        grades.put(student, grade);
    }
    
    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    public void displayGradeReport() {
        outputBarChart();
        determineClassAverage();
        determineLowestGrade();
        determineHighestGrade();
    }

    private void outputBarChart() {
        System.out.println("Grades distribution:");
        for (Map.Entry<String, Integer> entry : gradeCount.entrySet()) {
            String gradeRange = entry.getKey();
            int count = entry.getValue();
            System.out.println(gradeRange + ": " + "X".repeat(count));
        }
        System.out.println();
    }

    private void determineClassAverage() {
        int sum = 0;
        int totalStudents = students.size();

        for (Student student : students) {
            sum += student.getGrade();
            updateGradeCount(student.getGrade());
        }

        double average = (double) sum / totalStudents;
        System.out.printf("Class average is %.2f%n", average);
    }

    private void determineLowestGrade() {
        int lowestGrade = Integer.MAX_VALUE;
        Student lowestGradeStudent = null;

        for (Student student : students) {
            int grade = student.getGrade();
            if (grade < lowestGrade) {
                lowestGrade = grade;
                lowestGradeStudent = student;
            }
        }

        System.out.println("Lowest grade is " + lowestGrade + " (" + lowestGradeStudent + ")");
    }

    private void determineHighestGrade() {
        int highestGrade = Integer.MIN_VALUE;
        Student highestGradeStudent = null;

        for (Student student : students) {
            int grade = student.getGrade();
            if (grade > highestGrade) {
                highestGrade = grade;
                highestGradeStudent = student;
            }
        }

        System.out.println("Highest grade is " + highestGrade + " (" + highestGradeStudent + ")");
    }

    private void updateGradeCount(int grade) {
        String gradeRange = getGradeRange(grade);
        int count = gradeCount.getOrDefault(gradeRange, 0);
        gradeCount.put(gradeRange, count + 1);
    }

    private String getGradeRange(int grade) {
        if (grade >= 0 && grade <= 9) {
            return "00-09";
        } else if (grade >= 10 && grade <= 19) {
            return "10-19";
        } else if (grade >= 20 && grade <= 29) {
            return "20-29";
        } else if (grade >= 30 && grade <= 39) {
            return "30-39";
        } else if (grade >= 40 && grade <= 49) {
            return "40-49";
        } else if (grade >= 50 && grade <= 59) {
            return "50-59";
        } else if (grade >= 60 && grade <= 69) {
        	return "60-69"; 
        } else if (grade >= 70 && grade <= 79) {
            return "70-79";
        } else if (grade >= 80 && grade <= 89) {
            return "80-89";
        } else if (grade >= 90 && grade <= 99) {
            return "90-99";
        } else {
            return "100";
        }
    }
}