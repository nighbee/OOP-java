package prac3;

class Student extends Person {
	private int year; 
	private String program; 
	private double fee; 
	
	public Student() { 
		//defo const
	}
	
	public Student(String address, String name, String program, int year, double fee) { 
		super(name, address);
		this.fee=fee; 
		this.program=program; 
		this.year= year; 
		
	}
	
	public String getProgram() { 
		return program; 
	}
	public double  getFee() { 
		return fee; 
	}
	public int getYear() { 
		return year; 
	}
	
	public void setYear() { 
		this.year= year; 
	}
	public void setFee() { 
		this.fee=fee; 
	}
	public void setProgram(){ 
		this.program=program; 
	}
	
	public String toString() { 
		return "Student "+ super.getName() +" Programm "+ program + " year "+ year + " fee "+ fee;   
	}
}
