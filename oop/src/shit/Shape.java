package shit;

abstract class Shape {
	protected int pos; 
	protected Color color; 
	
	public Shape() { 
	}
	
	public Shape(int pos, Color color) { 
		this.pos=pos; 
		this.color= color; 
	}
	
	public abstract void draw(); 
	
	
}
