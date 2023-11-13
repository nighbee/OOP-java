package Lab2.problem1;

abstract class library {
	private String title; 
	private String author; 
	private int year; 
	
	public library() { 
	}
	
	public library(String title, String author, int year) { 
		this.title = title; 
		this.author= author; 
		this.year= year; 
	}
	
	public String getTitle() { 
		return title; 
	}
	
	public String getAuthor() { 
		return author; 
	}
	
	public int getYear() { 
		return year; 
	}
	
	public void setYear() { 
		this.year=year; 
	}
	
	public void setAuthor() { 
		this.author= author; 
	}
	
	public void setTitle() { 
		this.title= title; 
	}
	
	public abstract  void displayItemDetails();
}
