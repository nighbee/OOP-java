package Lab2.problem1;

public abstract class Cylinder extends Shape {
	private double rad; 
	private double hai; 
	
	public Cylinder() { 
		
	}
	
	public Cylinder( double rad, double hai) {
		this.rad =rad ;
		this.hai= hai; 
	}
	
	public double volume() { 
		return Math.PI*rad*rad*hai; 
	}
	
	public double surfaceArea() {
		 return Math.PI* rad*rad*(rad + hai);
	}
	
	public double weight(double dens) { 
		return volume()* dens; 
	}
}	
