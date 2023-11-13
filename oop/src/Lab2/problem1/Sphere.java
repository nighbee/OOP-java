package Lab2.problem1;

public abstract class Sphere extends Shape {
	private double rad;
	
	public Sphere() { 
	}
	
	public Sphere(double rad) { 
		this.rad= rad ; 
	}
	
	public double volume() { 
		return Math.PI*(4.0/3.0)*rad*rad*rad; 
	}
	public double surfaceArea() { 
		return 4*Math.PI*rad*rad; 
	}
	public double weight(double dens) { 
		return volume()* dens; 
	}

}
