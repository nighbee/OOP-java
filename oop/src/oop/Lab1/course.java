package oop.Lab1;

public class course {
	
	private String name; 
	private String desc; 
	private int credits; 
	private String prereq; 
	
	public course( String name, String desc, int credits, String prereq) { 
		this.name =name; 
		this.desc = desc; 
		this.credits=credits ;
		this.prereq = prereq; 
	}
	
	public String getName() { 
		return name; 
	}
	
	public String toSstring() { 
		return "Course " + name+ "\n" 
				+ " Description "+ desc+ "\n"
				+"credits "+ credits + "\n"
				+ "prereqs "+ prereq ;
	}
}
