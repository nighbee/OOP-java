package oop.prac2;

public class Student{
    private String name;
    private int id;
    private int yearOfStudy;
    private int grade; 

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
        this.grade=grade; 
    }

    public String getName() {
        return name;
    }

    
    public int getGrade() { 
    	return grade; 
    }
    
    public int getId() {
        return id;
    }
    
    public void setGrade(int grade ) { 
    	this.grade= grade; 
    }
    
    public void setYear(int year) {
    	this.yearOfStudy= year; 
    	
    }
    
    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }
    
    public String toString() { 
    	return "Student " + name + " ( id: " + id + ")"; 
    }
}