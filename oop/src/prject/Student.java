package prject;

import java.util.Comparator;
import java.util.Objects;

public class Student extends User implements Comparable<Student>{
	
	public Integer gpa; 
	public Faculty fac; 
	public Integer yearOfStudy;
	public String degree; 
	
	public Student(String userID, String username, String email, String password) {
		super(userID, username, email, password);
		this.degree= degree; 
		this.fac= fac; 
		this.gpa= gpa; 
	}

	public Integer getGpa() {
		return gpa;
	}

	public void setGpa(Integer gpa) {
		this.gpa = gpa;
	}

	public Faculty getFac() {
		return fac;
	}

	public void setFac(Faculty fac) {
		this.fac = fac;
	}

	public Integer getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(Integer yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(degree, fac, gpa, yearOfStudy);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(degree, other.degree) && fac == other.fac && Objects.equals(gpa, other.gpa)
				&& Objects.equals(yearOfStudy, other.yearOfStudy);
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", fac=" + fac + ", yearOfStudy=" + yearOfStudy + ", degree=" + degree + "]";
	}
	
	public void recommendLetter() { 
		
	}
	
	public boolean markAttendance() {
		return true; 
		
	}
//	public int compareTo(Student other) {
//	     return this.name.compareTo(other.name); // Default sorting by name in ascending order
//	 }
//	

	@Override
	public int compareTo(Student o) {
		return this.gpa.compareTo(o.gpa); 
	}
}
