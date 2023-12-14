package prject;

import java.util.Comparator;

class SortedByGpa implements Comparator<Student> {
	 @Override
	 public int compare(Student s1, Student s2) {
	     return Double.compare(s1.getGpa(), s2.getGpa()); // Ascending order for GPA
	 }
	}