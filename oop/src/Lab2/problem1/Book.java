package Lab2.problem1;

public class Book extends library {
	public int pages; 
	
	public Book() { 
	}
	
	public Book(String title, String author, int year, int pages) { 
		super(title, author, year); 
		this.pages = pages; 
	}
	
	public int getPages() { 
		return pages; 
	}
	
	public void setPages() { 
		this.pages = pages; 
	}
	
	public void displayItemDetails() { 
		System.out.println("Book Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getYear());
        System.out.println("Page Count: " + pages);
    }
}
