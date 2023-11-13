package shit;

public class Circle extends Shape {
	
	public Circle(int pos, Color color) { 
		super(pos, color); 
	}
	@Override
	public void draw() { 
		String symbol = color == Color.RED ? "()": " "; 
		System.err.println(getIndentation()+ symbol); 
		//System.out.println("Drawing a circle at position " + pos + ", color: " + color + ", radius: " + rad);
	}
	
	private String getIndentation() { 
		StringBuilder identation = new StringBuilder(); 
		
		for (int i=0; i<pos; i++) { 
			identation.append(" "); 
		}
		return identation.toString(); 
	}
	
	
}
