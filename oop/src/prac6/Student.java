package prac6;

//Student class (extends Person)
class Student extends Person {
	 private String studentId;
	 
	 public Student(String name, int age, String studentId) {
	     super(name, age);
	     this.studentId = studentId;
	 }
	 
	 public String getStudentId() {
	     return studentId;
	 }
	 
	 public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	 @Override 
	public void eatPizza() {
	     System.out.println("The student with ID " + studentId + " is enjoying the pizza.");
	 }
	 
	 @Override 
	 public void throwParty() {
	     System.out.println("The student with ID " + studentId + " is throwing a party!");
	 }
	 
	 @Override 
	 public void move() {
	        System.out.println("The student with ID " + studentId + " running to attend lectures.");
	 }
}