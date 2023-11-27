package lab3;

public class Robot implements Moveable, Rotatable {
	@Override
	public void move() { 
		System.out.println("moving to spot"); 
	}
	
	@Override 
	public void rotate() { 
		System.out.println("Rotating head to X degree");
	}
}
